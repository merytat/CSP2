package Unit1;

import java.util.Scanner;

public class FF22 {
    public static void main(String[] args) {
        //input
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        String fname = kb.nextLine();
        System.out.print("Enter student last name: ");
        String lname = kb.nextLine();
        System.out.print("Enter gender: ");
        String gender = kb.nextLine();
        System.out.print("Enter ID Number: ");
        int id = kb.nextInt();
        kb.nextLine();  //make sure to capture the enter and not have an error

        System.out.println();
        System.out.print("Enter no of books: ");
        int noBooks = kb.nextInt();
        System.out.print("Enter days: ");
        int noDays = kb.nextInt();
        System.out.print("Enter weekly: ");
        double weeklyCharge = kb.nextDouble();
        System.out.print("Enter daily: ");
        double dailyCharge = kb.nextDouble();

        //Calculation
        int weeks = noDays/7;
        int days = noDays%7;

        //output
        System.out.println();
        System.out.println("Stu Information");
        System.out.println("Full name: " + fname + " " + lname);
        System.out.println("Gender: " + gender);
        System.out.println("St ID Number: " + id);
        System.out.println();
        System.out.println("Library account");
        System.out.println("No ob books borrowed: " + noBooks);
        System.out.println("No of weeks elapsed: " + weeks);
        System.out.println("No of days elapsed: " + days);
        System.out.println();
        double wCharges = weeks*weeklyCharge*noBooks;
        System.out.println("Total weekly Charges IDR: " + String.format("%.1f",wCharges) );
        double dCharges = days*dailyCharge*noBooks;
        double total = wCharges + dCharges;

    }
}
