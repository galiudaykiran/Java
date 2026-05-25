package org.example.DSA.Arrays.Subarray;

import java.util.Scanner;

public class Max_Subarray_By_K_SlidingWindow_Optimal {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int n = scanner.nextInt();

        System.out.println("Enter the elements into the array : ");
        int arr[] = new  int[n];

        for (int i = 0;i<n;i++){
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the size of the window : ");
        int k = scanner.nextInt();

        max_subarray(arr,k);

    }


    static  void  max_subarray(int arr[],int k){
        int n = arr.length;
        int sum = 0;

        // Calculate first window sum
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int max = sum;

        int s = 0;
        int e = k;




        while (e<n){
        sum = sum -arr[s]+arr[e];

        if (sum>max){
            max = sum;
        }
        s++;
        e++;
        }


        System.out.println(max);
    }
}
