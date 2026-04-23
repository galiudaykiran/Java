package org.example.DSA.General;

import java.util.Scanner;

public class Print_prime_no_in_range {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();


        for (int i = start;i<=end;i++ ){
            boolean isprime = true;
            for (int j = 2;j*j <= i;j++){
                if (i%j == 0){
                    isprime = false;
                    break;
                }
            }
             if (isprime && i>1){
                 System.out.println(i+" ");
             }

        }
    }
}
