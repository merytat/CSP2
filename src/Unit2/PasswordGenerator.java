package Unit2;

public class PasswordGenerator {

    //attributes - 1 mark
    private int numDigits;
    private String word1;
    private String word2;

    //public PasswordGenerator - 1 mark
    //correct order and correct number of parameters - 1 mark
    public PasswordGenerator(int num, String w1, String w2){
        //assigning all the attributes - 1 mark
        this.numDigits = num;
        this.word1 = w1;
        this.word2 = w2;

    }

    //getters
    //correct signature (return with correct type and no parameters - 1 mark
    public int getNumDigits(){
        //return statement with correct value - 1 mark
        return numDigits;
    }

    //setters
    //correct signature (void, one String parameter) - 1 mark
    public void setWord1(String newWord){
        //assigning the parameter to the attribute - 1 mark
        this.word1 = newWord;
    }

    //toString
    @Override
    //signature (String type and name exactly toString, no parameters) - 1 mark
    public String toString(){
        //having a return statement - 1mark
        //correct String return - 1 mark
        return "["+numDigits+", "+word1+", "+word2+"]";
    }

    //generateNumericPass
    //Signature (return int without parameters) - 1 mark
    public int generateNumericPass(){
        //attempt to calculate max, min - 1 mark
        //correct min and max - 1 mark
        double max = Math.pow(10,numDigits) - 1;
        int min = (int)Math.pow(10,numDigits-1);
        //correctly calculating a random number - 1 mark
        int random = (int)(Math.random()*(max-min+1)+min);
        //returning a value - 1 mark
        return random;
    }

    //generateTextPass
    //signature return String no parameters  - 1 mark
    public String generateTextPass(){
        //1 mark for using substring and length
        //1 mark if you calculate the first half correctly
        String firstHalf = word1.substring(0,word1.length()/2);

        //1 mark for using substring and length
        //1 mark if you calculate the first half correctly
        String secondHalf = word2.substring(word2.length()/2);
        return firstHalf + secondHalf;
    }

    //generatePass
    //signature void no parameters - 1 mark
    public void generatePass(){
        //calculated the numeric part - 1 mark
        int num = generateNumericPass();
        //calculated the text part - 1 mark
        String text = generateTextPass();
        //if you called your previously written methods - 1 mark
        //print statement - 1 mark
        System.out.println(num+text);
    }




}

    /*


Method x 5 per method
15
TOTAL for this Formative
26


}*/
