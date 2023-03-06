package Unit5;
import java.sql.Array;
import java.util.*;

public class U5_03 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        ArrayList <Integer> nums = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < 20; i++){
            System.out.print("Enter number: ");
            int n = kb.nextInt();
            nums.add(n);
            if (nums.get(i) < 0){
                sum += nums.get(i);
            }
        }

        System.out.println(sum);
    }
}
