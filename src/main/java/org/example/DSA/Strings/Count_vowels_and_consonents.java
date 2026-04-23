package org.example.DSA.Strings;

import java.util.Scanner;

public class Count_vowels_and_consonents {

    static  void  Count(String str){
        int vowelcount = 0;
        int constcount = 0;

        for (int i = 0;i<str.length();i++){
            char ch =  str.charAt(i);

            if (ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u'  || ch == 'A' || ch == 'E'|| ch == 'I' || ch == 'O'|| ch == 'U'){
                vowelcount++;
            }
            else constcount++;

        }

        System.out.println("vowels : "+vowelcount);
        System.out.println("Consonant : "+constcount);
    }


    static void main() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        Count(str);
    }
}
