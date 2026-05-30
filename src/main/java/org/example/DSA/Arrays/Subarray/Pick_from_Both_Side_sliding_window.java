package org.example.DSA.Arrays.Subarray;

// A = [ 5 -2  3 1 2]
// B = 3(window size)

// 3 elements from left , 0 elements from right = 5+(-2)+3 = 6
// 2 elements from left, 1 element from right = 5+(-2)+2 = 5
// 1 element from left , 2 elements from right = 5+2+1 = 8
// 0 element from left , 3 elements from right = 2+1+3 = 6

// output : 8


import java.util.Scanner;

public class Pick_from_Both_Side_sliding_window {

    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int n = scanner.nextInt();

        System.out.println("Enter the elements into the array : ");
        int arr[] = new int[n];
        for (int i = 0;i<n;i++){
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the size of the window : ");
        int B = scanner.nextInt();
        pick_2_sides(arr,B);

    }



    static  void pick_2_sides(int arr[],int B){

        int n = arr.length;


        int sum = 0;

        // adding the first subarray
        for (int i = 0;i<B;i++){
            sum = sum+arr[i];
        }


        int max = sum;
        int left = B-1;
        int right = n-1;

        for (int i = 1;i<=B;i++){
            sum = sum-arr[left]+arr[right];
            max = Math.max(max,sum);

            left--;
            right--;
        }


        System.out.println(max);
    }
}
