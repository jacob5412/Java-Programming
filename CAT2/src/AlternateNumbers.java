// Write a Java program to Print alternate numbers using 2 Threads.

class Numbers{
    int n = 0;
    int end;
    Numbers(int end){
        this.end = end;
    }

    synchronized void printEvenNum(){
        while(n<=end){
            if(n%2 == 0){
                System.out.println(Thread.currentThread().getName() + " is printing " + n);
                n++;
                notify();
            }
            else if(n%2 != 0){
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    synchronized void printOddNum(){
        while(n<=end){
            if(n%2 != 0){
                System.out.println(Thread.currentThread().getName() + " is printing " + n);
                n++;
                notify();
            }
            else if(n%2 == 0){
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class AlternateNumbers {
    public static void main(String[] args) {
        final Numbers num = new Numbers(100);

        new Thread(){
            public void run(){
                num.printEvenNum();
            }
        }.start();
        new Thread(){
            public void run(){
                num.printOddNum();
            }
        }.start();
    }
}
