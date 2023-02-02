package Unit4;

import java.util.Scanner;

public class ClassList {
    //attributes
    private Student[] students;
    private int nextIndex = 0;

    public ClassList(int noSt){

        students = new Student[noSt];
    }

    public boolean addStudent(Student st){
        //add the student st into the array students
        if(nextIndex < students.length){
            students[nextIndex] = st;
            nextIndex++;
            return true;
        }
        return false;

    }

    public double classAverage(){
        double av = 0;
        for(int i = 0; i<students.length; i++){
            av += students[i].getStGrade();
        }
        return av/students.length;
    }
}

class ClassListRunner{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("How many students do you have?");
        int noSt = kb.nextInt();
        kb.nextLine();

        ClassList cl = new ClassList(noSt);

        //add students
        String name = "";
        while(!name.equals("-1")){
            System.out.print("Enter student name to add student or -1 to finish");
            name = kb.nextLine();
            if(!name.equals("-1")){
                System.out.print("Enter student grade: ");
                double grade = kb.nextDouble();
                kb.nextLine();
                boolean added = cl.addStudent(new Student(name,grade));
                if(added == false){
                    System.out.println("You run out of space");
                    name = "-1";
                }
            }
        }

        //calculate average
        System.out.println("Class average: " +cl.classAverage());
    }
}
