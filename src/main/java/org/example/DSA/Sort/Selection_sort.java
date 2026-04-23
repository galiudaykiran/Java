package org.example.DSA.Sort;

import java.util.Scanner;

public class Selection_sort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0;i<n;i++){
            arr[i]  = sc.nextInt();
        }


        for(int i = 0;i<n-1;i++){
            int minId = i;
            for(int j= i+1;j<n;j++){
                if(arr[j]<arr[minId]){
                    minId = j;

                }
            }

            int t = arr[minId];
            arr[minId] = arr[i];
            arr[i] = t;
        }


        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }





    }
}

