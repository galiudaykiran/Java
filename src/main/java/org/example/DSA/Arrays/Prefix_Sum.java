package org.example.DSA.Arrays;

import java.util.Scanner;

public class Prefix_Sum {
    static void main() {

        Scanner scanner = new Scanner(System.in);


        int n = scanner.nextInt();

        int arr[] = new int[n];

        for (int i = 0;i<n;i++){
            arr[i] = scanner.nextInt();
        }

        int pr[] = new int[n];

        pr[0] = arr[0];

        for (int i = 1;i<n;i++){

            pr[i] = pr[i-1] +arr[i];

        }


        System.out.println("Prefix Sum Array");
        for (int num : pr){
            System.out.print(num+ " ");
        }


// calculating for the even index numbers
//        for (int i = 1;i<n;i++){
//            if (i%2 == 0){
//                pr[i] = pr[i-1] +arr[i];}
//            else {
//                pr[i] = pr[i-1] +0;
//            }
//        }


 // Quieses : example [[1,3][2,1]]

 // if l = 0
  // pf[l] =






    }
}
