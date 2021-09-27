/*
 * Copyright (c) 2015, 2018, Oracle and/or its affiliates. All rights reserved.
 *
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License, version 2.0, as published by the
 * Free Software Foundation.
 *
 * This program is also distributed with certain software (including but not
 * limited to OpenSSL) that is licensed under separate terms, as designated in a
 * particular file or component or in included license documentation. The
 * authors of MySQL hereby grant you an additional permission to link the
 * program and your derivative works with the separately licensed software that
 * they have included with MySQL.
 *
 * Without limiting anything contained in the foregoing, this file, which is
 * part of MySQL Connector/J, is also subject to the Universal FOSS Exception,
 * version 1.0, a copy of which can be found at
 * http://oss.oracle.com/licenses/universal-foss-exception.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License, version 2.0,
 * for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin St, Fifth Floor, Boston, MA 02110-1301  USA
 */

package testsuite.x.internal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Supplier;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.mysql.cj.protocol.ColumnDefinition;
import com.mysql.cj.protocol.ResultListener;
import com.mysql.cj.protocol.x.StatementExecuteOk;
import com.mysql.cj.protocol.x.XMessageBuilder;
import com.mysql.cj.protocol.x.XProtocol;
import com.mysql.cj.result.Row;
import com.mysql.cj.xdevapi.DocFilterParams;

/**
 * Tests for protocol-level <b>async</b> APIs against X Plugin via X Protocol.
 */
@Category(testsuite.x.AsyncTests.class)
public class XProtocolAsyncTest extends InternalXBaseTestCase {
    private XProtocol protocol;
    private XMessageBuilder messageBuilder;

    @Before
    public void setupTestProtocol() {
        if (this.isSetForXTests) {
            this.protocol = createAuthenticatedTestProtocol();
            this.messageBuilder = (XMessageBuilder) this.protocol.getMessageBuilder();
        }
    }

    @After
    public void destroyTestProtocol() throws IOException {
        if (this.isSetForXTests) {
            this.protocol.close();
        }
    }

    /**
     * Helper class to hold values across threads and closures.
     */
    public static class ValueHolder<T> implements Consumer<T>, Supplier<T> {
        T val;

        public void accept(T t) {
            this.val = t;
        }

        public T get() {
            return this.val;
        }
    }

    @Test
    public void simpleSuccessfulQuery() throws Exception {
        if (!this.isSetForXTests) {
            return;
        }
        String collName = createTempTestCollection(this.protocol);

        String json = "{'_id': '85983efc2a9a11e5b345feff819cdc9f', 'testVal': 1, 'insertedBy': 'Jess'}".replaceAll("'", "\"");
        this.protocol.send(this.messageBuilder.buildDocInsert(getTestDatabase(), collName, Arrays.asList(new String[] { json }), false), 0);
        this.protocol.readQueryResult();

        final ValueHolder<ColumnDefinition> metadataHolder = new ValueHolder<>();
        final ValueHolder<ArrayList<Row>> rowHolder = new ValueHolder<>();
        rowHolder.accept(new ArrayList<>());
        final ValueHolder<StatementExecuteOk> okHolder = new ValueHolder<>();
        final ValueHolder<Throwable> excHolder = new ValueHolder<>();

        this.protocol.asyncFind(new DocFilterParams(getTestDatabase(), collName), new ResultListener<StatementExecuteOk>() {
            public void onMetadata(ColumnDefinition metadata) {
                metadataHolder.accept(metadata);
            }

            public void onRow(Row r) {
                rowHolder.get().add(r);
            }

            public void onComplete(StatementExecuteOk ok) {
                okHolder.accept(ok);
                synchronized (XProtocolAsyncTest.this) {
                    XProtocolAsyncTest.this.notify();
                }
            }

            public void onException(Throwable t) {
                excHolder.accept(t);
                synchronized (XProtocolAsyncTest.this) {
                    XProtocolAsyncTest.this.notify();
                }
            }
        }, new CompletableFuture<Void>());

        synchronized (this) {
            // timeout in case we get stuck
            this.wait(5000);
        }

        assertEquals(1, metadataHolder.get().getFields().length);
        assertEquals(1, rowHolder.get().size());
        assertNotNull(okHolder.get());
        assertNull(excHolder.get());
    }
}
