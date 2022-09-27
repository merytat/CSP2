package Unit1;

public class MsTellezFractions {
    public static void main(String[] args) {
        /*The numerator of the first fraction is 1
        The denominator of the first fraction is 2
        The numerator of the second fraction is 2
        The denominator of the second fraction is 5
        The sum of 1/2 + 2/5 = 9/10
        */

        int num1 = 1;
        int den1 = 2;
        int num2 = 2;
        int den2 = 5;

        System.out.println("The numerator of the first fraction is: " + num1);
        System.out.println("The denominator of the first fraction is: " + den1);
        System.out.println("The numerator of the second fraction is: " + num2);
        System.out.println("The denominator of the second fraction is: " + den2);

        int numFinal;
        int denFinal;
        numFinal = (num1*den2)+(num2*den1);
        denFinal = den1*den2;

        // The sum of 1/2 + 2/5 = 9/10
        System.out.println("Teh sum of " + num1 + "/" + den1 +
                " + " + num2 + "/" + den2 + " = " + numFinal + "/" + denFinal);
    }
}
