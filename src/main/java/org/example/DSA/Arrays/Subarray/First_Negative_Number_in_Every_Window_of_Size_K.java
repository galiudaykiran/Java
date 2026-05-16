package org.example.DSA.Arrays.Subarray;

import java.awt.*;
import java.util.Scanner;


//[-1,2 ,3 -2]
//k = 2
// iteration 1: -1
// iteration 2: ''
//iteration 3 : -2



public class First_Negative_Number_in_Every_Window_of_Size_K {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int n = scanner.nextInt();

        System.out.println("Enter the elements into the array : ");
        int arr[] = new  int[n];
        for (int i = 0;i<n;i++){
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the size of the window : ");
        int k = scanner.nextInt();

        first_neg_ele(arr,k);
    }

    static void first_neg_ele(int arr[],int k){

        int n = arr.length;
        for (int i = 0;i<=n-k;i++){
            for (int j = i ;j<i+k;j++){
                if(arr[j]<=0){
                    System.out.print(arr[j]+ " ");
                    break;
                }
            }
        }
    }
}
