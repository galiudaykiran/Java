package org.example.DSA.Arrays.Contribution_Technique;

import java.util.Scanner;


//[1,2,3]

// subarrays
//[1]   = 1
//[1,2] = 3
//[1,2,3] = 6
//[2] = 2
//[2,3] = 5
//[3] = 3
//total = 1+3+6+2+5+3 = 20

public class Sum_of_all_Subarrays {
    static void main() {
        Scanner scanner   = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int n = scanner.nextInt();

        System.out.println("Enter the elements into the array : ");
        int arr[] = new  int[n];
        for (int i = 0 ;i<n;i++){
            arr[i] = scanner.nextInt();
        }

        sum_of_all_subarrays(arr);

    }

    static  void  sum_of_all_subarrays(int arr[]){
        int n = arr.length;
        int sum = 0;
        for (int i = 0;i<n;i++){
            int startindex = (i+1);
            int endindex = (n-i);
            int contribution = startindex*endindex;
            sum = sum+(arr[i]*contribution);
        }

        System.out.println(sum);
    }
}
