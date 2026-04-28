package org.example.DSA.Arrays.Subarray;

import java.util.Scanner;

public class Max_sum_Contiguous_subarray_Kadanes {


    static  int maxSubArray(int arr[]){

        int currentsum = 0;

        int maxsum = Integer.MIN_VALUE;

        for (int i = 0;i<arr.length;i++){
            currentsum = currentsum+arr[i];

            if (maxsum<currentsum){
                maxsum = currentsum;
            }

            else if (currentsum<0){
                currentsum = 0;
            }
        }

        return  maxsum;
    }


    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int arr[] = new int[n];

        for (int i = 0;i<n;i++){
            arr[i] = scanner.nextInt();
        }

        System.out.println("Max Subarray sum : "+maxSubArray(arr));

    }
}
