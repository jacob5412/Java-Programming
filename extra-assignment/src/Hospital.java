import java.util.*;

class Patient {
    String pid, name, age, gender, address, mobnumber;

    void getData() {
        Scanner sc = new Scanner(System.in);
        pid = sc.nextLine();
        sc.nextLine();
        name = sc.nextLine();
        sc.nextLine();
        age = sc.nextLine();
        sc.nextLine();
        gender = sc.nextLine();
        sc.nextLine();
        address = sc.nextLine();
        sc.nextLine();
        mobnumber = sc.nextLine();
    }

    void displayData() {
        System.out.println(pid);
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(address);
        System.out.println(mobnumber);
    }
}

class In_patient extends Patient {
    String roomnumber;
    double consultationfee, testfee;
    String doa, dischargedate;
    int numberofdays;
    double roomrent;

    void getData() {
        super.getData();
        Scanner sc = new Scanner(System.in);
        roomnumber = sc.nextLine();
        sc.nextLine();
        consultationfee = sc.nextDouble();
        sc.nextLine();
        testfee = sc.nextDouble();
        sc.nextLine();
        doa = sc.nextLine();
        sc.nextLine();
        dischargedate = sc.nextLine();
        sc.nextLine();
        numberofdays = sc.nextInt();
        sc.nextLine();
        roomrent = sc.nextDouble();
    }

    void displayData() {
        super.displayData();
        System.out.println(roomnumber);
        System.out.println(consultationfee);
        System.out.println(testfee);
        System.out.println(doa);
        System.out.println(dischargedate);
        System.out.println(numberofdays);
        System.out.println(roomrent);
    }
}

class Bill extends In_patient {
    String dateofbill;
    double totalamt;

    void getData() {
        super.getData();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter date of bill");
        dateofbill = sc.nextLine();
    }

    void displayData() {
        super.displayData();
        System.out.println(dateofbill);
    }

    void calculateTotalBillAmount() {
        totalamt = consultationfee + testfee + (numberofdays * roomrent);
        System.out.println("Total amt is : " + totalamt);
    }
}

class Hospital {
    public static void main(String args[]) {
        Bill bill1 = new Bill();
        bill1.getData();
        bill1.displayData();
        bill1.calculateTotalBillAmount();
    }
}