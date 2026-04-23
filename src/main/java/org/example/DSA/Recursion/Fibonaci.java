package org.example.DSA.Recursion;

import java.util.Scanner;



public class Fibonaci {

    static int  fibon(int n){
        if(n<=1){
            return n;
        }
        return fibon(n-1)+fibon(n-2);
    }
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0;i<n;i++){
            System.out.print(fibon(i)+" ");
        }
    }
}
