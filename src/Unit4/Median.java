package Unit4;

public class Median {
    public static void main(String[] args)
    {
        int[] numbers1 = {12, 75, 3, 17, 65, 22};
        System.out.print("The median value of the EVEN array is " + median(numbers1));

        int[] numbers2 = {12, 75, 3, 17, 65, 22, 105};
        System.out.print("\nThe median value of the ODD array is " + median(numbers2));

    }

    public static double median(int[] arr)
    {
        // your code goes here!
        if(arr.length % 2 == 1){
            return arr[arr.length/2];
        }
        else{
            double mean = (arr[arr.length/2] + arr[arr.length/2 -1]) /2;
            return mean;
        }
    }
}
