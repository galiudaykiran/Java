package org.example.DSA.Arrays;

public class RemoveDuplicatesBruteForce {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 4};

        int n = arr.length;


        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                System.out.print(arr[i]+ " ");
            }
        }


    }
}
