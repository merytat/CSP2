package Unit2;

public class CODEHS_Oct26_Messages
{
    public static void main(String[] args)
    {
        CODEHS_Oct26_Comment message1 = new CODEHS_Oct26_Comment("Ada", "haha this is so funny", "06/17/2078");
        CODEHS_Oct26_Comment message2 = new CODEHS_Oct26_Comment("Alan", "this was super useful. thanks for posting!",
                "09/30/2081");

        System.out.println(message1);
        System.out.println(message2);

        System.out.println();
        System.out.println("OP: " + message1.getPoster());
        System.out.println("Text of comment: " + message1.getComment());
        System.out.println("Date of comment: " + message1.getDate());
    }
}
