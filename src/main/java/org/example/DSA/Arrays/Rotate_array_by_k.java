package org.example.DSA.Arrays;

import java.util.Scanner;

public class Rotate_array_by_k {


    static void rotatearray(int arr[],int B){

        int n = arr.length;

        B = B%n;

        for (int c = 1;c<=B;c++){
            int temp =  arr[n-1];
            for (int i = n-2;i>=0;i--){
                arr[i+1] = arr[i];
            }
            arr[0] = temp;
        }
    }




    static void main() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int B = sc.nextInt();

        rotatearray(arr,B);


        System.out.println("After rotating the array");


        for (int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }

}
