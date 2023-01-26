package Unit3;

public class Grades {
    public static void main(String[] args) {
        System.out.println(getLetterGrade(90));

    }

    public static String getLetterGrade(double percentage){

        if(percentage >= 85){
            return "A*";
        }
        else if(percentage >= 75){
            return "A";
        }
        else if(percentage >= 65){
            return "B";
        }
        else if(percentage >= 55){
            return "C";
        }
        else if(percentage >= 45){
            return "D";
        }
        else {
            return "F";
        }

        //return "error";
    }
}
