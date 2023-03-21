package Unit5;

import java.util.ArrayList;

public class ClassList {
    ArrayList<Student> students = new ArrayList();

    public void addStudent(String name, int gradeYear){
        //option 1
        Student s1 = new Student(name,gradeYear);
        students.add(s1);

        //option 2
        //students.add(new Student(name,gradeYear));
    }

    public Student searchStudent(String name){
        for(int i= 0; i<students.size(); i++){
            if(name.equals(students.get(i).getName())){
               return students.get(i);
            }
        }
        return null;
    }

    public void promoteStudents(){
        for(int i=0; i<students.size(); i++){
            students.get(i).setGradeYear(students.get(i).getGradeYear()+1);
        }
    }
}
