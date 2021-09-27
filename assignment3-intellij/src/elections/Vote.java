package elections;

import java.util.Random;
import java.util.Vector;

public class Vote extends Thread{
    Random rand = new Random();                      // generating a random number
    int max = 750;                                   // max wait time for thread
    int min = 100;                                   // min wait time for thread
    int v, s;
    Vector vec;

    public Vote(int v, Vector vec)
    {
        this.v = v;
        this.vec = vec;
    }

    public void run() {
        try
        {
            // while voting print id
            while(vec.size() < 240) {               // ensure size of vote vector is below 240
                System.out.println(this.getName() + " is Voting");
                vec.add(v);

                s = rand.nextInt((max - min) + 1) + min;
                System.out.println(this.getName() + " is sleeping for " + s);
                Thread.sleep(s);                    // create random delay between threads
            }

        }
        catch(InterruptedException e)
        {
            System.out.println("Voting Exception: " + e);
        }
    }

}