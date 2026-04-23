package org.example.DSA.Strings;

import java.util.Scanner;

public class Check_String_Consists_Atleast_one_uppercase_letter {

    static boolean check(String str){

        for (int i = 0;i<str.length();i++){
            if (Character.isUpperCase(str.charAt(i))){
                return true;
            }
        }
        return false;
    }



    static void main() {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();

        if (check(s)){
            System.out.println("Yes ,given string will consists Uppercase letter");
        }

        else{
            System.out.println(" No , given String not contains Uppercase");
        }


    }
}
