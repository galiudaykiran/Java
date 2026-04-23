package org.example.DSA.Arrays;

public class Find_Duplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 4};

        System.out.print("Duplicate elements: ");

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    break; // avoid printing same duplicate multiple times
                }
            }
        }
    }
}
