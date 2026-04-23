package org.example.DSA.General;

import java.util.Scanner;

public class Check_Armstrong {


    static  int power(int digit,int exp){
        int result = 1;

        for (int i = 0;i<exp;i++){
             result = result*digit;
        }
        return result;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();


        int count = 0;
        int temp = num;

        while (temp != 0){
            temp = temp/10;
            count++;

        }

        int sum  = 0;
        int temp2 = num;
        while (temp2 != 0){
            int digit = temp2%10;
            sum = sum + power(digit, count);
            temp2 /= 10;
        }


         int original = num;
        System.out.println(sum == original);


    }
}
