package Unit5;

import java.util.*;

public class U5_06 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hi");
        list.add("hello");
        System.out.println(list);
        insert(list, "hi");
        System.out.println(list);
        insert(list, "Good day");
        System.out.println(list);

    }

    public static void insert(ArrayList<String> words, String word) {
        int index = -1;
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).equals(word)) {
                index = i;
                i=words.size();
            }
        }
        if(index==-1){
            words.add(word);
            System.out.println("Word added to end of list");
        }
        else{
            words.add(index+1,word);
            System.out.println("Word added successfully");
        }
    }
}
