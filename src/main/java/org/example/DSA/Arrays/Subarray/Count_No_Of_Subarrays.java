package org.example.DSA.Arrays.Subarray;

import java.util.Scanner;

//[1,2,3]

// subarrays
//[1]
//[1,2]
//[1,2,3]
//[2]
//[2,3]
//[3]
//total = 6

public class Count_No_Of_Subarrays {

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements : ");
        for (int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int ans = (n*(n+1))/2;

        System.out.println(ans);
    }
}
