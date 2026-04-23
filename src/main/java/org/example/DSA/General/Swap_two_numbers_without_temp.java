package org.example.DSA.General;

import java.util.Scanner;

public class Swap_two_numbers_without_temp {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int a =  sc.nextInt();
        int b = sc.nextInt();
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println(a+" "+b);
    }
}
