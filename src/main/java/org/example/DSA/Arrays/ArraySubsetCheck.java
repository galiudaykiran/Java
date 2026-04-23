package org.example.DSA.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySubsetCheck {

    static boolean bsearch(int element,int arr[],int m){
         int left = 0;
         int right = m-1;

         while(left<=right){
             int mid = (left+right)/2;


             if(arr[mid] == element){
                 return true;
             }

             else if(arr[mid]<element){
              left = mid+1;
             }
             else{
                 right =mid-1;
             }

         }
         return false;
    }



    static boolean issub(int arr1[],int n,int arr2[],int m){
        if(n>m){
            return false;
        }
        Arrays.sort(arr2);

        for(int i = 0;i<n;i++){
            boolean present = bsearch(arr1[i],arr2,m);
            if(present == false){
                return false;
            }
        }
    return true;

    }


    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.println("enter the size and elements for the array 1");
        int n = sc.nextInt();
        int arr1[] = new int[n];

        for(int i = 0;i<n;i++){
            arr1[i] = sc.nextInt();
        }


        System.out.println("Enter the size and elements for the array 2");


        int m = sc.nextInt();

        int arr2[] = new int[m];

        for(int i = 0;i<m;i++){
            arr2[i] = sc.nextInt();
        }

        boolean ans = issub(arr1,n,arr2,m);

        if(ans ==  true){
            System.out.println("arr1 is subset of arr2");
        }

        else{
            System.out.println("arr1 is not subset of arr2");
        }


    }
}

