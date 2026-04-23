package org.example.DSA.Arrays;

import java.util.Scanner;

public class Moving_negative_eles_left {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }


        int left = 0;
        int right = arr.length-1;

        while(left<right){
            if(arr[left]<0){
                left++;
            }
            else if(arr[right] >= 0){
                right--;
            }

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }


        for (int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
