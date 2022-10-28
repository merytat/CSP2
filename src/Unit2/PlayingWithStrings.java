package Unit2;

public class PlayingWithStrings {
    public static void main(String[] args) {

        String text = "Programming is wonderful";
        System.out.println(text.length());

        //substring(firstIndex, lastIndex+1)
        String shortText = text.substring(0,11); //goes form 0-10
        System.out.println(shortText);


    }
}
