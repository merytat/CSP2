package Unit5;

import java.util.*;

public class U5_05 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<Integer>();

        //filling the ArrayList
        int num = 0;
        while(num!=-1){
            System.out.println("Enter a number between " +
                    "1-50 or -1 to exit");
            num = kb.nextInt();
            if(num >-1 && num <= 50){
                nums.add(num);
            }
        }

        //Average
        int sum = 0;
        for(int i = 0; i< nums.size(); i++){
         sum += nums.get(i);
        }
        System.out.println("The average is: " + ((double)sum/nums.size()));

        //Max number & Min
        int largest = -1;
        int minimum = 60;
        for(int i=0; i<nums.size();i++){
            if(nums.get(i)>largest){
                largest = nums.get(i);
            }
            if(nums.get(i) < minimum){
                minimum = nums.get(i);
            }
        }
        System.out.println("The max is: " + largest);

        //Range
        System.out.println("The range is: "+ (largest - minimum));

        //Mode
        int mode = 0;
        int modecount = 0;

        for(int i = 0; i < nums.size(); i++){
            int counter = 0;
            for(int j = i+1; j < nums.size(); j++){
                if(nums.get(i) == nums.get(j)){
                    counter++;
                }
            }
            if(counter > modecount){
                modecount = counter;
                mode = nums.get(i);
            }
        }
        System.out.println("Mode: " + mode);

        //Bar graph

        //median
        int median = 0;
        Collections.sort(nums); //google search

        if(nums.size()%2 == 0){
            median = (nums.get(nums.size()/2) + nums.get((nums.size()/2)-1))/2;
        }
        else{
            median = nums.get(nums.size()/2);
        }
        System.out.println("Median is: " + median);

    }
}
