package Unit4;

public class Student {
    private String stName;
    private double stGrade;

    public Student(String stName, double stGrade) {
        this.stName = stName;
        this.stGrade = stGrade;
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public double getStGrade() {
        return stGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stName='" + stName + '\'' +
                ", stGrade=" + stGrade +
                '}';
    }

    public void setStGrade(double stGrade) {
        this.stGrade = stGrade;
    }
}
