package Unit1;

import java.util.Scanner;

public class mlaCitation {
    public static void main(String[] args) {
        //input
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the author's name as 'Last name, First name':");
        String author = kb.nextLine();
        System.out.println("Enter the title of the book:");
        String title = kb.nextLine();
        System.out.println("Enter the publisher of the book:");
        String publisher = kb.nextLine();
        System.out.println("Enter the year the book was published:");
        int year = kb.nextInt();

        //output
        System.out.println(author + ". " + title + ".");
        System.out.println(publisher + ", " + year +".");
    }
}
