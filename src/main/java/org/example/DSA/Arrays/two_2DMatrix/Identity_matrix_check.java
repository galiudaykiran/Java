package org.example.DSA.Arrays.two_2DMatrix;

import java.util.Scanner;

public class Identity_matrix_check {

    static boolean Identity_Check(int arr[][],int n ,int m){


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i==j){
                    if (arr[i][j] !=1){
                        return false;
                    }
                }
                else {
                    if (arr[i][j] != 0){
                        return false;
                    }
                }
            }
        }


        return false;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns");
        int n = sc.nextInt();
        int m = sc.nextInt();

        int arr[][] = new int[n][m];

        System.out.println("Enter the elements in the array");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(Identity_Check(arr,n,m));
    }
}
