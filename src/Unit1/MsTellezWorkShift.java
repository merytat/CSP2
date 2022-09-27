package Unit1;

public class MsTellezWorkShift {
    public static void main(String[] args) {
        //seconds on 20 hours, 42 min, 16 sec
        int seconds;

        seconds = 20*3600; //hours

        seconds += 42*60;  //seconds = seconds + (42*60);
        seconds += 16; // seconds = seconds + 16;

        int hours = 20;
        hours*=3600;
        int min = 42;
        min*=60;
        int totalTime = hours + min + 16;

        System.out.println("The seconds on that shift are: " + seconds) ;
    }
}
