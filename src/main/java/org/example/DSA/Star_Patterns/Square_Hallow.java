package org.example.DSA.Star_Patterns;

import java.util.Scanner;


//I/p : 4
//output
//        ****
//        *  *
//        *  *
//        ****
public class Square_Hallow {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        for (int i = 1;i<=n;i++){
            for (int j = 1 ;j<=n;j++){
                if (i == 1 || i == n || j == 1 || j == n){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

