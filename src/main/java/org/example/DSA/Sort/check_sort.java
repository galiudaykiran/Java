package org.example.DSA.Sort;

import java.util.Scanner;

public class check_sort {
    static void main() {
        Scanner sc =  new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new  int[n];

        for (int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }

         boolean issort = true;
        for (int i = 0;i<n;i++ ){
            if (arr[i]>arr[i+1]){
                issort = false;
                break;
            }
        }


        if (issort){
            System.out.println("The array is sorted");
        }

        else {
            System.out.println("the array is not sorted");
        }
    }
}
