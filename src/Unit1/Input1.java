


package Unit1;

//step 1:
import java.util.Scanner;
public class Input1 {
    public static void main(String[] args) {
        //step 2: declare a Scanner variable
        Scanner whatever = new Scanner(System.in);

        //step 3: variables to hold info
        String name;
        String lastname;

        //step 4: use Scanner methods to read from keyboard
        System.out.println("Enter your name: ");
        name = whatever.nextLine();
        System.out.println("Enter your lastname: ");
        lastname = whatever.next();

        //output
        System.out.println("Your full name is: " + name + " " + lastname);

    }
}
