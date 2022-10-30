package Unit2;

public class CODEHS_Oct26_RectangleTester {

    public static void main(String[] args)
    {
        CODEHS_Oct26_Rectangle room = new CODEHS_Oct26_Rectangle(10, 20);
        System.out.println(room);
        System.out.print("Area: ");
        System.out.println(room.getArea());

        System.out.print("Perimeter: ");
        System.out.println(room.getPerimeter());

    }
}
