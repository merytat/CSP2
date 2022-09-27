package Unit1;

public class Ff1Blue {
    public static void main(String[] args) {
        //variables
        int hw = 10;
        int sleep = 56;

        int sumHours = hw + sleep;

        //calculation
        double pHw = hw / (double)sumHours;
        double pSleep = sleep / sumHours;

        double hoursNotAccounted = 168-sumHours;

        //output
        System.out.println("Time spent for homework: " + hw);
        System.out.println("Time spent for sleep: " + sleep);
        System.out.println();
        System.out.println("Weekly Time Distribution (168 hours)");
        System.out.format("%-14s %-8s %-12s\n", "Activities", "Hours", "Percentage");
        System.out.format("%-14s %-8s %-12s\n", "Homework", (double)hw, (int)(pHw*100)+"%");
        System.out.format("%-14s %-8s %-12s\n", "Sleep", (double)sleep, (int)(pSleep*100)+"%");
        System.out.println();
        System.out.println("Total hours accounted: " + (int)sumHours);
        System.out.println("Hours not accounted: " + (int)hoursNotAccounted);


    }
}
