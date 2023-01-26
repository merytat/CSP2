package Unit4;

public class Unit4_3 {
    public static void main(String[] args) {
        int[] nums = {15, 21, 9, 20, 10, 30};

        System.out.println("Odd indices");
        for(int i = 0; i<nums.length; i++){
            if(i != 0 && i%2 != 0){
                System.out.print(nums[i]+ " ");
            }
        }

        for(int i = 1; i<=nums.length-1; i+=2){
                System.out.print(nums[i]+ " ");
        }

        System.out.println("Even indices");
        for(int i = 0; i<nums.length; i++){
            if(i != 0 && i%2 == 0){
                System.out.print(nums[i]+ " ");
            }
        }
    }
}
