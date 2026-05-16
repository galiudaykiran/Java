package org.example.DSA.Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Merge_two_sorted_arrays_Using_Map {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array 1 : ");
        int n1 = scanner.nextInt();

        System.out.println("Enter the elements into the array 1 : ");
        int arr1[] = new int[n1];
        for (int i = 0; i< n1; i++){
            arr1[i] = scanner.nextInt();
        }

        System.out.println("Enter the size of the array 2 : ");
        int n2 = scanner.nextInt();

        System.out.println("Enter the elements into the array 2 : ");
        int arr2[] = new int[n2];

        for (int i = 0;i<n2;i++){
            arr2[i] = scanner.nextInt();
        }

      marge(arr1,arr2);

    }




    static  void  marge(int[] arr1,int[] arr2 ){

        Map<Integer,Integer> map = new HashMap<>();

        for (int n1 : arr1){
            map.put(n1,map.getOrDefault(n1,0)+1);
        }

        for (int n2 : arr2){
            map.put(n2,map.getOrDefault(n2,0)+1);
        }


        for (int key : map.keySet()){
            int freq = map.get(key);
            while (freq >0){
                System.out.print(key+" ");
            }
        }
    }
}
