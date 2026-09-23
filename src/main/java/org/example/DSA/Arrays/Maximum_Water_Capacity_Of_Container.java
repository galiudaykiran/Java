package org.example.DSA.Arrays;
//Given an array of vertical line heights, find two lines that can form a container holding the **maximum amount of water**.
//
//Return the **maximum water capacity** that can be stored between those two lines.

//Formula:
//Water = min(height[left], height[right]) × (right - left)



//{1, 8, 6, 2, 5, 4, 8, 3, 7};


import java.util.Scanner;

public class Maximum_Water_Capacity_Of_Container {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the no of  heights ");
        int n = scanner.nextInt();

        int arr[] =  new int[n];

        System.out.println("Enter the heights ");
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }

        System.out.println(maxwater(arr));


    }

    static int maxwater(int arr[]){



        int left = 0;
        int right = arr.length-1;

        int maxwater = 0;

        while(left <right){

            int width = right -left;

            int minheight =  Math.min(arr[left],arr[right]);

            int  water  =   width*minheight;

            maxwater = Math.max(maxwater,water);

            if(arr[left]<arr[right]){
                left++;
            }else{
                right--;
            }


        }

      return maxwater;

    }



}



//int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
//Formula
//
//        Water = width × minimum height
//
//where:
//
//width = right - left
//
//Start:
//
//left = 0 → height = 1
//right = 8 → height = 7
//
//So:
//
//width = 8 - 0 = 8
//minimum height = min(1, 7) = 1
//
//water = 8 × 1 = 8
//
//Move left because 1 < 7.


//Next:
//
//left = 1 → height = 8
//right = 8 → height = 7
//width = 8 - 1 = 7
//minimum height = min(8, 7) = 7
//
//water = 7 × 7 = 49
//
//So maximum is now 49.