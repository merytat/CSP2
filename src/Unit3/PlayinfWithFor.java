package Unit3;

public class PlayinfWithFor {
    public static void main(String[] args) {
        toThePower();
    }

    //print powers from 1-7
    public static void toThePower(){

        for(int i = 1; i <= 7;  i++){
            System.out.println(i + " = " + (Math.pow(i,i)));

        }

    }

}
