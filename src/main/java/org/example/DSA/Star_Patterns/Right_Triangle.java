package org.example.DSA.Star_Patterns;

import java.util.Scanner;


// I/p : 4

// O/p
//
//        *
//        *  *
//        *  *  *
//        *  *  *  *


public class Right_Triangle {
    static void main() {


        Scanner scanner = new Scanner(System.in);


        int n = scanner.nextInt();

        for (int i = 1;i<=n;i++){
            for (int j = 1;j<=i;j++){
                System.out.print(" * ");

            }
            System.out.println();
        }
    }
}
