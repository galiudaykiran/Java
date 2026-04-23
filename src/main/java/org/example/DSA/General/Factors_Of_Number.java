package org.example.DSA.General;

import java.util.Scanner;

public class Factors_Of_Number {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter the Number");

        int n = scanner.nextInt();

        for (int i = 1;i<=n;i++){
            if (n%i == 0){
                System.out.println(i+ " " );
            }
        }


    }
}
