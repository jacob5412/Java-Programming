import elections.Vote;
import elections.count;
import java.util.Vector;

public class MultiThreadVote {
    public static void main(String[] args) {
        Vector votevec = new Vector(240); // creating a vote array for 240 votes

        Vote a = new Vote(1, votevec);
        a.start();

        Vote b = new Vote(2, votevec);
        b.start();

        Vote c = new Vote(3, votevec);
        c.start();

        try {
            a.join();
            b.join();
            c.join();
            System.out.println("Voting has ended!");
        } catch (Exception e) {
            System.out.println(e);
        }

        count ac = new count(1, votevec);
        count bc = new count(2, votevec);
        count cc = new count(3, votevec);

        ac.start();
        bc.start();
        cc.start();

        try {
            ac.join();
            bc.join();
            cc.join();
            System.out.println("Counting has ended!");
        } catch (Exception e) {
            System.out.println(e);
        }

        int av = ac.count;
        int bv = bc.count;
        int cv = cc.count;

        System.out.println("elections.Vote Vector:" + "\n" + votevec);
        System.out.println(av + " votes for A");
        System.out.println(bv + " votes for B");
        System.out.println(cv + " votes for C");

        if (av >= bv && av >= cv) {
            if (av == bv || av == cv)
                System.out.println("Tie in elections!");
            else
                System.out.println("A has won the elections!");
        } else if (bv >= av && bv >= cv) {
            if (av == bv || bv == cv)
                System.out.println("Tie in elections!");
            else
                System.out.println("B has won the elections!");
        } else if (cv >= av && cv >= bv) {
            if (cv == bv || cv == av)
                System.out.println("Tie in elections!");
            else
                System.out.println("C has won the elections!");
        }
    }
}
