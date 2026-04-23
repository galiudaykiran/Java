package org.example.DSA.Strings;

import java.util.Scanner;

public class Remove_duplicates_inString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        boolean[] seen = new boolean[256];

        String result = "";

        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!seen[ch]){
                result = result+ch;
                seen[ch] = true;
            }
        }
        System.out.println(result);   // char capital and small are different
    }
}
