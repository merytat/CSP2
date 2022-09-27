package Unit1;

public class MsTellezShapes {
    public static void main(String[] args) {
        String sphereShape = "Sphere";
        double radius = 2.5;
        double volume = 4*Math.PI*Math.pow(radius,3)/3;
        double surface = 4*Math.PI*Math.pow(radius,2);

        System.out.println("Shape: " + sphereShape);
        System.out.println("Enter radius: " + radius);
        System.out.println("Volume of Sphere: " + String.format("%.2f",volume));

        double baseA = 2;
        double baseB = 4;
        double height = 3;
        double area = (baseA + baseB)/2*height;

        System.out.println("Area of trapezoid: " + String.format("%.2f", area));
    }
}
