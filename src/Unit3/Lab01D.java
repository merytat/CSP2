package Unit3;

import java.util.Scanner;

public class Lab01D {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        System.out.print("Enter a No from 1-10 or 0 to exit ");
        int number = kb.nextInt();


        while(number != 0 ){
            if(number < 1 || number > 11){
                System.out.println("Error. Try again");
            }
            else{
                if(number!=5){
                    sum+=number;
                }
                else{
                    count++;
                }
            }

            System.out.print("Enter a No from 1-10 or 0 to exit ");
            number = kb.nextInt();

        }

        System.out.println("Total No of 5s: "+count);
        System.out.println("Total: " +sum);

    }
}
