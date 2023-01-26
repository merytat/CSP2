package Unit3;

import java.util.Scanner;

public class U3FF1 {
    public static void main(String[] args) {
        System.out.println(validateText(3));
        System.out.println("Average: " + calcAverage());
    }

    public static String validateText(int size) {
        //write your code here
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a text of size " + size);
        String text = kb.nextLine(); //1 mark control variable

        while(text.length()!=3){  //1 mark attempt - 2 correct loop
            System.out.println("Enter a text of size " + size);
            text = kb.nextLine(); //1 mark change
        }

        return text;        //1 mark return

    }

    public static double calcAverage() {
        //write your code here
        double total = 0; //1 mark attempt - 2 mark correct
        int count = 0;
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a grade or -1 to finish:");
        double grade = kb.nextDouble();

        while (grade != -1) { //1 mark
            total += grade;
            count++;
            System.out.println("Enter a grade or -1 to finish:");
            grade = kb.nextDouble();
        }

        if(count==0){ //1 mark
            return 0;
        }
        double average = total/count;
        return average; //1 mark
    }


    }

