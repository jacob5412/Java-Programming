package elections;

import java.util.Vector;

public class count extends Thread{
    Vector vec;
    int k, i;
    public int count = 0;

    public count(int k, Vector vec){
        this.k = k;
        this.vec = vec;
    }

    public void run(){
        try{
            for(i = 0; i < vec.capacity(); i++){
                if(vec.elementAt(i).equals(k))              // check if elements match
                    count++;

            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}