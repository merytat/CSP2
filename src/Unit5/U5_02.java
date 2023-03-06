package Unit5;

import java.util.*;
public class U5_02 {
    public static void main(String[] args) {

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int i = 0; i < 24; i++){
            int random = (int)(Math.random() * (99 - 0 + 1) + 0);
            if (random % 2 == 0){
                even.add(random);
            } else{
                odd.add(random);
            }

        }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

    }
}
