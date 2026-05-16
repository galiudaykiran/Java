package org.example.DSA.Arrays.Subarray;

import java.util.Scanner;

public class Count_Zeros_using_SlidingWindow {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int n = scanner.nextInt();


        System.out.println("Enter the elements in the array : ");
        int arr[] = new int[n];

        for (int i = 0;i<n;i++){
            arr[i] = scanner.nextInt();
        }


        System.out.println("Enter the window size : ");
        int k = scanner.nextInt();

        int count = 0;
        for (int i = 0;i<=n-k;i++){
            for (int j = i ;j<i+k;j++){
                if (arr[j] == 0){
                    count++;
                }
            }
        }


        System.out.println(count);
    }
}
