package Unit2;

public class StudentRunner {
    public static void main(String[] args) {

        Student hwisung = new Student("Hwisung", 15);
        /*hwisung.name = "Hwisung";
        hwisung.age = 15;*/

        Student juho = new Student();
        juho.name = "Juho";
        juho.age = 14;

        System.out.println("Student 1:");
        System.out.println("Name: " + hwisung.name);
        System.out.println("Age: " + hwisung.age);

        System.out.println("Student 2:");
        System.out.println("Name: " + juho.name);
        System.out.println("Age: " + juho.age);

        Student jacob = new Student("Jacob");
        //Student charlene = new Student(16);

    }
}
