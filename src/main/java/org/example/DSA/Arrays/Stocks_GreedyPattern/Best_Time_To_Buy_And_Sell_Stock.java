package org.example.DSA.Arrays.Stocks_GreedyPattern;

import javax.swing.*;
import java.util.Scanner;


//[1 2 3 4 5]
//Buy : 1

// Sell : 5

// output : profit = sell - buy  = 5 -1  = 4


public class Best_Time_To_Buy_And_Sell_Stock {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the no of days : ");
        int n = scanner.nextInt();

        System.out.println("Enter the prices : ");
        int arr[] = new int[n];
        for (int i = 0;i<n;i++){
            arr[i] = scanner.nextInt();
        }


        find_max_profit(arr);
    }



    static  void  find_max_profit(int prices[]){
        int n = prices.length;

        int max = prices[n-1];

        int maxprofit = 0;

        for (int i =n-2;i>=0;i--){
            if (prices[i]>max){
                max = prices[i];
            }

            int profit = max-prices[i];
            if (profit>maxprofit){
                maxprofit = profit;
            }
        }


        System.out.println(maxprofit);
    }
}
