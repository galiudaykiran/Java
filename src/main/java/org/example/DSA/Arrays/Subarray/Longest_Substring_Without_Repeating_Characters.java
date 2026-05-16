package org.example.DSA.Arrays.Subarray;

import javax.naming.Name;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Longest_Substring_Without_Repeating_Characters {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(longest_substring(str));
    }

    static int longest_substring(String str){

        int left = 0;
        int maxlength = 0;


        HashSet<Character> set = new HashSet<>();

        for (int right = 0;right<str.length();right++){
            while (set.contains(str.charAt(right))){
                set.remove(str.charAt(left));
                left++;
            }

            set.add(str.charAt(right));
            maxlength = Math.max(maxlength,right-left+1);
        }
        return maxlength;
    }
}
