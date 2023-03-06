package Unit5;
import java.sql.Array;
import java.util.*;

public class U5_04 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        Scanner kb = new Scanner(System.in);

        for (int i=0; i<10; i++){
            int num = kb.nextInt();
            nums.add(num);
        }

        System.out.println("Values entered:");
        System.out.println(nums);

        for (int i=0; i<nums.size(); i++){
            if (nums.get(i)%2 == 1){
                nums.remove(i);
                i--;
            }
        }

        System.out.println("After removing: ");
        System.out.println(nums);
    }
}
