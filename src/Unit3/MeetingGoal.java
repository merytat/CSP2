package Unit3;

public class MeetingGoal {
    public static void main(String[] args) {
        int goal = 10;
        int achieved = 5;

        if(goal>achieved){
            System.out.println("Goal not accomplished");
        }

        else if(achieved>goal){
            System.out.println("Goal accomplished");
        }

        else if(achieved==goal){
            System.out.println("Goal exactly accomplished");
        }
    }
}
