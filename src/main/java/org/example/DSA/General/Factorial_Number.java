package org.example.DSA.General;

import java.util.Scanner;

public class Factorial_Number {

    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter the Number");

        int n = scanner.nextInt();

        int prod = 1;
        while (n>0){

            prod = prod*n;
            n--;
        }

        System.out.println("Factorial : "+prod);
    }
}
