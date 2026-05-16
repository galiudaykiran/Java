package org.example.DSA.Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Original String: programming
//After Removing Duplicates: progamin

public class Remove_DuplicatesChars_In_String_using_Map {
    static void main() {
        Scanner scanner  = new Scanner(System.in);
        String string = scanner.next();

        Map<Character,Boolean> map = new HashMap<>();

        String result = "";

        for (char ch : string.toCharArray())
        {
            if (!map.containsKey(ch)){
                map.put(ch,true);
                result = result+ch;
            }
        }

        System.out.println(result);
    }
}
