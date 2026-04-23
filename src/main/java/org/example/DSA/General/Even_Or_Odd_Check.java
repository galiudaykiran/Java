package org.example.DSA.General;

import java.util.Scanner;

public class Even_Or_Odd_Check {


    static void main() {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if (n%2 == 0){
            System.out.println("Even Number");
        }

        else {
            System.out.println("Odd Number");
        }
    }
}
