package Multiples;

import java.rmi.*;
import java.rmi.server.*;
public class ModderRemote extends UnicastRemoteObject implements Modder{
    ModderRemote()throws RemoteException{
        super();
    }
    public String modd(int x,int y){
        if(x%y == 0 || y%x == 0){
            return "True";
        }
        else
            return "False";
    }
}
