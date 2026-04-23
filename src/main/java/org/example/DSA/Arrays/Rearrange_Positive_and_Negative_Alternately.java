package org.example.DSA.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Input:
//        [-1, 2, -3, 4, -5, 6]

public class Rearrange_Positive_and_Negative_Alternately {



    static  void  rearrange(int arr[]){

        List<Integer> pos = new ArrayList<>();

        List<Integer> neg = new ArrayList<>();

        for (int num : arr){
            if (num >= 0){
                pos.add(num);
            }

            else{
                neg.add(num);
            }
        }


        int p = 0, n = 0, i= 0;
        //Merging the elements alternatively
        while(p<pos.size() && n < neg.size()) {
            arr[i++] = neg.get(n++);
            arr[i++] = pos.get(p++);
        }


        //arrganging the remaining elements
        while (n<neg.size()){
            arr[i++] = neg.get(n++);
        }

        while (p<pos.size()){
            arr[i++] = pos.get(p++);
        }
    }


    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int n = scanner.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements in the array");
        for (int i =0;i<n;i++){
            arr[i] = scanner.nextInt();
        }

        rearrange(arr);


        System.out.println("Resultant Elements after Rearrange alternatively");
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
