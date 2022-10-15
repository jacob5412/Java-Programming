/*Create Exception class called BookQuantityNotAvailableException and use it in the
class called “Store” which is described by its bookId title, author, price and
quantityAvailable. Include a method called purchase() taking the purchase quantity as
a parameter and update the quantityAvailable appropriately. Create a package
containing the Store and a Exception class. Write a java program to test the working
of the Store class.*/

import Library.Book;

public class Store {
    public static void main(String args[]) {

        Book b1 = new Book();
        b1.id = "1";
        b1.title = "Harry Potter";
        b1.author = "JKR";
        b1.price = 250;
        b1.quant = 10;

        try {
            b1.purchase(11);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            b1.purchase(9);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
