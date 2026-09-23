package org.example.DSA.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Three_Sum_Bruteforce {


    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");

        int n = scanner.nextInt();

        System.out.println("Enter the elemenets in the array:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }


        System.out.println("Enter the Target K value :");

        int target = scanner.nextInt();


        System.out.println(three_sum(arr,target));

    }


    static List<List<Integer>>  three_sum(int arr[], int target){

        List<List<Integer>> result = new ArrayList<>();


        for(int i =0 ;i<arr.length-2;i++){
            for (int j = i+1;j<arr.length-1;j++){
                for (int k = j+1;k<arr.length;k++){
                    if (arr[i] + arr[j] + arr[k] == target) {

                        List<Integer> triplet = Arrays.asList(
                                arr[i], arr[j], arr[k]
                        );
                        result.add(triplet);
                    }
                }
            }
        }


        return result;
    }
}
