package org.example.DSA.Arrays.two_2DMatrix;

import java.util.Scanner;

public class Change_90degree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        int arr[][] = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }


        for (int i = 0;i<n;i++){
            for (int j = i+1;j<m;j++){
                  int temp = arr[i][j];      //transpose matrix
                  arr[j][i] =  arr[i][j];
                  arr[j][i] = temp;
            }
        }




        for (int i = 0;i<n;i++){
            int first = 0;
            int last = m-1;
            while(first<last){
                int temp = arr[i][last];    //reverse an array
                arr[i][first]   = arr[i][last];
                arr[i][last] = temp;
                first++;
                last--;
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
