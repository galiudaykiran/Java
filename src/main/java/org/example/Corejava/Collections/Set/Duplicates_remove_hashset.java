package org.example.Corejava.Collections.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Duplicates_remove_hashset {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        for(int i = 0;i<n;i++){
            list.add(sc.nextInt());
        }

        java.util.Set<Integer> hashset = new HashSet<>(list);

        System.out.println("Unique elements : "+hashset);
    }
}
