package Unit2;

import java.util.Scanner;

public class CODEHS_Oct31_WordGameTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Ask for a word
        System.out.println("Enter a word: ");
        String word = input.nextLine();

        CODEHS_Oct31_WordGames games = new CODEHS_Oct31_WordGames(word);

        // Scramble it
        // Print out scrambled word
        System.out.println(games.scramble());

        // Ask for an index
        // Ask for random word
        System.out.println("Enter an integer: ");
        int idx = input.nextInt();
        input.nextLine();
        System.out.println("Enter another word: ");
        word = input.nextLine();


        // Add random word at index
        // Print out the word
        System.out.println(games.bananaSplit(idx, word));


        // Ask for a character
        // Ask for random word
        System.out.println("Enter a character in " + games + ": ");
        String letter = input.nextLine();
        System.out.println("Enter another word: ");
        word = input.nextLine();

        // Add random word at character
        // Print out the word
        System.out.println(games.bananaSplit(letter, word));


    }
}
