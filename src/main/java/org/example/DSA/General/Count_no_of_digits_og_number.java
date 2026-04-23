package org.example.DSA.General;

import java.util.Scanner;

public class Count_no_of_digits_og_number {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int count = 0;

        while (num != 0){
          num = num/10;
          count++;
        }

        System.out.println(count);
    }
}
