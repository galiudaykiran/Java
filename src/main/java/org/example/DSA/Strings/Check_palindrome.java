package org.example.DSA.Strings;

import java.util.Scanner;

public class Check_palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        String org = s;
         String rev = "";

         for(int i = s.length()-1 ;i>= 0;i--){
              rev  = rev + s.charAt(i);

         }

         if(org.equals(rev)){
             System.out.println(" it is a palindrome");
         }

         else{
             System.out.println("not a palindrome");
         }
    }
}
