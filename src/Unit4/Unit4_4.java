package Unit4;

public class Unit4_4 {
    public static void main(String[] args) {
        int[] nums = {15, 21, 9, 20, 10, 30};

        for(int i=0; i < nums.length; i++){
            if(nums[i] % 3 == 0 && nums[i] % 5 != 0){
                System.out.println(nums[i]);
            }
            else if(nums[i] % 5 == 0 && nums[i] % 3 != 0){
                System.out.println(nums[i]);
            }

            if(nums[i] % 3 == 0 ^ nums[i] % 5 == 0){

            }
        }
    }
}
