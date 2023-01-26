package Unit3;

public class RecallActivity {

    public void method3(String text, int from, int to){
        for(int i = from; i <= to; i++){
            System.out.println(text.substring(i, i+1));
        }
    }

    public int method1(String text) {
        int count = 0;
        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) == 'a' || text.charAt(i) == 'o'){
                count++;
            }
        }
        return count;
    }
    public void method2(int number){
        while(number > 0){
            int digit = number%10;
            System.out.println(digit);
            number = number/10;
        }
    }

    public void method4(){
        int min = 10;
        int max = 0;
        for(int i = 0; i < 5; i++){
            int number = (int)(Math.random()*(9-1+1))+1;
            System.out.println(number);
            if(number > max){
                max = number;
            }
            if(number < min){
                min = number;
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Difference: "+ (max-min));
    }

    public int method5(){
        int counter = 0;

        for(int i = 0; i<10; i++){
            int random = (int)(Math.random()*100)+1;
            System.out.println(random);
            if(random % 2 == 0){
                counter++;
            }
        }
        return counter;
    }
}
class RecallTester {
    public static void main(String[] args) {
        RecallActivity re = new RecallActivity();
        System.out.println("Method 5 test:");
        System.out.println("Evens: " + re.method5());
        System.out.println();
        System.out.println("Method 4 test:");
        re.method4();
        System.out.println();
        System.out.println("Method 1 test:");
        System.out.println(re.method1("ooableble"));
        System.out.println();
        System.out.println("Method 2 test:");
        re.method2(23456);
        System.out.println();
        System.out.println("Method 3 test:");
        re.method3("Hello World", 4,8);
    }
}

