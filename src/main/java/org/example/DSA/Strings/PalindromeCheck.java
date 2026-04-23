package org.example.DSA.Strings;

import java.util.Scanner;

public class PalindromeCheck {

    static boolean palindrome_check(String str){

        int left = 0;
        int right = str.length()-1;

        while (left<right){
            if (str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return  true;
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        System.out.println(palindrome_check(str));
    }
}
