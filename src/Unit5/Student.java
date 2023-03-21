package Unit5;

public class Student {
    private String name;
    private int gradeYear;

    public Student(String name, int gradeYear) {
        this.name = name;
        this.gradeYear = gradeYear;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gradeYear=" + gradeYear +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGradeYear() {
        return gradeYear;
    }

    public void setGradeYear(int gradeYear) {
        this.gradeYear = gradeYear;
    }
}
