package Unit2;

public class CODEHS_Oct26_Meal {
    //attributes
    private String name;
    private String course;
    private int servings;

    public CODEHS_Oct26_Meal(String name, String course, int servings){
        this.name = name;
        this.course = course;
        this.servings = servings;
    }

    public String getName(){  return name; }

    public String getCourse(){ return course;  }

    public int getNumberOfServings(){  return servings;  }

    @Override
    public String toString(){
        return name + " (" + course + ")";
    }



}
