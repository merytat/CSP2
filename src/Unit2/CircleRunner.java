package Unit2;

import java.util.Scanner;

public class CircleRunner {
    public static void main(String[] args) {

        Circle c1 = new Circle();
        Circle c2 = new Circle(2.3,"Pink");

        Scanner kb = new Scanner(System.in);

        //change the color for circle 1
        System.out.println("Enter new color");
        String newColor = kb.nextLine();
        c1.changeColor(newColor);

        //print area for circle 2
        System.out.println(c2.calculateArea());

        //call calculatePerimeter
        double perimeter = c2.calculatePerimeter();
        System.out.println(perimeter);


    }
}
