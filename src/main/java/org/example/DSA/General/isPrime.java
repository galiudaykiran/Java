package org.example.DSA.General;

import java.util.Scanner;

public class isPrime {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        boolean isprime = true;
        for (int i =2;i*i<n;i++){
            if (n%i == 0){
                isprime = false;
                break;
            }
        }

        if (isprime){
            System.out.println("the given number is prime");
        }
        else{
            System.out.println(" the given number is not prime");
        }
    }
}
