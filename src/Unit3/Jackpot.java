package Unit3;

import java.util.Scanner;

public class Jackpot {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        System.out.println("Play - 1");
        System.out.println("Quit - 0");
        System.out.print("Enter your choice: ");
        int option = kb.nextInt();
        int totalPoints = 0;

        while(option == 1){
            //play
            int uno = (int)(Math.random()*6-1+1) + 1;
            int dos = (int)(Math.random()*6-1+1) + 1;
            int tres = (int)(Math.random()*6-1+1) + 1;
            int points;

            if(uno == dos && dos == tres){
                points = 1000;

            }
            else if(uno == dos || uno == tres || dos == tres){
                points = 100;
            }
            else{
                points = 0;
            }

            totalPoints+=points;
            System.out.println(uno + "  " + dos + "  " + tres);
            System.out.println("You got " + points + " points!");
            System.out.println("Your total points are: " + totalPoints);

            System.out.println("Play - 1");
            System.out.println("Quit - 0");
            System.out.print("Enter your choice: ");
            option = kb.nextInt();

        }


            System.out.println("Goodbye");

    }
}

