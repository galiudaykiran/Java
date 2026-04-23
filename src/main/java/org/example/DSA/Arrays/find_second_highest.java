package org.example.DSA.Arrays;

import java.util.Scanner;

public class find_second_highest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr =  new int[n];


        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int sec_max = Integer.MIN_VALUE;

        for(int i = 0;i<n;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }

        for(int i = 0;i<n;i++){
            if(sec_max<arr[i] && max != arr[i]){
                sec_max = arr[i];
            }
        }




        System.out.println(sec_max+" is second higest number ");

    }
}
