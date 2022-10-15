import java.util.Vector;

class Attendance {
    static int winners = 0;
    static Vector<Integer> arr = new Vector<>();

    static synchronized void counting(int n) {
        System.out.println(Thread.currentThread().getName() + " is counting");
        for (int i = n - 1000; i < n; i++) {
            if (arr.get(i) == 100)
                winners++;
        }
    }
}

class count extends Thread {
    int n;

    count(int n) {
        this.n = n;
    }

    public void run() {
        Attendance.counting(n);
    }
}

public class VITHonors {
    public static void main(String[] args) {

        int max = 100;
        int min = 75;

        for (int i = 0; i < 2000; i++) {
            int n = (int) (Math.random() * ((max - min) + 1) + min);
            Attendance.arr.add(n);
        }

        Thread t1 = new count(1000);
        Thread t2 = new count(2000);
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println(Attendance.arr);
        System.out.println("Winners are = " + Attendance.winners);

    }
}
