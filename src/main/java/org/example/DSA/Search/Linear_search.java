package org.example.DSA.Search;

import java.util.Scanner;



//O(n)
//  it will work on both sorted nand unsorted elements
public class Linear_search {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];


        for(int  i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }


        int target = sc.nextInt();

        for(int i = 0;i<n;i++)
        {
            if(arr[i] == target){
                System.out.println(" target value is present");
                break;
            }
        }
    }
}
