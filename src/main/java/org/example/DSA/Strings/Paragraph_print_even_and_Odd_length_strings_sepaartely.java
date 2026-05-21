package org.example.DSA.Strings;

import java.util.Scanner;

public class Paragraph_print_even_and_Odd_length_strings_sepaartely {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type any Paragraph : ");
        String para = scanner.nextLine();

        Print_word_sepaaretly(para);
    }
    static  void  Print_word_sepaaretly(String paragrapgh){
        String words[] = paragrapgh.split(" ");

        for (int i = 0;i<words.length;i++){
            for (int j = i+1;j<words.length;j++){
                if (words[i].length()>words[j].length()){
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;

                }
            }
        }


        System.out.println("Words sorted based on the word length");
        for (String word : words){
            System.out.print(word + " ");
        }
        System.out.println();

        System.out.println("Printing the  odd length words");
        for (String word : words){
            if (word.length()%2 != 0){
                System.out.print(word + " ");
            }
        }

        System.out.println();

        System.out.println("Printing the  even length words");
        for (String word : words){
            if (word.length()%2 == 0){
                System.out.println(word+ " ");
            }
        }
     }
}
