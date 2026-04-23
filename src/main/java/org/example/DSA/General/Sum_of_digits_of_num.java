package org.example.DSA.General;

import java.util.Scanner;

public class Sum_of_digits_of_num {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int  num  = sc.nextInt();

        int sum = 0;

        while (num!=0){
            sum = sum +num%10;
            num = num/10;
        }

        System.out.print(sum);
    }
}
