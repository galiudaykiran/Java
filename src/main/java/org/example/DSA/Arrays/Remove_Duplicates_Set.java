package org.example.DSA.Arrays;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Remove_Duplicates_Set {

    static void Removed_Duplicates(int arr[]){

        Set<Integer> set = new HashSet<>();

        for (int num : arr){
            set.add(num);
        }

        System.out.println(set);
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the  array");
        int n = sc.nextInt();

        System.out.println(" Enter the elements in the array");
        int arr[] = new int[n];

        for (int i = 0;i<n;i++){

            arr[i] = sc.nextInt();
        }

       Removed_Duplicates(arr);
    }
}
