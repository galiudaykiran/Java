package org.example.DSA.Arrays.Subarray;

import java.util.Scanner;

public class Max_Sum_Subarray_By_K_SlidingWindow {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int n = scanner.nextInt();

        System.out.println("Enter the elements in the array : ");
        int arr[] = new  int[n];
        for (int i = 0;i<n;i++){
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the Window Size : ");
        int  k = scanner.nextInt();
        Max_sum(arr,k);
    }

    static  void  Max_sum(int arr[],int k){

        int max_value = Integer.MIN_VALUE;

        for (int i = 0;i<=arr.length-k;i++){
            int sum = 0;
            for (int j = i;j<i+k;j++){
                sum = sum +arr[j];
            }
            if (max_value<sum){
                max_value = sum;
            }

        }

        System.out.println(max_value);

    }
}
