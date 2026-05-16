package org.example.DSA.Arrays.Subarray;

import java.util.Scanner;

public class Total_no_of_Subarray_Sums_Optimal_Prefix_Sum {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int n = scanner.nextInt();

        System.out.println("Enter the Elements into the array : ");
        int arr[] = new int[n];

        for (int i = 0;i<n;i++){
            arr[i] = scanner.nextInt();
        }

        Subarray_Sum(arr);

    }


    static void Subarray_Sum(int arr[]){

        int n = arr.length;
        int[] prefix = new int[n];

        prefix[0] = arr[0];

        for (int i = 1;i<n;i++){
            prefix[i] = prefix[i-1]+arr[i];
        }

        int sum = 0;
        for (int s = 0;s<n;s++){
            for (int e = s;e<n;e++){

                if (s==0){
                    sum = sum+prefix[e];
                }
                else {
                    sum = sum+prefix[e]-prefix[s-1];
                }

            }
        }

        System.out.println(sum);



    }
}
