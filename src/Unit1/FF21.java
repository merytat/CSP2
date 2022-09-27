package Unit1;

import java.util.Scanner;

public class FF21 {
    public static void main(String[] args) {
        //input
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter st 13-14:");
        int y13_14 = kb.nextInt();
        System.out.print("Enter st 15-16:");
        int y15_16 = kb.nextInt();
        System.out.print("Enter st 17-18:");
        int y17_18 = kb.nextInt();
        System.out.print("Enter st 19:");
        int y19 = kb.nextInt();
        System.out.print("Enter st 12:");
        int y12 = kb.nextInt();

        //operations calculation
        double totalSt = 890;
        double p13_14 = y13_14/totalSt * 100; //demonstrate that can use casting to avoid int division
        double p15_16 = y15_16/totalSt * 100;
        double p17_18 = y17_18/totalSt * 100;
        double p19 = y19/totalSt * 100;
        double p12 = y12/totalSt * 100;

        //Output a table
        System.out.println("HS Students Title");
        System.out.format("%-10s %-17s %-12s\n", "Age", "No. of Students","Percentage");
        System.out.format("%-10s %-17s %-12s\n", "13-14 yo", y13_14, String.format("%.2f",p13_14) +"%");
        System.out.format("%-10s %-17s %-12s\n", "15-16", y15_16,String.format("%.2f",p15_16) +"%");
        System.out.format("%-10s %-17s %-12s\n", "Age", "No. of Students","Percentage");
        System.out.format("%-10s %-17s %-12s\n", "Age", "No. of Students","Percentage");
        System.out.format("%-10s %-17s %-12s\n", "Age", "No. of Students","Percentage");

        System.out.println();
        double stAcc = (y12+y13_14+y15_16+y17_18+y19);
        System.out.println("Total accounted: " + stAcc);
        System.out.println("perc not accoutned:" + String.format("%.2f",((totalSt-stAcc)/totalSt * 100))+"%");
    }
}
