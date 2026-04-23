package org.example.DSA.Arrays.two_2DMatrix;

import java.util.Scanner;

public class Particular_row_sum {

    static void row_sum(int arr[][],int row,int m){

       int sum = 0;
        for(int j = 0;j<m;j++){
            sum+=arr[row][j];
        }
        System.out.println("sum = "+sum);
    }


   public static void main() {

       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int m = sc.nextInt();

       int arr[][] = new int[n][m];

       for (int i = 0;i<n;i++){
           for (int j = 0;j<m;j++){
               arr[i][j] = sc.nextInt();
           }
       }

       int k = sc.nextInt();

       row_sum(arr,k,m);

    }


}
