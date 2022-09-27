package Unit1;

import java.util.Scanner;

public class Input3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Age: ");
        int age = kb.nextInt();
        kb.nextLine(); //capture the extra enter
        System.out.print("Birthday: ");
        String birthday = kb.nextLine();
        System.out.println();
        System.out.println("You are " +
                age + " years old. On " +
                birthday + " you will be " +
                ++age);
    }
}
