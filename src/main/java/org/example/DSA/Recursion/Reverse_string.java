package org.example.DSA.Recursion;

import java.util.Scanner;

public class Reverse_string {

    static String reverse(String s ,int len){
        if(len<=0){
            return "";
        }
        else if(len==1){
            return String.valueOf(s.charAt(0));
        }
        return s.charAt(len-1) +reverse(s,len-1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        System.out.print(reverse(s,s.length()));
    }
}
