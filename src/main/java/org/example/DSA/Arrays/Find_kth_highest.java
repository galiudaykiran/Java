package org.example.DSA.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Find_kth_highest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        Arrays.sort(arr);

        int kth_ele = arr[n-k];
        System.out.println(kth_ele+" is the kth highest element");

    }
}
