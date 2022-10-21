package Unit2;

public class Circle {
    private double radius;
    private String color;

    //constructors
    public Circle(){
        this.radius = 1;
        this.color = "black";
    }

    public Circle(double r, String c){
        this.radius = r;
        this.color = c;
    }

    public void doubleRadius(){
        this.radius = radius*2;
    }

    public void changeColor(String newColor){
        this.color = newColor;
    }

    public double calculateArea(){
        double area = Math.PI * Math.pow(radius,2);
        return area;
    }

    public double calculatePerimeter(){
        return 2*Math.PI*radius;
    }
}
