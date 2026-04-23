package org.example.DSA.Arrays;

import java.util.Scanner;

public class Count_Negative_Numbers_in_Each_Window{
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int n = scanner.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the Array elements ");

        for (int i = 0;i<n;i++){
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the Window Size : ");
        int k = scanner.nextInt();
        countNegativeNumbers(arr,k);
    }

     static  void countNegativeNumbers(int arr[],int k ){

        int n = arr.length;


        int count  = 0;

        for (int i = 0;i<=n-k;i++){
            for (int j = i;j<i+k;j++){
                if (arr[j]<0){
                    count++;
                }
            }
        }

         System.out.println(count);

    }
}
