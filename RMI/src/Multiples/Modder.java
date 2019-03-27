package Multiples;

import java.rmi.*;
public interface Modder extends Remote{
    public String modd(int x,int y)throws RemoteException;
}
