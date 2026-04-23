package org.example.DSA.Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Check_Anagram_Using_Hashmap {
    static void main() {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        Map<Character,Integer> map = new HashMap<>();


        for (char c : s1.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for (char c : s2.toCharArray()){
            map.put(c,map.getOrDefault(c,0)-1);
        }


        boolean isanagram = true ;
        for (int v : map.values()){
            if (v !=0){
                isanagram = false;
            }

        }

        if (isanagram){
            System.out.println("Yes , two strings are anagrams");
        }

        else {
            System.out.println("No , two strings are not anagrams");
        }

    }
}

