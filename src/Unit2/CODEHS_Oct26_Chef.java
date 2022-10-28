package Unit2;

public class CODEHS_Oct26_Chef {
    //attributes
    private String name;
    private String restaurant;
    //creating an empty object from the Meal class
    private CODEHS_Oct26_Meal bestMeal;

    public CODEHS_Oct26_Chef(String name1, String restaurant, CODEHS_Oct26_Meal bestMeal){
        name = name1;
        this.restaurant = restaurant;
        this.bestMeal = bestMeal;
    }
    //getters
    public String getName(){ return name; }
    public String getRestaurant(){ return restaurant; }
    public String getMealName() { return bestMeal.getName(); }
    public int getMealServings() { return bestMeal.getNumberOfServings(); }
    public String getMealCourse() { return bestMeal.getCourse();}

    @Override
    public String toString(){
        return "Chef " + name +
                " works at " + restaurant +
                " and is best known for " + bestMeal;
    }

}
