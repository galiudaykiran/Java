package org.example.DSA.Search;

import java.util.Scanner;



// Binary serach will only applies  for the sorted elemenst
// O(logn)
public class Binary_search {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int left = 0,right = n-1;

        while(left<=right){

            int mid  =  left+(right-left)/2;
            if(arr[mid] == target){
                System.out.println("target value is present ");
                break;

            }

            else if(arr[mid]<target){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
    }
}
