package Unit2;

import java.util.Scanner;

public class TestingRandom {
    public static void main(String[] args) {
        System.out.println(Math.random());

        Scanner kb = new Scanner(System.in);
        System.out.println("Enter min:" );
        int min = kb.nextInt();
        System.out.println("Enter max:" );
        int max = kb.nextInt();

        int noOfNPCs = (int)(Math.random()*(max - min + 1) + min);
        System.out.println("There are: " + noOfNPCs + " NPCs");
    }
}
