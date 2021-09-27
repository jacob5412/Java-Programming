// Java program to illustrate Client side
// Implementation using DatagramSocket
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class udpBaseClient_2
{
    public static void main(String args[]) throws IOException
    {
        // Setting maximum data length
        int MAX = 100;
        Scanner sc = new Scanner(System.in);

        // Step 1:Create the socket object for
        // carrying the data.
        DatagramSocket ds = new DatagramSocket();

        InetAddress ip = InetAddress.getLocalHost();
        byte buf[] = null;

        int i, l, sum = 0, nob;
        System.out.print("Enter data length : ");
        l = sc.nextInt();

        // Array to hold the data being entered
        int data[] = new int[MAX];

        // Array to hold the complement of each data
        int c_data[] = new int[MAX];

        System.out.println("Enter data to send : ");

        for (i = 0; i < l; i++)
        {
            data[i] = sc.nextInt();

            // Complementing the entered data
            // Here we find the number of bits required to represent
            // the data, like say 8 requires 1000, i.e 4 bits
            nob = (int)(Math.floor(Math.log(data[i]) / Math.log(2))) + 1;

            // Here we do a XOR of the data with the number 2^n -1,
            // where n is the nob calculated in previous step
            c_data[i] = ((1 << nob) - 1) ^ data[i];

            // Adding the complemented data and storing in sum
            sum += c_data[i];
        }
        // The sum(i.e checksum) is also sent along with the data
        data[i] = sum;
        l += 1;

        System.out.println("Checksum Calculated is : " + sum);
        System.out.println("Data being sent along with Checksum...");

        // Sends the data length to receiver
        // convert the input into the byte array.
        String temp = Integer.toString(l);
        buf = temp.getBytes();

        // Step 2 : Create the datagramPacket for sending
        // the data.
        DatagramPacket DpSend = new DatagramPacket(buf, buf.length, ip, 1234);

        // Step 3 : invoke the send call to actually send
        // the data.
        ds.send(DpSend);

        // Sends the data one by one to receiver
        for (int j = 0; j < l; j++){
            temp = Integer.toString(data[j]);
            buf = temp.getBytes();
            DpSend = new DatagramPacket(buf, buf.length, ip, 1234);
            ds.send(DpSend);
        }
    }
}
