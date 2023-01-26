package Unit4;

public class MatchingString
{

    //attribute
    private static String[] arr = {"Hello", "Karel", "CodeHS!", "Karel"};

    public static int findString(String myString)
    {
        // your code goes here!
        for(int i=0; i<arr.length; i++){
            if(arr[i].equals(myString)){
                return i;
            }
        }
        return -1;
    }
}

class MatchingStringTester
{
    public static void main(String[] args)
    {
        System.out.println(MatchingString.findString("Karel"));

    }
}
