import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class udpBaseServer_2 {
    public static void main(String[] args) throws IOException {
        // Step 1 : Create a socket to listen at port 1234
        DatagramSocket ds = new DatagramSocket(1234);
        byte[] receive = new byte[65535];

        DatagramPacket DpReceive = null;

        // Step 2 : create a DatgramPacket to receive the data.
        DpReceive = new DatagramPacket(receive, receive.length);

        // Step 3 : revieve the data in byte buffer.
        ds.receive(DpReceive);

        System.out.println("Client:-" + data(receive));
        String ls = data(receive).toString();
        int l = Integer.valueOf(ls);

        int i, nob, sum = 0, chk_sum;

        // Initializes the arrays based on data length received
        int c_data[] = new int[l];
        int data[] = new int[l];

        System.out.println("Data received (along with checksum) is");

        for (i = 0; i < data.length; i++) {
            // Step 2 : create a DatgramPacket to receive the data.
            DpReceive = new DatagramPacket(receive, receive.length);
            // Step 3 : revieve the data in byte buffer.
            ds.receive(DpReceive);
            System.out.println("Client : " + data(receive));
            ls = data(receive).toString();
            // Reading the data being sent one by one
            data[i] = Integer.valueOf(ls);

            // Complementing the data being received
            nob = (int) (Math.floor(Math.log(data[i]) / Math.log(2))) + 1;
            c_data[i] = ((1 << nob) - 1) ^ data[i];

            // Adding the complemented data
            sum += c_data[i];
        }
        System.out.println("Sum (in ones complement) is : " + sum);

        // Complementing the sum
        nob = (int) (Math.floor(Math.log(sum) / Math.log(2))) + 1;
        sum = ((1 << nob) - 1) ^ sum;
        System.out.println("Calculated Checksum is : " + sum);

        if (sum == 0) {
            System.out.println("Success!");
        } else {
            System.out.println("Failure");
        }
    }

    // A utility method to convert the byte array
    // data into a string representation.
    public static StringBuilder data(byte[] a) {
        if (a == null)
            return null;
        StringBuilder ret = new StringBuilder();
        int i = 0;
        while (a[i] != 0) {
            ret.append((char) a[i]);
            i++;
        }
        return ret;
    }
}
