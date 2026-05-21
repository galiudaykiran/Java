package org.example.DSA.General;

import java.util.Scanner;

public class Factorial_Number {

    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter the Number");

        int n = scanner.nextInt();

        int prod = 1;
        for(int i = 1;i<=n;i++) {

            prod = prod * i;
        }

        System.out.println("Factorial : "+prod);
    }
}
