package Unit1;

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        int num;
        System.out.print("Enter a 2 digit number: ");
        num = kb.nextInt();
        System.out.println();
        System.out.println("Ones-place digit: "
        + num%10);
        System.out.println("Tens-place digit: "
        + num/10);

    }
}
