package org.example.DSA.Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Subarray_sum_equals_to_K_Hashmap {


    static  int  subarratHashmap(int arr[], int k){
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        int count = 0;
        int sum = 0;

        for (int num : arr){
            sum = sum +num;

            if(map.containsKey(sum-k)){
                count = count+ map.get(sum-k);
            }

            map.put(sum, map.getOrDefault(sum,0)+1);
        }

        return  count;
    }



    static void main() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

         int k = sc.nextInt();

        System.out.println(subarratHashmap(arr,k));
    }
}
