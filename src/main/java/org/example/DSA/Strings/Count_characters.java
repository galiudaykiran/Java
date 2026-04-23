package org.example.DSA.Strings;

import java.util.Scanner;

public class Count_characters {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int count = 0;
        for(int i = 0;i<s.length();i++){
            count++;
        }
        System.out.println(count+ "  are the characters in this string "+ s);
    }
}
