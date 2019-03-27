package Multiples;

import java.rmi.*;
import java.rmi.registry.*;
public class MyServer{
    public static void main(String args[]){
        try{
            Modder stub=new ModderRemote();

            // rmiregistry within the server JVM with
            // port number 1900
            LocateRegistry.createRegistry(1900);

            // Binds the remote object by the name
            // sonoo
            Naming.rebind("rmi://localhost:1900" + "/sonoo",stub);
        }catch(Exception e){System.out.println(e);}
    }
}
