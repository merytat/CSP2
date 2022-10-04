package Unit2;

public class Pinata {
    // Instance variables
    private String candy;    // what kind of candy is inside
    private String color;
    private String shape;

    // Constructor without parameters
    public Pinata()
    {
        candy = "hard candy";
        color = "rainbow";
        shape = "donkey";
    }

    // Add an overloaded constructor that allows the user
    // to customize all of the instance variables
    public Pinata(String candy, String color, String shape){
        this.candy = candy;
        this.color = color;
        this.shape = shape;
    }

    // Add an overloaded constructor that allows the user
    // to customize the color and shape
    public Pinata(String color, String shape){
        this.color = color;
        this.shape = shape;
        this.candy = "hard candy";
    }

    // Add an overloaded constructor that allows the user
    // to customize the candy
    public Pinata(String candyFormal){
        candy = candyFormal;
        this.color = "rainbow";
        this.shape = "donkey";
    }


    public String toString()
    {
        return color + " " + shape
                + " pinata filled with " + candy;
    }
}
