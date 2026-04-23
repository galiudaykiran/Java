package org.example.DSA.Star_Patterns;

import java.util.Scanner;


// I/p : 4
// O/p :

//        *  *  *  *
//        *  *  *
//        *  *
//        *

public class Inverted_right_trinagle {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = n;i>=1;i--){
            for (int j = 1;j<=i;j++){
                System.out.print(" * ");

            }
            System.out.println();
        }
    }
}
