package org.example.DSA.Arrays;



//Array = [16, 17, 4, 3, 5, 2]
//Leaders = 17 5 2(Left to right)

import javax.xml.transform.Source;
import java.util.Scanner;

public class Leaders_in_Array {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = scanner.nextInt();

        System.out.println("Enter the elements into array : ");
        int arr[] = new int[n];

        for (int i = 0;i<n;i++){
            arr[i] = scanner.nextInt();
        }

        int maxleader = arr[n-1];
        System.out.println("Leaders : "+maxleader+" ");

        for (int i = n-2;i>=0;i--){
            if (maxleader<arr[i]){
                maxleader = arr[i];
                System.out.print(arr[i]+" ");
            }
        }


    }
}
