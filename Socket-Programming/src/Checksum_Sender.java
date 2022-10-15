import java.io.*;
import java.net.*;
import java.util.*;

public class Checksum_Sender {
    // Setting maximum data length
    private int MAX = 100;

    // initialize socket and I/O streams
    private Socket socket = null;
    private ServerSocket servsock = null;
    private DataInputStream dis = null;
    private DataOutputStream dos = null;

    public Checksum_Sender(int port) throws IOException {
        servsock = new ServerSocket(port);

        // Used to block until a client connects to the server
        socket = servsock.accept();

        dis = new DataInputStream(socket.getInputStream());
        dos = new DataOutputStream(socket.getOutputStream());

        while (true) {
            int i, l, sum = 0, nob;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter data length");
            l = sc.nextInt();

            // Array to hold the data being entered
            int data[] = new int[MAX];

            // Array to hold the complement of each data
            int c_data[] = new int[MAX];

            System.out.println("Enter data to send");

            for (i = 0; i < l; i++) {
                data[i] = sc.nextInt();

                // Complementing the entered data
                // Here we find the number of bits required to represent
                // the data, like say 8 requires 1000, i.e 4 bits
                nob = (int) (Math.floor(Math.log(data[i]) / Math.log(2))) + 1;

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
            System.out.println("Data being sent along with Checkum.....");

            // Sends the data length to receiver
            dos.writeInt(l);

            // Sends the data one by one to receiver
            for (int j = 0; j < l; j++)
                dos.writeInt(data[j]);

            // Displaying appropriate message depending on feedback received
            if (dis.readUTF().equals("success")) {
                System.out.println("Thanks for the feedback!! Message received Successfully!");
                break;
            }

            else if (dis.readUTF().equals("failure")) {
                System.out.println("Message was not received successfully!");
                break;
            }
        }

        // Closing all connections
        dis.close();
        dos.close();
        socket.close();
    }

    // Driver Method
    public static void main(String args[]) throws IOException {
        Checksum_Sender cs = new Checksum_Sender(45678);
    }
}
