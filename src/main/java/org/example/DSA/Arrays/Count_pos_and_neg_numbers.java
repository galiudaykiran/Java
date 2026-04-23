package org.example.DSA.Arrays;

import java.util.Scanner;

public class Count_pos_and_neg_numbers {

    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int n = scanner.nextInt();

        int arr[] = new int[n];

        for (int i = 0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        count_neg_and_pos(arr);
    }

    static  void  count_neg_and_pos(int arr[]){
        int n  = arr.length;

        int count_pos = 0;
        int count_neg = 0;

        for (int i = 0;i<n;i++){
            if (arr[i]>=0){
                count_pos++;
            }

            else {
                count_neg++;
            }
        }

        System.out.println("Postive count : "+count_pos+" "+ "Negative Count : "+count_neg);
    }
}
