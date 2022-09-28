package Unit2;

import java.util.Scanner;

public class BankRunner {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int number = 34;

        //type identifier(name) = new type()
        BankAccount ba1 = new BankAccount();
        BankAccount ba2 = new BankAccount();

        Client client1 = new Client();

        ba1.accountNumber = "S023415";
        ba2.accountNumber = "C134272";

        System.out.println("Account number 1: " +
                ba1.accountNumber);
    }
}
