package org.example.DSA.Arrays.Subarray;

import java.util.Scanner;

//[1,2,3]

// subarrays
//[1]   = 1
//[1,2] = 3
//[1,2,3] = 6
//[2] = 2
//[2,3] = 5
//[3] = 3
//total = 1+3+6+2+5+3 = 20

public class Total_no_of_Subarray_Sums {
    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : " );
        int n = sc.nextInt();

        System.out.println("Enter the elements ");
        int arr[] = new int[n];
        for (int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        total_subarrays_sum(arr,n);
    }

    public  static void total_subarrays_sum(int arr[],int n){

        int sum = 0;

        for (int start = 0;start<n;start++){

            for (int end = start;end<n;end++){

                for (int k = start;k<=end;k++){
                    sum = sum +arr[k];
                }

            }
        }

        System.out.println("Total sum  : "+ sum);
    }
}
