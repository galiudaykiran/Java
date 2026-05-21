package org.example.DSA.Arrays.Stocks_GreedyPattern;

import java.util.Scanner;

//You are given stock prices for different days.
//
//Find the maximum profit by:
//
//Buying the stock once
//Selling the stock once
//
//You must buy before selling.


//Input: [7,1,5,3,6,4]

//Output: 5


//Buy at 1
//Sell at 6

//Profit = 6 - 1 = 5



public class Find_max_profit_Buying_and_Selling_at_once_Single_Trassition {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the days : ");
        int n = scanner.nextInt();

        System.out.println("Enter the stocks ");

        int arr[] = new int[n];
        for (int i = 0;i<n;i++){
            arr[i] = scanner.nextInt();
        }

        max_profit(arr);
    }

    static void max_profit(int arr[]){
        int n = arr.length;

        int min = arr[0];
        int max_profit = 0;

        for (int i = 0;i<n;i++){
            // Update minimum price
            if (min<arr[i]) {
                min = arr[i];
            }

            int profit = arr[i] - min;

            if(profit>max_profit){
                max_profit = profit;
            }

        }
        System.out.println("Max profit : "+ max_profit);

    }
}
