package org.example.DSA.Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


//  mix of 4 Questions

public class Repeating_And_Non_Character_4_Questions {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        Map<Character,Integer>  c_first = new HashMap<>();

        for(char c : s.toCharArray() ){
            c_first.put(c,c_first.getOrDefault(c,0)+1);
        }


        System.out.println("finding first non repetitive character");

        // finding first non repetitive character
        for(char c : s.toCharArray()){
            if(c_first.get(c)==1){
                System.out.println(c);
                break;
            }
        }


        // finding  non repetitive characters
        System.out.println("finding  non repetitive characters");
        for(char c : s.toCharArray()){
            if(c_first.get(c)==1){
                System.out.println(c);

            }
        }



        // finding first repetitive characters

        System.out.println("finding first repetitive character");
        for(char c : s.toCharArray()){
            if(c_first.get(c)>1){
                System.out.println(c);
                break;
            }
        }


        //  finding repetitive characters
        System.out.println("finding  repetitive characters");
        for(char c : s.toCharArray()){
            if(c_first.get(c)==1){
                System.out.println(c);

            }
        }



    }
}
