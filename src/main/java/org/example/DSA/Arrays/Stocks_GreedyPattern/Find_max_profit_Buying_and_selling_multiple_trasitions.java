package org.example.DSA.Arrays.Stocks_GreedyPattern;

//Input:[7,1,5,3,6,4]

//Output:7

//Buy at 1 → Sell at 5 = 4 profit
//Buy at 3 → Sell at 6 = 3 profit
//
//Total Profit = 4 + 3 = 7


//current day price > previous day price

import java.util.Scanner;

public class Find_max_profit_Buying_and_selling_multiple_trasitions {

    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the days : " );
        int n = scanner.nextInt();

        System.out.println("Enter the stocks : ");
        int arr[] = new int[n];
        for (int i = 0;i<n;i++){
            arr[i] = scanner.nextInt();
        }

        max_profit_sell_multi_stocks(arr);
    }

    static void max_profit_sell_multi_stocks(int arr[]){
        int n = arr.length;

        int profit= 0;
        for (int i = 1;i<n;i++){
            if(arr[i]>arr[i-1]){
                profit = profit+(arr[i]-arr[i-1]);
            }
        }


        System.out.println("profit : "+profit);
    }


}
