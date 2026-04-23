package org.example.Corejava.Collections.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Display_duplicates_hashset {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        for(int i = 0;i<n;i++){
            list.add(sc.nextInt());
        }


        java.util.Set<Integer>  seenset = new HashSet<>();
        java.util.Set<Integer>  duplicates = new HashSet<>();

        for(int num : list){
            if(!seenset.add(num)){
                duplicates.add(num);
            }
        }


        System.out.println("duplicate elements :"+duplicates);
    }
}
