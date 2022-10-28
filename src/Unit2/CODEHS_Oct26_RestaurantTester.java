package Unit2;

public class CODEHS_Oct26_RestaurantTester {
    public static void main(String[] args) {
        // Don't modify this part!
        CODEHS_Oct26_Meal macaroni = new CODEHS_Oct26_Meal("Mac N Cheese", "Lunch", 8);
        CODEHS_Oct26_Chef alex = new CODEHS_Oct26_Chef("Alex", "Juniors Cheesecake", macaroni);

        System.out.println(alex);
        System.out.println(alex.getMealName());

        // Create your own Meal and Chef here:
        CODEHS_Oct26_Meal friedrice = new CODEHS_Oct26_Meal("Lamb Fried Rice", "Lunch", 2);
        CODEHS_Oct26_Chef kyle = new CODEHS_Oct26_Chef("Kyle", "A Lamb Fried This Rice", friedrice);
    }
}
