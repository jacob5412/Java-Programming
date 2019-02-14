import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Donor {
    String name,addr,contact,bldgrp,date;

    public static void main(String[] args) throws IOException{
        int n, i;

        // delete existing file first
        try{
            Files.deleteIfExists(Paths.get("donations.txt"));
        }
        catch(NoSuchFileException e)
        {
            System.out.println("No such file/directory exists");
        }
        catch(IOException e)
        {
            System.out.println("Invalid permissions.");
        }
        System.out.println("Deletion successful.");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of donors: ");
        n = sc.nextInt();
        sc.nextLine();
        Donor arr[] = new Donor[n];                                // creating array of n donors

        ByteArrayOutputStream outputstream = new ByteArrayOutputStream();
        FileOutputStream fos = new FileOutputStream("donations.txt");    // creating file to write to

        for(i = 0; i < n; i++){
            arr[i] = new Donor();                                  // initializing new donor
            //taking input from user
            System.out.print("Name: ");
            arr[i].name = sc.nextLine();
            System.out.print("Address: ");
            arr[i].addr = sc.nextLine();
            System.out.print("Contact: ");
            arr[i].contact = sc.nextLine();
            System.out.print("Blood Group: ");
            arr[i].bldgrp = sc.nextLine();
            System.out.print("Date: ");
            arr[i].date = sc.nextLine();
            // concatenating all properties in donor object
            // and converting to a byte stream
            outputstream.write(arr[i].name.getBytes());
            outputstream.write("\n".getBytes());
            outputstream.write(arr[i].addr.getBytes());
            outputstream.write("\n".getBytes());
            outputstream.write(arr[i].contact.getBytes());
            outputstream.write("\n".getBytes());
            outputstream.write(arr[i].bldgrp.getBytes());
            outputstream.write("\n".getBytes());
            outputstream.write(arr[i].date.getBytes());
            outputstream.write("\n".getBytes());
            outputstream.write("\n".getBytes());

            // create a byte array to be written
            byte c[] = outputstream.toByteArray();
            fos.write(c);                                          // writing byte array to file
            outputstream.flush();
        }
        fos.close();
    }
}


