package org.example.DSA.Arrays;

import java.util.Scanner;

public class Diff_of_max_ele_and_sum {
    static void main() {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new  int[n];

        for (int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0;i<n;i++){
           if (arr[i]>max){
               max = arr[i];
           }
        }


        int sum = 0;

        for (int i = 0;i<n;i++){
            int dif = max-arr[i];
                 sum = sum+dif;
        }


        System.out.print(sum+" ");


    }
}
