package org.example.DSA.Search.Binary_Search_Pattern;

import java.util.Scanner;


//Input: [1,3,5,6]
//target = 2
//Output:1(index)


public class Search_Insert_Position {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = scanner.nextInt();

        System.out.println("Enter the elements into array : ");
        int arr[] = new int[n];
        for (int i = 0;i<n;i++){
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the insert position");
        int tar_pos = scanner.nextInt();
        sear_ins_pos(arr,tar_pos);
    }


    static  void sear_ins_pos(int arr[],int target){
        int  left = 0;
        int right = arr.length;

        while (left<=right){
            int mid = (left+right)/2;
            if (arr[mid] ==  target){
                System.out.println(mid);

            }

            else if(arr[mid]<target) {
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }

        System.out.println(left);;
    }
}
