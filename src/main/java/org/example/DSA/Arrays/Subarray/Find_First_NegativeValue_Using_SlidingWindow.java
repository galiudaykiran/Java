package org.example.DSA.Arrays.Subarray;

import java.util.Scanner;

public class Find_First_NegativeValue_Using_SlidingWindow {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the Array : ");
        int n = scanner.nextInt();

        System.out.println("Enter the Elements in the Array : ");
        int arr[] = new  int[n];

        for (int i = 0;i<n;i++){
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the Window Size : ");
        int k = scanner.nextInt();
        findFirstNegative(arr,k);
    }

    static void findFirstNegative(int arr[],int k){

        int n = arr.length;

        for (int i = 0;i<=n-k;i++){
            boolean found = false;
            for (int j = i;j<i+k;j++){
                if (arr[j]<0){
                System.out.print(arr[j]+" ");
                found = true;
                break;
                }
            }
            if (!found){
                System.out.print("0");
            }

        }

    }



}
