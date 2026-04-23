package org.example.DSA.Arrays;

import java.util.Scanner;

// count ag pair
// [ a g a g]

// output: 3

public class Count_ag_pair {
    static void main() {
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter the size and elements of first array");

        int n = scanner.nextInt();

        char arr[] = new char[n];

        System.out.println("enter the elements of first array");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.next().charAt(0);
        }


        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == 'a' ) {
                    if (arr[j] == 'g'){
                        count++;
                    }
                }
            }
        }

        System.out.println(count);


    }
}
