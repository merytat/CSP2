package Unit2;

public class CODEHS_Oct26_Rectangle {
    private int width;
    private int height;

    /**
     * This is the constructor to create a Rectangle.
     * To create a Rectangle we need to know its width
     * and height.
     */
    public CODEHS_Oct26_Rectangle(int rectWidth, int rectHeight)
    {
        width = rectWidth;
        height = rectHeight;
    }


    public void setWidth(int rectWidth)
    {
        width = rectWidth;
    }

    public int getWidth()
    {
        return width;
    }

    public void setHeight(int rectHeight)
    {
        height = rectHeight;
    }

    public int getHeight()
    {
        return height;
    }

    public int getArea()
    {
        return width * height;
    }

    public int getPerimeter()
    {
        return 2 * width + 2 * height;
    }

    /**
     * This is the toString method. It returns a String
     * representation of the object.
     */
    public String toString(){
        String res = "Rectangle width: " + width;
        res += ", Rectangle height: " + height;
        return res;
    }
}
