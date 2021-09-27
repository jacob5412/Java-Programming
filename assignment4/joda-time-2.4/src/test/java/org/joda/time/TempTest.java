/*
 *  Copyright 2001-2005 Stephen Colebourne
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.joda.time;

import java.util.Calendar;
import java.util.TimeZone;

import junit.framework.Assert;



/**
 * Test.
 */
public class TempTest {
//    static DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
//    static DateTimeZone NEWYORK = DateTimeZone.forID("America/New_York");

    
    public static void main(String[] args) {
        TimeZone.setDefault(TimeZone.getTimeZone("America/Los_Angeles"));
        DateTimeZone.setDefault(DateTimeZone.forID("America/Los_Angeles"));
        Calendar cLocal = Calendar.getInstance();
        cLocal.set(2014, 0, 31, 16, 0, 0);
        cLocal.set(Calendar.MILLISECOND, 0);
        System.out.format("Local.instant=%d\n", cLocal.getTimeInMillis()); //output: 1391212800000

        Calendar cUTC = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        cUTC.set(2014, 1, 1, 0, 0, 0);
        cUTC.set(Calendar.MILLISECOND, 0);
        System.out.format("UTC.instant=%d\n", cUTC.getTimeInMillis()); //output: 1391212800000

        LocalDate local = new LocalDate(cLocal.getTimeInMillis());
        System.out.println(local + " " + local.getLocalMillis());
        System.out.format("local=%s .instant=%d\n", local.toString(), local.toDate().getTime()); //output: local=2014-01-31 .instant=1391155200000
        LocalDate utc = new LocalDate(cUTC.getTimeInMillis(), DateTimeZone.UTC);
        System.out.println(utc + " " + utc.getLocalMillis());
        System.out.format("utc=%s .instant=%d\n", utc.toString(), utc.toDate().getTime());//output: utc=2014-02-01 .instant=1391241600000

        Period p1 = Period.fieldDifference(utc,local);
        Period p = p1.normalizedStandard(PeriodType.millis()); //java.lang.ArithmeticException: Value cannot fit in an int: 2592000000
        DateTimeZone zone = DateTimeZone.forOffsetMillis(p.getMillis());
        Assert.assertEquals(DateTimeZone.forOffsetHours(-8), zone);        
        
        DateTime dtLocal = new DateTime(2014, 1, 31, 16, 00); //server time
        DateTime dtUTC = new DateTime(2014, 2, 1, 0, 0, DateTimeZone.UTC); //Assume UTC = server+8 hours (actual code uses DateTime.now(DateTimeZone.UTC))

//        LocalDate local = dtLocal.toLocalDate();
//        LocalDate utc = dtUTC.toLocalDate();
//        System.out.println(local);
//        System.out.println(utc);
//
//        Period p = Period.fieldDifference(utc,local).normalizedStandard(PeriodType.millis()); //Throws a java.lang.ArithmeticException: Value cannot fit in an int: xx        
//        System.out.println(p);

//        DateTime dtLocal = new DateTime(2014, 1, 31, 15, 59); //Server time
//        DateTime dtUTC = new DateTime(2014, 1, 31, 12, 59, DateTimeZone.UTC); //Assume UTC = server+8 hours (actual code uses DateTime.now(DateTimeZone.UTC))
//
//        LocalDate local = dtLocal.toLocalDate();
//        LocalDate utc = dtUTC.toLocalDate();
//
//        Period p = Period.fieldDifference(utc,local).normalizedStandard(PeriodType.millis());        
        
        
//        
//        DateTimeZone timeZone = DateTimeZone.forID("America/Havana");
//        long milli = 1352005199998L;
//        MutableDateTime dt = new MutableDateTime(milli, timeZone);
//        // now dt is 2012-11-04T00:59:59.998-04:00
//
//        int year = dt.getYear(); // 2012
//        int month = dt.getMonthOfYear(); // 11
//        int day = dt.getDayOfMonth(); // 4
//
//        Interval theDay = new LocalDate(year, month, day).toInterval(timeZone);
//        // theDay is 2012-11-04T00:00:00.000-05:00/2012-11-05T00:00:00.000-05:00,
//        // which does not include dt.
//        System.out.println(theDay);
//
//        Interval lastDay = new LocalDate(year, month, day-1).toInterval(timeZone);
//        // lastDay is 2012-11-03T00:00:00.000-04:00/2012-11-04T00:00:00.000-05:00
//        // i.e. joda thinks that 2012-11-04T00:59:59.998-04:00 is an instance of 2012-11-3
//        // instead of 2012-11-04
//        System.out.println(lastDay);
        
//        TimeZone.setDefault(TimeZone.getTimeZone("GMT"));
//        DateTimeZone.setDefault(DateTimeZone.forOffsetHoursMinutes(5, 30));
//        DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern("dd/MM/yyyy").withZoneUTC();
//        DateTime dateTime = DateTime.parse("10/06/2014", dateTimeFormatter).toDateTime(DateTimeZone.UTC);
//        System.out.println(dateTime.getZone());
//        long value = dateTime.getMillis()/1000;
//        System.out.println(dateTime);
//        System.out.println(value);
//        System.out.println(new Date(value * 1000));

//        parseDate("dd/MM/yyyy", "10/06/2014") giving me 1402338600
//        which is
//        GMT: Mon, 09 Jun 2014 18:30:00 GMT
//        Your time zone: 6/10/2014 12:00:00 AM GMT+5.5        

//        System.out.println(new LocalDate(ISOChronology.getInstanceUTC()));
//        System.out.println(new LocalDate(CopticChronology.getInstanceUTC()));
//        System.out.println(new LocalDate(EthiopicChronology.getInstanceUTC()));
//        
//        LocalDate coptic = new LocalDate(1, 1, 1, CopticChronology.getInstanceUTC());
//        System.out.println(coptic);
//        System.out.println(coptic.toDateTimeAtStartOfDay(DateTimeZone.UTC).withChronology(ISOChronology.getInstanceUTC()).toLocalDate());
//        
//        LocalDate ethiopic = new LocalDate(1, 1, 1, EthiopicChronology.getInstanceUTC());
//        System.out.println(ethiopic);
//        System.out.println(ethiopic.toDateTimeAtStartOfDay(DateTimeZone.UTC).withChronology(ISOChronology.getInstanceUTC()).toLocalDate());
        
//        DateTimeZone tz = DateTimeZone.forID("America/Argentina/Buenos_Aires");
//        DateTimeZone.setDefault(tz);
//        DateTimeFormatter df = DateTimeFormat.forPattern("EEE, dd MMM yyyy HH:mm:ss zzz");
//
//        df.parseMillis(df.print(System.currentTimeMillis()));
        
//        DateTimeZone branco = DateTimeZone.forID("America/Rio_Branco");
//        System.out.println(branco);
//        Instant old = new Instant(0L);
//        Instant i = new Instant(branco.nextTransition(old.getMillis()));
//        while (old.equals(i) == false) {
//            System.out.println(i);
//            old = i;
//            i = new Instant(branco.nextTransition(old.getMillis()));
//        }
//        
//        DateTime dt = new DateTime(2008, 6, 23, 23, 0, branco);
//        System.out.println(dt);
//        dt = dt.plusMinutes(30);
//        System.out.println(dt);
//        dt = dt.plusMinutes(30);
//        System.out.println(dt);
//        dt = dt.plusMinutes(30);
//        System.out.println(dt);
//        dt = dt.plusMinutes(30);
//        System.out.println(dt);
//        dt = dt.plusMinutes(30);
//        System.out.println(dt);
//        dt = dt.plusMinutes(30);
//        System.out.println(dt);
//        dt = dt.plusMinutes(30);
//        System.out.println(dt);
        
        
        
//        DateTimeZone HONG_KONG_TZ = DateTimeZone.forID("Asia/Hong_Kong");
//        DateTime date1 = new DateTime(2013, 10, 2, 11, 30, 53, 512, HONG_KONG_TZ);
//        DateTime date2 = date1.toDateTime(DateTimeZone.UTC);
//        System.out.println(date1);
//        System.out.println(date2);
//
//        System.out.println(date1.compareTo(date2));
//        System.out.println(date1.toLocalDate().compareTo(date2.toLocalDate()));
//        System.out.println(DateTimeComparator.getInstance().compare(date1, date2));
//        System.out.println(DateTimeComparator.getDateOnlyInstance().compare(date1, date2));
//        System.out.println(DateTimeComparator.getDateOnlyInstance().compare(date1, date1.plusMinutes(1)));
        
//        TimeZone jdkMST = TimeZone.getTimeZone("MST");
//        TimeZone jdkDenver = TimeZone.getTimeZone("America/Denver");
//        DateTimeZone mst = DateTimeZone.forTimeZone(jdkMST);
//        DateTimeZone mst2 = DateTimeZone.forID(jdkMST.getID());
//        System.out.println(jdkMST);
//        jdkMST.setID("America/Denver");
//        System.out.println(jdkMST);
//        System.out.println(jdkDenver);
//        System.out.println(jdkDenver.equals(jdkMST));
//        System.out.println(jdkMST.getID());
//        System.out.println(mst.getID() + (mst.isFixed() ? " Fixed" : " DST"));
//        System.out.println(mst2.getID() + (mst2.isFixed() ? " Fixed" : " DST"));
//        DateTimeZone m = DateTimeZone.forID("MST7MDT");
//        System.out.println(m + (m.isFixed() ? " Fixed" : " DST"));
        
//        System.out.println(DateTimeFormat.forPattern("s").print(321234));
//        System.out.println(DateTimeFormat.forPattern("ss").print(321234));
//        System.out.println(DateTimeFormat.forPattern("sss").print(321234));
//        System.out.println(DateTimeFormat.forPattern("S").print(321234));
//        System.out.println(DateTimeFormat.forPattern("SS").print(321234));
//        System.out.println(DateTimeFormat.forPattern("SSS").print(321234));
//        System.out.println(DateTimeFormat.forPattern("SSSS").print(321234));
//        
        
//        DateTimeFormatter f = DateTimeFormat.forPattern("M d").withLocale(Locale.UK);
//        MutableDateTime result = new MutableDateTime(2000, 1, 1, 0, 0, 0, 0, NEWYORK);
//        System.out.println("4 = " + f.parseInto(result, "2 29", 0));
//        System.out.println("" + new MutableDateTime(2000, 2, 29, 0, 0, 0, 0, NEWYORK) + " = " + result);        
        
//        Chronology chronology = GJChronology.getInstance();
//
//        LocalDate start = new LocalDate(2013, 5, 31, chronology);
//        LocalDate expectedEnd = new LocalDate(-1, 5, 31, chronology); // 1 BC
////        System.out.println(expectedEnd.plusYears(2013).equals(start));
//        System.out.println(start.minusYears(2013).equals(expectedEnd));
////        System.out.println(start.plus(Period.years(-2013)).equals(expectedEnd));
        

//        Period p1 = new Period(5L, PeriodType.hours());
//        System.out.println(p1);
//        String string = p1.toString();
//        System.out.println(string);
//        Period p2 = Period.parse(string);
//        System.out.println(p2);

//        Locale.setDefault(Locale.CHINA);
//        TimeZone sTimeZone = java.util.TimeZone.getTimeZone("GMT-01:00");
//        System.out.println(Locale.getDefault());
//        System.out.println(sTimeZone.getDisplayName());
//        DateTimeZone dtz = DateTimeZone.forTimeZone(sTimeZone);
//        System.out.println(dtz.getID());        
        
//        DateTime n = DateTime.now();
//        final DateTime now = n.toDateTimeISO();
//        final DateTime parsed = DateTime.parse(now.toString()).withZone(null);
//        final DateTime parsed2 = new DateTime(now.toString());
//        System.out.println(now.getZone() + " " +  parsed.getZone());
//        System.out.println(now + " " +  parsed);
//        System.out.println(now.getZone() + " " +  parsed2.getZone());
//        System.out.println(now + " " +  parsed2);
//        
//        MutableDateTime time = new MutableDateTime(DateTimeZone.forOffsetHours(1));
////        time.setZone(DateTimeZone.forOffsetHours(1));
//        time.setRounding(time.getChronology().dayOfMonth(), MutableDateTime.ROUND_FLOOR);
//
//        MutableDateTime utcTime = new MutableDateTime(DateTimeZone.UTC);
//        utcTime.setRounding(utcTime.getChronology().dayOfMonth(), MutableDateTime.ROUND_FLOOR);
//
//        time.setMillis(90000);
//        utcTime.setMillis(90000);
//        System.out.println("time: " + time + ", utc " + utcTime);
//        System.out.println("time_millis: " + time.getMillis() + ", utc_millis " + utcTime.getMillis());
//        
////        MutableDateTime time = new MutableDateTime(DateTimeZone.forOffsetHours(1));
//////        time.setZone(DateTimeZone.forOffsetHours(1));
////        time.setRounding(time.getChronology().minuteOfHour(), MutableDateTime.ROUND_FLOOR);
////
////        MutableDateTime utcTime = new MutableDateTime(DateTimeZone.UTC);
////        utcTime.setRounding(utcTime.getChronology().minuteOfHour(), MutableDateTime.ROUND_FLOOR);
////
////        time.setMillis(90000);
////        utcTime.setMillis(90000);
////        System.out.println("time: " + time + ", utc " + utcTime);
////        System.out.println("time_millis: " + time.getMillis() + ", utc_millis " + utcTime.getMillis());
    }

}
