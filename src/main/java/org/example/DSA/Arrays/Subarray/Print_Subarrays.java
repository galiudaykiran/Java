package org.example.DSA.Arrays.Subarray;

import java.util.Scanner;

public class Print_Subarrays {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int n = scanner.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the array elements : ");
        for (int i = 0;i<n;i++){
            arr[i] = scanner.nextInt();
        }

        printsubarrays(arr,n);
    }

    static void printsubarrays(int arr[], int n ){

        int count = 0;
        for (int i = 0;i<n;i++){
            for (int  j = i;j<n;j++){
                count++;
                for (int k = i;k<=j;k++){
                    System.out.print(arr[k]+ " ");
                }
                System.out.println();
            }
        }

        System.out.println("Total subarrays : "+count);
    }
}
