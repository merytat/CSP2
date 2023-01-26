package Unit4;

import java.util.Scanner;

public class GuessingGame {
    //attributes
    private int[] numbers;

    //constructor
    public GuessingGame(){
        this.numbers = new int[20];
        for(int i = 0; i<numbers.length; i++){
            numbers[i] = (int)(Math.random()*20)+1;
        }
    }

    public int search(int searchValue){
        //implementation of search algorithm
        int flag = -1;
        for(int i = 0; i<numbers.length; i++){
            if(searchValue == numbers[i]){
                flag = i;
            }
        }
        return flag;
    }

    public int countBigger(int limit){
        //return number of times that the values on the array
        //are bigger than the limit
        int counter = 0;
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i] > limit){
                counter++;
            }
        }
        return counter;
    }

}

class GuessingGameTester{
    public static void main(String[] args) {
        GuessingGame gg1 = new GuessingGame();
        Scanner kb = new Scanner(System.in);
        System.out.println("20 random numbers have been generated");
        System.out.println();
        System.out.print("Guess a number between 1 and 20: ");
        int searchValue = kb.nextInt();
        if(gg1.search(searchValue) == -1){
            System.out.println("There is no " + searchValue
            + " in the list");
        }
        else{
            System.out.println(searchValue + " is in the list" +
                    "at position " + gg1.search(searchValue));
        }
        System.out.println();

        //biggerThan method
        System.out.print("Enter the value bigger than: ");
        int limit = kb.nextInt();
        System.out.println("There are " + gg1.countBigger(limit) +
                " bigger than " + limit);

    }
}
