package org.example.DSA.Arrays;

import java.util.Scanner;

public class Sum_of_Squares_in_array {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0;i<n;i++){
          arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0;i<n;i++){
            sum = sum+ arr[i]*arr[i];
        }

        System.out.println(sum+" ");

    }
}
