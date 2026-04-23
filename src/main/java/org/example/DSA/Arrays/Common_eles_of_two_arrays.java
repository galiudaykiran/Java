package org.example.DSA.Arrays;

import java.util.Scanner;

public class Common_eles_of_two_arrays {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size and elements of first array");
        int n = sc.nextInt();

        int arr1[] = new int[n];
        for (int i = 0;i<n;i++){
            arr1[i] = sc.nextInt();
        }


        System.out.println("enter the size and elements of second array");

        int m = sc.nextInt();
        int arr2[] = new int[m];

        for (int i = 0;i<m;i++){
            arr2[i] = sc.nextInt();
        }


        System.out.println("Common elements");

        for (int i = 0;i<n;i++){
            for (int j = 0;j<m;j++){
                if (arr1[i] == arr2[j]){
                    System.out.println(arr1[i]);
                }
            }
        }





    }
}
