package org.example.DSA.Arrays.two_2DMatrix;

import java.util.Scanner;

public class Max_element_in_col {

    static int Col_max(int matrix[][], int col,int n){

        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if (matrix[i][col] > max){
                max = matrix[i][col];
            }
        }
        return max;
    }


    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int col = sc.nextInt();
        System.out.println("Max element in column :" + Col_max(matrix,col,n));
    }

}
