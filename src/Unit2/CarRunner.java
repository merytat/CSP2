package Unit2;

import java.util.Scanner;

public class CarRunner {
    //ALWAYS A MAIN
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Creating a default car");
        Car c1 = new Car();

        System.out.println("Create a 4 doors car");
        System.out.print("Enter car make");
        String makeInput = kb.nextLine();
        System.out.print("Enter car model");
        String model = kb.nextLine();
        System.out.print("Enter car top speed");
        double topSpeed = kb.nextDouble();
        System.out.print("Enter car price");
        double price = kb.nextDouble();

        Car c2 = new Car(makeInput, model, topSpeed, price);
        Car c3 = new Car("Toyota", "A3", 200, 30000000);

        Car c4 = new Car(3,200, 30000);

        Car c5 = new Car(2,"Toyota", "Corolla");

    }
}
