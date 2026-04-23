package org.example.DSA.Star_Patterns;

import java.util.Scanner;

public class Square {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 1;i<=n;i++){
            for (int j = 1 ;j<=n;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
