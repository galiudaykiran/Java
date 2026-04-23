package org.example.DSA.General;

import java.util.Scanner;
import java.util.SortedMap;

public class GCD_of_two_numbers {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        while (b != 0){
            int temp = b;
            b = a%b;
            a = temp;
        }

        System.out.println(a);
    }
}
