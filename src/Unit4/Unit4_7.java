package Unit4;

import java.util.Scanner;

public class Unit4_7 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("How many runs will you record?");
        int noRuns = kb.nextInt();

        double[] runs = new double[noRuns];

        for(int i = 0; i<runs.length; i++){
            System.out.println("Run " + (i+1) + ":");
            runs[i] = kb.nextDouble();
        }

        //finding min algorithm here
        double minValue = runs[0];
        for(int i = 1; i<runs.length; i++){
            if(runs[i] < minValue){
                minValue = runs[i];
            }
        }
        
        System.out.println("Fastest run: " + minValue);
    }
}
