package org.example.DSA.Arrays;

import java.util.Scanner;


//1 1 1
//k = 3
// out : 1

// 1 1 1
// k = 2
// out : 2


public class Subarray_sum_equals_to_K {

    static  int subarray(int arr[],int k){

        int count = 0;

        for(int i = 0;i<arr.length ;i++){
            int sum = 0;
            for(int j = i;j<arr.length;j++){
                sum = sum+arr[j];
                if (sum == k){
                    count++;
                }
            }
        }

        return count;
    }


    static void main() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int  k = sc.nextInt();

        System.out.println(subarray(arr,k));

    }
}
