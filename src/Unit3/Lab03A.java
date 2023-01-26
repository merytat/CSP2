package Unit3;

import java.util.Scanner;

public class Lab03A {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = kb.nextLine();
        System.out.print("Enter a String");
        String word = kb.nextLine();

       /* while(sentence.indexOf(word)>= 0){
            int index = sentence.indexOf(word);
              = sentence.substring(0,index) +
                    sentence.substring(index+word.length());

        }
*/
        System.out.println("Sentence: " + sentence);

    }
}
