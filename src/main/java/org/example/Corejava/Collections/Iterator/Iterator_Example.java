package org.example.Corejava.Collections.Iterator;

import java.util.*;

public class Iterator_Example {
    static void main() {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);


        Iterator<Integer> ls = list.iterator();

        while(ls.hasNext()){
            System.out.println(ls.next());
        }




        // Create TreeSet
        Set<String> set = new TreeSet<>();
        set.add("Banana");
        set.add("Apple");
        set.add("Mango");

        // Create Iterator
        Iterator<String> it = set.iterator();

        // Traverse TreeSet
        while(it.hasNext()) {
            System.out.println(it.next());
        }



        TreeSet<String> set1 = new TreeSet<>();
        set1.add("Apple");
        set1.add("Banana");
        set1.add("Mango");

        Iterator<String> it1 = set1.iterator();

        while(it.hasNext()) {
            String value = it1.next();

            if(value.equals("Banana")) {
                it1.remove();   // remove element safely
            }
        }

        System.out.println(set);
    }
}
