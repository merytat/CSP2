package Unit4;

public class RectangleTracker {

    private Rectangle[] rectangles;
    private int index;

    //Constructor
    public RectangleTracker(int length) {
        index = 0;
        rectangles = new Rectangle[length];
    }

    public void printRectanglesWithSameWidth(){
        for(int i = 0; i < index - 1; i++){
            for(int n = 1; n < index; n++){
                if(rectangles[i].getWidth() ==  rectangles[n].getWidth()){
                    System.out.println(rectangles[i]);
                }
            }
        }
    }

    public void editRectangle(int index, double length, double width){
        if(index < rectangles.length && rectangles[index]!=null){
            rectangles[index].setLength(length);
            rectangles[index].setWidth(width);
        }

    }

    public Rectangle getSmallesRectangle(){
        Rectangle smallest = rectangles[0];

        for(int i = 0; i < rectangles.length;i++){
            if(rectangles[i] != null && rectangles[i].getPerimeter() < smallest.getPerimeter()){
                smallest = rectangles[i];
            }
        }
        return smallest;
    }



    public Rectangle getLargestRectangle(){
        //biggest area
        double biggest = rectangles[0].getArea();
        int ind = 0;
        Rectangle big = null;
        for(int i = 0; i < rectangles.length;i++){
            if(rectangles[i] != null && rectangles[i].getArea() > biggest){
                biggest = rectangles[i].getArea();
                big = rectangles[i];
                ind = i;
            }
        }
        return rectangles[ind];
    }

    public void printRectangle(){
        for (int i = 0; i< rectangles.length; i++){
            if(rectangles[i] != null) {
                System.out.println(rectangles[i]);
            }
        }
    }

    public void addRectangle(Rectangle rec){
        if(index < rectangles.length){
            rectangles[index] = rec;
            index++;
        }
    }

//some setters and getters not shown
//let’s add some more methods here

}


