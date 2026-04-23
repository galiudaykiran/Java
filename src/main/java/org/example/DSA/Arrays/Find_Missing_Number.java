package org.example.DSA.Arrays;

import java.util.Scanner;

public class Find_Missing_Number {

    static  void missingNumber(int arr[]){
        int sum_array = 0;
        int total = (arr.length *(arr.length+1))/2;



        for (int num : arr){
            sum_array = sum_array+num;
        }
        System.out.println("Missing Number : "+(total-sum_array));

    }


    static void main() {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int arr[] = new int[n];

        for (int i = 0;i<n-1;i++){
            arr[i] = scanner.nextInt();
        }

        missingNumber(arr);

    }
}
