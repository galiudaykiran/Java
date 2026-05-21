package org.example.DSA.Arrays.Subarray;

import java.util.Scanner;

public class Smallest_Subarray_length_sum_equals_to_k {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = scanner.nextInt();

        System.out.println("Enter the elements into the array : ");
        int arr[] = new int[n];
        for (int i = 0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the target : ");
        int k = scanner.nextInt();

        System.out.println("Length : "+Sm_sub_len_sum_ells_to_K(arr,k) );
    }

    private static int Sm_sub_len_sum_ells_to_K(int[] arr,int target) {
        int start = 0;
        int sum = 0;
        int min = arr.length+1;

        for(int end = 0;end<arr.length;end++){
             sum = sum+arr[end];
             while(sum>=target){
                 int lenght = end -start+1;
                 if (min>lenght){
                     min = lenght;
                 }

                 sum = sum-arr[start];

                 start++;
             }

        }

        if (min == arr.length+1){
            return 0;
        }
        return min;
    }
}
