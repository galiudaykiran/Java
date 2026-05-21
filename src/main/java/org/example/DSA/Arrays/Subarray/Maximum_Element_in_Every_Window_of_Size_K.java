package org.example.DSA.Arrays.Subarray;

import java.util.Scanner;

//[1,2,3,4,5]
// k = 3
// Iteration 1: 3
// Iteration 2: 4
// Iteration 3: 5

public class Maximum_Element_in_Every_Window_of_Size_K {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = scanner.nextInt();

        System.out.println("Enter the elements into the array : ");
        int arr[] = new int[n];
        for (int i = 0;i<n;i++){
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the window size : ");
        int k = scanner.nextInt();
        max_element_window(arr,k);
    }

    static void max_element_window(int arr[],int k){
        int n = arr.length;

        int max = Integer.MIN_VALUE;

        for (int i = 0;i<=n-k;i++){
            for (int j = i;j<i+k;j++){
                if (arr[j] > max) {
                    max = arr[j];
                }
            }
            System.out.println(max);
        }

    }
}
