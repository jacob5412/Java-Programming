import java.util.*;

class Sell{
    static Vector phones;

    public Sell(Vector phones){
        this.phones = phones;
    }

    static synchronized void addPhone(String s) {
        if(phones.size()<20){
            phones.add(s);
        }
    }
}

class Stores extends Thread{
    Random rand = new Random();                      // generating a random number
    int max = 750;                                   // max wait time for thread
    int min = 100;                                   // min wait time for thread
    int j;
    Vector phones;
    Sell s;

    public Stores(Vector phones){
        this.phones = phones;
        s = new Sell(phones);
    }

    public void run(){
        try{
            while(phones.size()<20){
                j = rand.nextInt((max - min) + 1) + min;
                System.out.println(this.getName() + " is sleeping for " + j);
                Thread.sleep(j);                    // create random delay between threads

                System.out.println(Thread.currentThread().getName() + " sold a phone");
                s.addPhone(Thread.currentThread().getName());
            }
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}


public class PhonePurchase{
    public static void main(String[] args) {
        Vector phonesSold = new Vector(20);

        Stores A = new Stores(phonesSold);
        A.setName("A");

        Stores F = new Stores(phonesSold);
        F.setName("F");

        Stores E = new Stores(phonesSold);
        E.setName("E");

        A.start();F.start();E.start();
        try{
            A.join();
            F.join();
            E.join();
        }catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println(phonesSold);
        System.out.println(phonesSold.size());
    }
}