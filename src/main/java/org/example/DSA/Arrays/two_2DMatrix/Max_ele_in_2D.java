package org.example.DSA.Arrays.two_2DMatrix;

import java.util.Scanner;

public class Max_ele_in_2D {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int mat[][] = new int[n][m];

        for (int i = 0;i<n;i++){
            for (int j = 0;j<m;j++){
                mat[i][j] = sc.nextInt();
            }
        }


        int max = Integer.MIN_VALUE;

        for (int i = 0;i<n;i++){
            for (int j = 0;j<m;j++){
                if (mat[i][j]>max){
                    max = mat[i][j];
                }
            }
        }

        System.out.println(max+" ");
    }
}
