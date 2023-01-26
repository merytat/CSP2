package Unit3;

import java.util.Scanner;

public class Berries {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter your order: ");
        String berry = kb.nextLine();

        char berryLetter = berry.charAt(0);
        int order = 2;

        if((berryLetter == 'E') && (order == 2)){
            System.out.println("You ordered 2 Elderberry");
        }
        else if(berryLetter == 'G'){
            System.out.println("You ordered Gooseberry");
        }
        else if(berryLetter == 'L'){
            System.out.println("You ordered Lingonberry");
        }
        else{
            System.out.println("Berry not recognized");
        }
    }
}
