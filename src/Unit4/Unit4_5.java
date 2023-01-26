package Unit4;

public class Unit4_5 {
    public static void main(String[] args) {
        int[] nums = {15, 21, 9, 20, 10, 30};

        double sum = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
        }
        System.out.println("Average: " + (sum/nums.length));
    }
}
