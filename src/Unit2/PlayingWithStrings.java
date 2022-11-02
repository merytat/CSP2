package Unit2;

public class PlayingWithStrings {
    public static void main(String[] args) {

        String text = "Programming is wonderful and is fun";
        //method length return and int with the number of characters in your string
        System.out.println(text.length());

        //Print the location of the first i
        //using method indexOf - return a int
        System.out.println(text.indexOf("i"));
        System.out.println(text.indexOf("life"));

        //Print the location of the last i
        //using lastIndexOf
        System.out.println(text.lastIndexOf("i"));

        //Check for equality (.equals) returns a boolean
        System.out.println(text.equals("Ms. Tellez"));

        //substring(firstIndex, lastIndex+1)
        //returns a NEW string
        String shortText = text.substring(0,11); //goes form 0-10
        System.out.println(shortText);
        //print the first 4 characters from the text
        String a = text.substring(0,4);
        System.out.println(a);

        //print the LAST 3 characters
        System.out.println(text.substring(text.length()-3,text.length()));

        //method substring with one parameter
        //only asks for the initial point/index
        System.out.println(text.substring(text.length()-3));

        //print the text in uppercase
        System.out.println(text.toUpperCase());

        //print the text in lowercase
        System.out.println(text.toLowerCase());


        //get the second i on text????
        int firsti = text.indexOf("i");
        String withoutFirsti = text.substring(firsti+1);
        System.out.println(withoutFirsti.indexOf("i") + firsti);

        //can you return a string Programming is wonderful and FUN
        System.out.println(text.substring(0,text.length()-3) +
                text.substring(text.length()-3).toUpperCase());


    }
}
