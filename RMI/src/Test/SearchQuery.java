package Test;

// Java program to implement the Search interface
import java.rmi.*;
import java.rmi.server.*;

public class SearchQuery extends UnicastRemoteObject
        implements Search {
    // Default constructor to throw RemoteException
    // from its parent constructor
    SearchQuery() throws RemoteException {
        super();
    }

    // Implementation of the query interface
    public String query(String search)
            throws RemoteException {
        String result;
        if (search.equals("Reflection in Java"))
            result = "Found";
        else
            result = "Not Found";

        return result;
    }
}
