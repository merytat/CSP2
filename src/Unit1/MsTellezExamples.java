package Unit1;

public class MsTellezExamples {
    public static void main(String[] args) {
        int age = 15;
        final int studentID = 23654;
        System.out.println("age: " + age);
        System.out.println("ID: " +studentID);
        age = 16;
        //studentID = 34567; //final variables ar not meant to change
        System.out.println("age: " + age);
    }
}
