package Unit3;

import java.util.Scanner;

public class FindMedian {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the first integer:");
        int first = kb.nextInt();
        System.out.println("Enter the second integer:");
        int second = kb.nextInt();
        System.out.println("Enter the third integer:");
        int third = kb.nextInt();

        if((first >= second && first <= third) ||
                ((first <= second) && (first >= third))){
            System.out.println("The median is " + first);
        }

        else if(second >= first && second <= third ||
        second <= first && second >= third){
            System.out.println("The median is " + second);
        }

        else{
            System.out.println("The median is " + third);
        }

    }
}
