package Unit4;

import java.util.Scanner;

public class Unit4_6 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("How many grades will you enter?");
        int noGrades = kb.nextInt();

        double[] grades = new double[noGrades];
        double sum = 0;

        for(int i=0; i<grades.length; i++){
            System.out.print("Enter grade " + (i+1));
            grades[i] = kb.nextDouble();
            sum += grades[i];
        }

        System.out.println("Average: " + (sum/grades.length));

    }
}
