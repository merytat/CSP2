package Unit5;

import java.util.*;

public class U5_01 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Jean");
        names.add("Peter");
        names.add("John");
        names.add("Sarah");
        names.add("Lisa");

        ArrayList<Double> gpas = new ArrayList<Double>();
        gpas.add(4.3);
        gpas.add(3.5);
        gpas.add(2.6);
        gpas.add(3.6);
        gpas.add(4.1);

        System.out.println(names);
        System.out.println(gpas);

        System.out.println("name: " + names.get(0) + " has "
                + gpas.get(0));

        names.add(0,"alan");
        gpas.add(0,3.0);

        System.out.println(names);
        System.out.println(gpas);
        
        names.remove(names.size()-1);
        gpas.remove(gpas.size()-1);

        System.out.println(names);
        System.out.println(gpas);

    }
}
