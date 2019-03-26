// Java code for Checksum_Receiver
import java.net.*;
import java.io.*;
import java.util.*;

public class Checksum_Receiver {

    // Initialize socket and I/O streams
    private Socket s = null;
    private DataInputStream dis = null;
    private DataOutputStream dos = null;

    // Constructor to put ip address and port
    public Checksum_Receiver(InetAddress ip,int port)throws IOException
    {

        // Opens a socket for connection
        s = new Socket(ip,port);

        dis = new DataInputStream(s.getInputStream());
        dos = new DataOutputStream(s.getOutputStream());

        while (true)
        { Scanner sc = new Scanner(System.in);
            int i, l, nob, sum = 0, chk_sum;

            // Reads the data length sent by sender
            l = dis.readInt();

            // Initializes the arrays based on data length received
            int c_data[] = new int[l];
            int data[] = new int[l];

            System.out.println("Data received (alond with checksum) is");

            for(i = 0; i< data.length; i++)
            {
                // Reading the data being sent one by one
                data[i] = dis.readInt();
                System.out.println(data[i]);

                // Complementing the data being received
                nob = (int)(Math.floor(Math.log(data[i]) / Math.log(2))) + 1;
                c_data[i] = ((1 << nob) - 1) ^ data[i];

                // Adding the complemented data
                sum += c_data[i];
            }
            System.out.println("Sum(in ones complement) is : "+sum);

            // Complementing the sum
            nob = (int)(Math.floor(Math.log(sum) / Math.log(2))) + 1;
            sum = ((1 << nob) - 1) ^ sum;
            System.out.println("Calculated Checksum is : "+sum);

            // Checking whether final result is 0 or something else
            // and sending feedback accordingly
            if(sum == 0)
            {
                dos.writeUTF("success");
                break;
            }
            else
            {
                dos.writeUTF("failure");
                break;
            }
        }

        // Closing all connections
        dis.close();
        dos.close();
        s.close();
    }

    // Driver Method
    public static void main(String args[])throws IOException
    {
        // Getting ip address on which the receiver is running
        // Here, it is "localhost"
        InetAddress ip = InetAddress.getLocalHost();
        Checksum_Receiver cr = new Checksum_Receiver(ip,45678);
    }
}
