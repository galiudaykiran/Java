package org.example.DSA.Arrays;

import java.util.Scanner;

public class Average_of_array {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size and elements for the array ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        int sum = 0;
        for(int i = 0;i<n;i++){
            arr[i]= sc.nextInt();
            sum = sum+arr[i];
        }

        int avg = sum/n;

        System.out.println(avg);

    }
}
