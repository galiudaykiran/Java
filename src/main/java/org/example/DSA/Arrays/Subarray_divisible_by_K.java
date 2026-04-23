package org.example.DSA.Arrays;

import java.util.Scanner;

public class Subarray_divisible_by_K {


    static  int subarray_div_byK(int arr[],int k){

        int count = 0;

        for (int i = 0;i<arr.length;i++){
            int sum = 0;
            for (int j = i;j<arr.length;j++){
                sum =sum +arr[j];
                if (sum%k == 0){
                    count++;
                }
            }
        }

        return  count;
    }


    static void main() {
        Scanner sc = new Scanner(System.in);

        int n  = sc.nextInt();

        int arr[]  = new int[n];

        for (int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        System.out.println(subarray_div_byK(arr,k));
    }
}
