package org.example.Corejava.Collections.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;


//Stores unique elements only (no duplicates)
//❌ Does not allow duplicate values
//⚠️ Order depends on implementation


public class Set {
    public static void main(String[] args){
        java.util.Set<Integer> set = new HashSet<>();//( unoerdder)  and fats

        set.add(10);
        set.add(20);
        set.add(20);
        System.out.println(set);

        java.util.Set<String> set1 = new HashSet<>();
        set1.add("java");
        set1.add("Spring");
        set1.add("java");
        System.out.println("hashset : "+set1);



        java.util.Set<Integer> linkset = new LinkedHashSet<>(); //(maintains order)

        linkset.add(20);
        linkset.add(30);
        linkset.add(10);

        System.out.println("LiskedHashSet : "+linkset);


        java.util.Set<Integer> treeset = new TreeSet<>(); //(maintains order)

        treeset.add(10);
        treeset.add(30);
        treeset.add(20);

        System.out.println("Treeset : "+treeset);



    }
}
