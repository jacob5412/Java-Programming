import java.io.*;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.joda.time.LocalDate;
import org.joda.time.DateTime;
import org.joda.time.Period;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Donor {
    String name,addr,contact,bldgrp;
    Date date;

    public static void main(String[] args) throws IOException{
        int n, i;
        SimpleDateFormat ft = new SimpleDateFormat("MM-dd-yyyy");
        String temp;
        String pattern = "[A|B|O|AB][+|-]";
        Matcher m;
        Pattern r = Pattern.compile(pattern);

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
            arr[i].bldgrp = "";
            m = r.matcher(arr[i].bldgrp);
            while(!m.find()){
                System.out.print("Blood Group: ");
                arr[i].bldgrp = sc.nextLine();
                m = r.matcher(arr[i].bldgrp);
            }
            boolean flag = false;
            while(!flag){
                System.out.print("Date: ");
                temp = sc.nextLine();
                try {
                    arr[i].date = ft.parse(temp);
                    flag = true;
                } catch (ParseException e) {
                    flag = false;
                    System.out.println("Unparseable using " + ft);
                }
            }


            // concatenating all properties in donor object
            // and converting to a byte stream
            outputstream.write(("Donor " + (i+1) + "\n").getBytes());
            outputstream.write("----------------\n".getBytes());
            outputstream.write("Name: ".getBytes());
            outputstream.write(arr[i].name.getBytes());
            outputstream.write("\n".getBytes());
            outputstream.write("Address: ".getBytes());
            outputstream.write(arr[i].addr.getBytes());
            outputstream.write("\n".getBytes());
            outputstream.write("Contact: ".getBytes());
            outputstream.write(arr[i].contact.getBytes());
            outputstream.write("\n".getBytes());
            outputstream.write("Blood Group: ".getBytes());
            outputstream.write(arr[i].bldgrp.getBytes());
            outputstream.write("\n".getBytes());
            outputstream.write("Date: ".getBytes());
            outputstream.write(arr[i].date.toString().getBytes());
            outputstream.write("\n".getBytes());
            outputstream.write("\n".getBytes());
        }
        // create a byte array to be written
        byte c[] = outputstream.toByteArray();
        fos.write(c);                                          // writing byte array to file
        fos.close();


        // reading data from file
        byte[] fileContent = Files.readAllBytes(Paths.get("donations.txt"));
        String fileInput = new String(fileContent);
        String[] content = fileInput.split("\n");
        Date dt2;
        String[] fileDate, fileGrp;
        SimpleDateFormat ft2 = new SimpleDateFormat("E MMM dd HH:mm:ss z yyyy");
        LocalDate current = LocalDate.now();

        for(i = 5; i < content.length; i += 8){
            fileGrp = content[i].split(": ");
            fileDate = content[i+1].split(": ");
            try {
                dt2 = ft2.parse(fileDate[1]);
                DateTime dt3 = new DateTime(dt2);
                LocalDate dt1 = new LocalDate(dt3);
                Period p = new Period(dt1, current);

                // if more than 6 months and blood group is A+, print details
                System.out.println("\n" + "Donors who haven't donated in 6 months and \"A+\"" + "\n");
                if((p.getMonths() > 6 | p.getYears() >= 1) && fileGrp[1].equals("A+"))
                {
                    System.out.println(content[i-3]); // name
                    System.out.println(content[i-2]); // address
                    System.out.println(content[i-1]); // contact
                    System.out.println(content[i]);   // blood group
                    System.out.println(content[i+1]); // date
                    System.out.println("\n");
                }
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
    }
}


