package org.example.DSA.Arrays.two_2DMatrix;

import java.util.Scanner;

public class Increase_one_of_element {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int arr[][] = new int[n][m];

        for (int i = 0;i<n;i++){
            for (int j = 0;j<m;j++){
                arr[i][j] = sc.nextInt();
                arr[i][j] = arr[i][j]+1;

            }
        }

        for (int i = 0;i<n;i++){
            for (int j = 0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
