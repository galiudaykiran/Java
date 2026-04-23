package org.example.DSA.Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Count_Frequency_of_Elements {


    static  void count_frequency(int arr[]){

        Map<Integer,Integer> map = new HashMap<>();

        for (int num : arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        System.out.println("counting frequency");
        System.out.println(map);
    }




    static  void first_non_repetitive(int arr[]){
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        System.out.println("first  non repetitive number");
        for ( int num : arr ){
            if (map.get(num) == 1){
                System.out.println(num);
                break;
            }
        }
    }




    static void non_repetitive(int arr[]){
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        System.out.println("Non repetitive numbers");
        for (int num : arr){
            if (map.get(num) == 1){
                System.out.println(num);
            }
        }

    }



    static  void first_repetitive(int arr[]){
        Map<Integer,Integer> map = new HashMap<>();

        for (int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        System.out.println("First repetitive numbers");


        for (int num : arr){
            if (map.get(num)>1){
                System.out.println(num);
                break;
            }
        }
    }


    static  void repetitive_numbers(int arr[]){

        Map<Integer,Integer> map = new HashMap<>();
        for (int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        System.out.println("Repetitive numbers ");
        for (int num : arr){
            if (map.get(num)>1)
            {
                System.out.println(num);
            }
        }
    }


    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");

        int n = sc.nextInt();

        System.out.println("Enter the elements in the array");

        int arr[] = new  int[n];

        for (int i = 0;i<n;i++){
            arr[i] = sc.nextInt();

        }

        count_frequency(arr);

        first_non_repetitive(arr);
        non_repetitive(arr);


        first_repetitive(arr);
        repetitive_numbers(arr);



    }
}
