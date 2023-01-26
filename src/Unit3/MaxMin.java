package Unit3;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a number or 0 to quit: ");
        int number = kb.nextInt();

        int max = number;
        int min = number;

        while(number>0){
            System.out.println("Results so far: ");
            System.out.println("Largest number: " + max);
            System.out.println("Smallest number: " +min);
            System.out.println("Enter a number or 0 to quit: ");
            number = kb.nextInt();

            if(number > max){
                max = number;
            }
            if(number < min){
                min = number;
            }
        }
    }
}
