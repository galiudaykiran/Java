package org.example.DSA.Arrays.Subarray;

import java.util.Scanner;



//Enter the size of the array : 5
//Enter the elements in the array : [1 2 3 4 5]
//Enter the Window Size : 2
//[1 2] = 3
//[2 3] = 5
//[3 4 ] = 7
//[4 5] = 9

//   output :     9

public class Max_Sum_Subarray_By_K_SlidingWindow {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int n = scanner.nextInt();

        System.out.println("Enter the elements in the array : ");
        int arr[] = new  int[n];
        for (int i = 0;i<n;i++){
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the Window Size : ");
        int  k = scanner.nextInt();
        Max_sum(arr,k);
    }

    static  void  Max_sum(int arr[],int k){

//        int max_value = Integer.MIN_VALUE;
//
//        for (int i = 0;i<arr.length-k+1;i++){
//            int sum = 0;
//            for (int j = i;j<i+k;j++){
//                sum = sum +arr[j];
//            }
//            if (max_value<sum){
//                max_value = sum;
//            }
//
//        }
//
//        System.out.println(max_value);



        int max_value = Integer.MIN_VALUE;

        int s = 0;
        int e = k-1;
        while (e<arr.length){
            int sum = 0;
            for (int i = s;i<=e;i++){
                sum = sum +arr[i];
            }
            if (max_value<sum){
                max_value = sum;
            }
            s++;
            e++;

        }

        System.out.println(max_value);

    }
}
