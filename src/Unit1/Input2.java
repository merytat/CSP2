package Unit1;

import java.util.Scanner;

public class Input2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        String name;
        int age;
        boolean isAdult;

        System.out.print("Name: ");
        name = kb.nextLine();
        System.out.print("Age: ");
        age = kb.nextInt();
        System.out.print("Adult: ");
        isAdult = kb.nextBoolean();

        System.out.println("It is " + isAdult +
                " that " + name + ", age " +
                age + " is an adult");


        //System.out.println(name + age);

    }
}
