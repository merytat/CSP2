package Unit2;

public class Student {
    //attributes
    String name;
    int age;

    //Constructor
    //Special type of method
    //called EXACTLY the same as your class
    public Student(String n, int a){
        name = n;
        age = a;

    }

    //default constructor
    public Student(){
        //default constructor
        //should assign default values
        //for each attribute
        name = "guest";
        age = -1;
    }

    public Student(String name){
        this.name = name;
        this.age = -1;
    }


}
