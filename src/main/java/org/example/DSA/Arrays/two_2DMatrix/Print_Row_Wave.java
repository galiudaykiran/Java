package org.example.DSA.Arrays.two_2DMatrix;

import java.util.Scanner;

public class Print_Row_Wave {
     static void print_row_wave(int matrix[][],int row,int col){

         for (int i=0;i<row;i++){
             if(i%2==0){
                 for(int j=0;j<col;j++){
                     System.out.print(matrix[i][j]+" ");
                 }
             }
            else {
             for(int j= col-1;j>=0;j--){
                 System.out.print(matrix[i][j]+" ");
             }

            }



         }
     }

    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int matrix[][] = new int[n][m];
        for (int i =0; i<n; i++) {
            for (int j =0; j<m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        print_row_wave(matrix, n, m);
    }
}
