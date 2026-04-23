package org.example.Corejava.Collections.List;

import java.util.ArrayList;
import java.util.LinkedList;

//List – Allows Duplicates, Maintains Order
//Use ArrayList when you need fast access and more reads.
//Use LinkedList when you need frequent insertions/deletions, especially at ends.

public class List {
    public static void main(String[] args){
        java.util.List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(20);
        list.add(40);
        System.out.println(list);
        System.out.println(list.get(1));


        java.util.List<Integer> list2 = new LinkedList<>(); // slower

        java.util.List<Integer> arr3 = new ArrayList<>();

        for(int i = 0;i<5;i++){
            list2.add(i);
            arr3.add(i);
        }

        list2.add(2,99);
        arr3.add(2,99);

        System.out.println(list2);
        System.out.println(arr3);


    }
}
