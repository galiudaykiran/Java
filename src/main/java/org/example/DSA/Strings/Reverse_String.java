package org.example.DSA.Strings;

import java.util.Scanner;

public class Reverse_String {


    static String StringReverse(String str){
        char[] arr = str.toCharArray();

        int left = 0;
        int right = arr.length-1;

        while (left<right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return  new String(arr);
    }

    static void main() {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(StringReverse(str));
    }
}
