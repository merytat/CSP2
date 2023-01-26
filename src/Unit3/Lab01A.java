package Unit3;

import java.util.Scanner;

public class Lab01A {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a text: ");
        String text = kb.nextLine();
        int sum = 0;

        for(int i=0; i<text.length(); i++){
            //charAt
            char letter = text.charAt(i);
            if(Character.isDigit(letter)){
                sum += Integer.parseInt(text.substring(i,i+1));
            }
        }
        System.out.println("Total: " + sum);

    }
}
