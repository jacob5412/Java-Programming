import java.io.*;
import java.net.*;

public class FirstServer {
    public static void main(String[] args) {
        try{
            ServerSocket ss = new ServerSocket(6666); // port binding
            // accept is blocking call
            // whenever client sends request, this will unblock the server
            // then will create a new socket for the particular client requesting the connection
            Socket s = ss.accept(); // establishing connection
            // input stream to read data from client
            // DataInputStream wraps s.getInputStream
            DataInputStream dis = new DataInputStream(s.getInputStream());
            // reading line
            String str = (String)dis.readUTF();
            // when client sends text, it will read it and print it on screen
            System.out.println("message = " + str);
            ss.close(); // closing socket
        }catch(Exception e){
            System.out.println(e);
        }
    }
}