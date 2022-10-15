import java.io.*;
// import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.joda.time.LocalDate;
// import org.joda.time.DateTime;
import org.joda.time.Period;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Donor implements Serializable {
    String name, addr, contact, bldgrp;
    Date date;

    public static void main(String[] args) throws IOException {

        // arraylist for retrieving and adding donors
        ArrayList<Donor> ad = new ArrayList<Donor>();

        int n, i; // counter variables

        // format for date and time
        SimpleDateFormat ft = new SimpleDateFormat("MM-dd-yyyy");
        String temp;

        // patten for blood group
        String pattern = "[A|B|O|AB][+|-]";
        Matcher m;
        Pattern r = Pattern.compile(pattern);

        // delete existing file first
        try {
            Files.deleteIfExists(Paths.get("donations.txt"));
        } catch (NoSuchFileException e) {
            System.out.println("Error: No such file/directory exists");
        } catch (IOException e) {
            System.out.println("Error: Invalid permissions.");
        }
        System.out.println("Success: Deletion successful.");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of donors: ");
        n = sc.nextInt();
        sc.nextLine();
        Donor d;
        System.out.println("----------------------");
        for (i = 0; i < n; i++) {
            d = new Donor(); // initializing new donor
            // taking input from user
            System.out.print("Name: ");
            d.name = sc.nextLine();
            System.out.print("Address: ");
            d.addr = sc.nextLine();
            System.out.print("Contact: ");
            d.contact = sc.nextLine();
            d.bldgrp = "";
            m = r.matcher(d.bldgrp);
            while (!m.find()) {
                System.out.print("Blood Group (only A or B or O or AB [+|-] (all caps): ");
                d.bldgrp = sc.nextLine();
                m = r.matcher(d.bldgrp);
            }
            boolean flag = false;
            while (!flag) {
                System.out.print("Date (MM-dd-yyyy): ");
                temp = sc.nextLine();
                try {
                    d.date = ft.parse(temp);
                    flag = true;
                } catch (ParseException e) {
                    flag = false;
                    System.out.println("Unparseable using " + ft);
                }
            }

            // adding donor object to array list
            ad.add(d);
        }
        try {
            FileOutputStream fos = new FileOutputStream("donations.txt"); // creating file to write to
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            // serialization
            oos.writeObject(ad);
            oos.close();
            fos.close();
            System.out.println("Success: File successfully written");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        // reading data from file
        ad.clear();
        FileInputStream fis = new FileInputStream("donations.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        try {
            ad = (ArrayList<Donor>) ois.readObject();
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }

        // defining current time and period
        LocalDate donor_date;
        LocalDate current = LocalDate.now();
        Period p;

        System.out.println("---------------------------------------------");
        System.out.println("---------------------------------------------");
        // iterating through the arraylist
        System.out.println("\n" + "Donors who haven't donated in 6 months and \"A+\"" + "\n");
        Iterator<Donor> itr = ad.iterator();
        i = 0;
        while (itr.hasNext()) {
            d = new Donor();
            d = (Donor) itr.next();
            donor_date = new LocalDate(d.date);
            p = new Period(donor_date, current);

            // if more than 6 months and blood group is A+, print details
            if ((p.getMonths() > 6 | p.getYears() >= 1) && d.bldgrp.equals("A+")) {
                System.out.println("Donor " + (i + 1));
                System.out.println("----------------------");
                System.out.println(d.name); // name
                System.out.println(d.addr); // address
                System.out.println(d.contact); // contact
                System.out.println(d.bldgrp); // blood group
                System.out.println(d.date); // date
                System.out.println("\n");
            }
        }
    }
}
