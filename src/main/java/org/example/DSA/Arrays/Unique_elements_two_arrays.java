package org.example.DSA.Arrays;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Unique_elements_two_arrays {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size and elements of First array");

        int n = sc.nextInt();

        int arr1[] = new int[n];

        for (int i = 0;i<n;i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the size and elements of Second array");

        int m = sc.nextInt();

        int arr2[] = new int[m];

        for (int i =0 ;i<m;i++){
            arr2[i] = sc.nextInt();
        }


        int combinedarray[] = new int[arr2.length+arr1.length];

        int combinedsize = 0;


        // coping the elements to the third array
        for(int i = 0;i<arr1.length;i++){
         combinedarray[combinedsize++] = arr1[i];
        }

        for (int i = 0;i<arr2.length;i++){
            combinedarray[combinedsize++] = arr2[i];
        }

        int unique[] = new int[combinedsize];
        int uniquesize =0;



        for (int i = 0;i<combinedsize;i++){

            boolean isduplicate = true;

            for (int j = 0;j<uniquesize;j++){
                if (combinedarray[i] == unique[j]){
                    isduplicate = false;
                    break;
                }
            }

            if (!isduplicate){
                unique[uniquesize++] = combinedarray[i];
            }
        }


        System.out.println("Unique elements ");
        for (int i = 0;i<uniquesize;i++){
            System.out.println(unique[i]+ " ");
        }
    }
}
