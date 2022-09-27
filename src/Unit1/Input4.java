package Unit1;

import java.util.Scanner;

public class Input4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name;
        String seg1, seg2, seg3;

        System.out.print("Name: ");
        name = input.nextLine();
        System.out.print("Km segment 1: ");
        seg1 = input.next();
        //Convert Text into numbers
        double numericSeg1 = Double.parseDouble(seg1);
        int a = Integer.parseInt("8"); //unnecessary just to show!
        boolean c = Boolean.parseBoolean("true");

        System.out.print("Km segment 2: ");
        seg2 = input.next();
        double numericSeg2 = Double.parseDouble(seg2);

        System.out.print("Km segment 3: ");
        seg3 = input.next();
        double numericSeg3 = Double.parseDouble(seg3);

        System.out.println();
        System.out.println(name + " total run: " +
                (numericSeg2 + numericSeg1 + numericSeg3));

    }
}
