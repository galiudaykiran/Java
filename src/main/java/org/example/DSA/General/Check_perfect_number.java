package org.example.DSA.General;

import java.util.Scanner;

public class Check_perfect_number {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = 0;

        for (int i = 1;i<=num/2;i++){
            if (num%i == 0){
                sum = sum+i;
            }
        }
        System.out.println(sum== num);
    }
}
