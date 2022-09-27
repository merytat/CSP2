package Unit1;

public class ff1Black {
    public static void main(String[] args) {
        //variables
        double a = 2;
        double b = -5;
        double c = -7;

        //calculation
        double sqrValue = Math.sqrt((Math.pow(b,2)-4*a*c));
        double x1 = (-b + sqrValue)/(2*a);
        double x2 = (-b - sqrValue) / (2*a);

        //output
        System.out.println("Value of a: "+ (int)a);
        System.out.println("Value of b: "+ (int)b);
        System.out.println("Value of c: "+ (int)c);
        System.out.println();
        System.out.println("x1 = "+ x1);

        System.out.println("x2 = "+ x2);
    }
}
