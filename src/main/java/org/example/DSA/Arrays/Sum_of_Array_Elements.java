package org.example.DSA.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Sum_of_Array_Elements {

    static int Array_Sum(int[] arr){
        int sum = 0;


        for (int i = 0;i<arr.length;i++){
            sum = sum+ arr[i];
        }
        return  sum;
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the Arrray : ");
        int n = scanner.nextInt();

        int arr[] =  new int[n];


        System.out.println("Enter the array elements : ");
        for (int i = 0;i<n;i++){

            arr[i] = scanner.nextInt();
        }

        System.out.println("Total sum of Array : "+Array_Sum(arr));


    }
}
