package Unit4;

public class Unit4_Testing {
    public static void main(String[] args) {
        int num[] = {3,4,5};
        System.out.println(num);

        //traversing an array
        for(int i=0; i<num.length; i++){
            System.out.print(num[i]+ " ");
        }

        //traversing with while
        int i = 0;
        while(i<num.length){
            System.out.println(num[i]);
            i++;
        }
    }
}
