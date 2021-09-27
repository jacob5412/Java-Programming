package Library;

class InvalidQuantityException extends Exception{
    InvalidQuantityException(String s){
        super(s);
    }
}

public class Book {
    public String id, title, author;
    public float price;
    public int quant;

    public void purchase(int quant) throws Exception{
        if((this.quant - quant) < 0){
            throw new InvalidQuantityException("Quantity cannot be below 0");
        }
        else{
            this.quant = this.quant - quant;
            System.out.println("New quantity is: " + this.quant);
        }
    }
}
