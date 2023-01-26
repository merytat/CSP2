package Unit3;

public class EvenTo10 {
    public static void main(String[] args) {

        //control var
        int num = 1;
        while(num <= 10){
            if(num%2 != 0){
                num++;
            }
            System.out.println(num);
            num+=2;
            //change
        }
    }
}
