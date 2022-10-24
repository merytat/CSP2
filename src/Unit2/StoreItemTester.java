package Unit2;

import java.util.Scanner;

public class StoreItemTester {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Enter the product name" );
        String name = kb.nextLine();
        System.out.println("Enter the product price" );
        double price = kb.nextDouble();
        kb.nextLine();
        System.out.println("Enter the product unit" );
        String unit = kb.nextLine();
        System.out.println("Enter the product quantity" );
        int quantity = kb.nextInt();
        kb.nextLine();

        StoreItem st1 = new StoreItem(name,price,unit,quantity);

        System.out.println("Item 1" + st1);

        //print the total price for this item
        System.out.println("Total Price: " + st1.getTotalPrice());

        System.out.println("Enter increase: ");
        double increase = kb.nextDouble();
        kb.nextLine();

        st1.increasePrice(increase);
        System.out.println(st1);


        //testing private attributes
        st1.getName()

        System.out.println("Enter the product name" );
        name = kb.nextLine();
        System.out.println("Enter the product price" );
        price = kb.nextDouble();
        kb.nextLine();
        System.out.println("Enter the product unit" );
        unit = kb.nextLine();


        StoreItem st2 = new StoreItem(name,price,unit);


        //Everytime you print an object toString is called
        System.out.println("Item 2\n" + st2);



            }
}
