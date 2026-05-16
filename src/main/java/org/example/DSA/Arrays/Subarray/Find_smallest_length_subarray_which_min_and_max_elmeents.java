package org.example.DSA.Arrays.Subarray;

import java.util.Scanner;

public class Find_smallest_length_subarray_which_min_and_max_elmeents {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int n = scanner.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the array elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        printminlength_min_and_max(arr, n);
    }

    static void printminlength_min_and_max(int arr[], int n) {

        int minvalue = Integer.MAX_VALUE;
        int maxvalue = Integer.MIN_VALUE;



        for (int i = 0; i < n; i++) {
            if (arr[i] < minvalue) {
                minvalue = arr[i];
            }
            if (arr[i] > maxvalue) {
                maxvalue = arr[i];
            }
        }

        int len = n;

        int minindex = -1;
        int maxindex = -1;

        for (int i = 0;i<n;i++){
            if (arr[i] == maxvalue){
                maxindex = i;
            }
            if (arr[i] == minvalue){
                minindex = i;
            }

            if (minindex != -1 && maxindex != -1){
                len = Math.min(len,Math.abs(minindex-maxindex)+1);
            }
        }

        System.out.println(len);



    }
}
