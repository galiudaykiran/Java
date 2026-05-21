package org.example.DSA.Arrays.Stocks_GreedyPattern;



//You can perform at most 2 transactions
//One transaction:
//Buy + Sell
//
//Input:[3,3,5,0,0,3,1,4]
//
//Output:6


//Transaction 1
//
//Buy at 0
//Sell at 3
//
//Profit = 3
//
//Transaction 2
//Buy at 1
//Sell at 4
//
//Profit = 3

//Total:3 + 3 = 6


import java.util.Map;
import java.util.Scanner;

public class Find_max_profit_Buying_selling_at_most_two_transitions {

    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the days : ");
        int n = scanner.nextInt();

        System.out.println("Enter the stocks : ");
        int arr[] = new int[n];
        for (int i = 0;i<n;i++){
            arr[i] = scanner.nextInt();
        }

        max_profit_two(arr);
    }


    static void max_profit_two(int arr[]){

        int firstBuy = Integer.MIN_VALUE;
        int firstSell = 0;

        int secondBuy = Integer.MIN_VALUE;
        int secondSell = 0;

        for (int price : arr){
            firstBuy = Math.max(firstBuy,-price);

            firstSell = Math.max(firstSell,firstBuy+price);

            secondBuy = Math.max(secondBuy,firstSell-price);

            secondSell = Math.max(secondSell,secondBuy+price);
        }

        System.out.println(secondSell);
    }
}
