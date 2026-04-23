package org.example.DSA.Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Freq_word_count {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        Map<String,Integer> freq = new HashMap<>();

        for(String word : s.split(" ")){
            freq.put(word,freq.getOrDefault(word,0)+1);
        }

        System.out.println(freq);
    }
}
