package Unit1;

public class MsTellezPrimitives3 {
    public static void main(String[] args) {
        //declare variables
        int numberOfItems = 10;
        double pricePerItem = 12.3;
        double discount = 0.02;
        //double totalPrice = 120.54; //hard coding
        double totalPrice = (numberOfItems*pricePerItem)*(1-discount);

        //output
        System.out.println("Number of Items: " + numberOfItems);
        System.out.println("Price of Item: " + pricePerItem);
        System.out.println("Discount: " + (int)(discount*100)+"%");
        System.out.print("Total Price: ");
        System.out.printf("$%1.2f",totalPrice);
    }
}
