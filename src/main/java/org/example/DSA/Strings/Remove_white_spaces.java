package org.example.DSA.Strings;

import java.util.Scanner;

public class Remove_white_spaces {

    static  String Remove_spaces(String str){

        char arr[] = new char[str.length()];

        int index = 0;

        for (int i = 0;i<str.length();i++){
            char ch = str.charAt(i);

            if (ch != ' '){
                arr[index++] = ch;
            }

        }

        return  new String(arr,0,index);  //
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();

        System.out.println(Remove_spaces(string));
    }
}

