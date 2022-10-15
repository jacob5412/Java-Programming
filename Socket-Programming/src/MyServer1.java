import java.net.*;
import java.io.*;

public class MyServer1 {
    public static void main(String[] args) throws Exception {
        // open socket and bind it 3333
        ServerSocket ss = new ServerSocket(3333);
        // listens until a client asked for a connection
        Socket s = ss.accept();
        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "", str2 = "";

        // read until client says stop
        while (!str.equals("stop")) {
            str = din.readUTF();
            System.out.println("clients says: " + str);
            str2 = br.readLine();
            dout.writeUTF(str2);
            /*
             * The java.io.Writer.flush() method flushes the stream. If the stream has saved
             * any characters from
             * the various write() methods in a buffer, write them immediately to their
             * intended destination.
             */
            dout.flush();
        }
        din.close();
        s.close();
        ss.close();
    }
}
