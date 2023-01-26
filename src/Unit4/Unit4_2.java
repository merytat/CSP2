package Unit4;

public class Unit4_2 {
    public static void main(String[] args) {
        int[] nums = {15, 21, 9, 20, 10, 30};

        //loop to show the numbers in reverse
        for(int i = nums.length-1; i>=0; i--){
            System.out.print(nums[i]+ " ");
        }

        System.out.println();

        int j = nums.length/2;
        while(j<nums.length){
            System.out.print(nums[j] + " ");
            j++;
        }
    }

}
