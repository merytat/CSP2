package Unit4;

public class Rectangle {

    private double length;
    private double width;

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle(double l, double width) {
        length = l;
        this.width = width;
    }
    //some setters and getters not shown
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
    public double getArea() {
        return getLength() * getWidth();
    }
    public double getPerimeter() {
        return 2 * (getLength() + getWidth());
    }
    public void printAreaPerimeter() {
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
    @Override
    public String toString() {
        return "Length: " + length + " Width: " + width;
    }
}
