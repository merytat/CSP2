package Unit2;

public class CODEHS_Oct26_Comment
{
    private String poster;
    private String text;
    private String date;

    public CODEHS_Oct26_Comment(String personPosting, String message, String commentDate)
    {
        poster = personPosting;
        text = message;
        date = commentDate;
    }

    public String toString()
    {
        return text + "\n--" + poster + "(" + date + ")";
    }

    public String getPoster()
    {
        return poster;
    }

    public String getComment()
    {
        return text;
    }

    public String getDate()
    {
        return date;
    }

}
