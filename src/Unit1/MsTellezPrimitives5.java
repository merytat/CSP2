package Unit1;

public class MsTellezPrimitives5 {
    public static void main(String[] args) {
        //varibales
        int totalEggs = 2106;
        double pricePerDozen = 5.6;
        double pricePerUnit = 0.6;

        int noOfDozens = totalEggs / 12; //
        System.out.println("Total number of dozens: " + noOfDozens);

        int noOfIndivdualEggs = totalEggs % 12;  //6
        double totalPrice = (noOfDozens*pricePerDozen) +
                (noOfIndivdualEggs*pricePerUnit);
        System.out.println("Total Price: " + String.format("%.4f", totalPrice));


    }
}
