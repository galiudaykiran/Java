package org.example.DSA.Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Two_Sum_using_Map {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = scanner.nextInt();

        System.out.println("enter the elements in the array");
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the target value");
        int target = scanner.nextInt();

        int[] result = two_sum(arr,target);

        System.out.println(result[0]+" "+result[1]);

    }


    static  int[] two_sum(int arr[], int target){

        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0;i<arr.length;i++){
            int compelte = target-arr[i];

            if (map.containsKey(compelte)){
                return  new int[]{map.get(compelte),i};
            }
            map.put(arr[i],i);

        }

        return  new int[]{};
    }
}
