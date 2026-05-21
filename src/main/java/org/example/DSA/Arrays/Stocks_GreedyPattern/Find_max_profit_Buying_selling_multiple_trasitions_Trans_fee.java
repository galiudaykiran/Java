package org.example.DSA.Arrays.Stocks_GreedyPattern;




//prices = [1,3,7,5,10,3]
//fee = 3

//First Transaction
//Buy at 1
//Sell at 7
//
//Profit = 7 - 1 - 3
//        = 3

//
//Second Transaction
//Buy at 5
//Sell at 10
//
//Profit = 10 - 5 - 3
//        = 2



//total = 3+2 = 5

//
//buy = max(buy, sell - prices[i])


//sell = max(sell, buy + prices[i] - fee)

import java.util.Scanner;

public class Find_max_profit_Buying_selling_multiple_trasitions_Trans_fee {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the days : ");
        int n = scanner.nextInt();

        System.out.println("Enter the stocks : ");
        int arr[] = new int[n];

        for (int i = 0;i<n;i++){
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the transition fee : ");
        int fee = scanner.nextInt();
        max_profit_with_fee_reduce(arr,fee);
    }

    static void max_profit_with_fee_reduce(int arr[],int fee){
        int n = arr.length;

        int buy = -arr[0];
        int sell = 0;
        for(int i = 1;i<n;i++){
            buy = Math.max(buy,sell-arr[i]);
            sell = Math.max(sell,buy+arr[i]-fee);
        }


        System.out.println(sell);
    }
}
