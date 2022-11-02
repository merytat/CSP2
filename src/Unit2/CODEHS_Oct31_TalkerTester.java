package Unit2;

import java.util.Scanner;

public class CODEHS_Oct31_TalkerTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter some text: ");
        String words = input.nextLine();


        CODEHS_Oct31_Talker talky = new CODEHS_Oct31_Talker(words);
        String yelling = talky.outdoorVoice();
        String whispers = talky.indoorVoice();

        System.out.println(talky);
        System.out.println("Yelling: " + yelling);
        System.out.println("Whispering: " + whispers);

    }
}
