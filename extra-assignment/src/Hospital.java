class Patient{
    int id, age;
    String name, addr, num;
    char sex;
    public void getData(int id, int age, String name, String addr, String num, char sex){
        this.id = id;
        this.age = age;
        this.name = name;
        this.addr = addr;
        this.num = num;
        this.sex = sex;
    }
    public void displayData(){
        System.out.println(id + "\n" + name + "\n" + age + "\n" + addr + "\n" + num + "\n" + sex);
    }
}

class inPatient extends Patient{
    int room, numdays;
    float consfee, testfee, rent;
    String admitdate, dischargedate;
    public void getData(int room, float consfee, float testfee, int numdays, float rent, String admitdate, String dischargedate){
        this.room = room;
        this.consfee = consfee;
        this.testfee = testfee;
        this.numdays = numdays;
        this.rent = rent;
        this.admitdate = admitdate;
        this.dischargedate = dischargedate;
    }
    public void displayData(){
        System.out.println(room + "\n" + consfee + "\n" + testfee + "\n" + numdays + "\n" + admitdate + "\n" + dischargedate + "\n" + rent);
    }

}

class Bill extends inPatient{
    String billdate;
    float amt;
    public void getData(String billdate, float amt){
        this.billdate = billdate;
        this.amt = amt;
    }
    public void displayData(){
        System.out.println(billdate + "\n" + amt);
    }
    public void calculateTotalBillAmount(){
        System.out.println(rent*numdays + consfee + testfee + amt);
    }
}

public class Hospital {
    public static void main(String[] args) {
        Patient b = new Bill();
        
    }
}
