package Unit2;

public class CODEHS_Oct31_WordGames
{
    private String word;

    public CODEHS_Oct31_WordGames(String text)
    {
        word = text;
    }

    public String scramble()
    {
        // switch first half
        // and second half
        //turtle -> tletur
        int length = word.length();
        int middle = length / 2;

        return word.substring(middle) + word.substring(0, middle);
    }


    public String bananaSplit(int insertIdx, String insertText)
    {
        // Insert insertText at the position
        // insertIdx
        //insertText = BOO, insertIdx = 2 word= ghost = ghBOOost
        return word.substring(0, insertIdx) + insertText + word.substring(insertIdx);
    }


    public String bananaSplit(String insertChar, String insertText)
    {
        // Insert insertText after the first
        // occurence of the insertChar
        //insertText = BOO; insertChar = 'o' text= ghost =  ghBOOost
        int idx = word.indexOf(insertChar);
        return bananaSplit(idx,insertText);
        //return word.substring(0, idx) + insertText + word.substring(idx);
    }


    public String toString()
    {
        // Games[word]
        return "[" + word + "]";
    }


}
