import java.io.*;
import java.net.*;

public class FirstClient {
    public static void main(String[] args) {
        try{
            Socket s = new Socket("localhost",6666); // binding ip address and port number
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.writeUTF("Hello Server");
            dout.flush();
            dout.close();
            s.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
