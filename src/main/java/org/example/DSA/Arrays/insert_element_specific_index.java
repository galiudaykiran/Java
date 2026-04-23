package org.example.DSA.Arrays;

import java.util.Scanner;

public class insert_element_specific_index {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array ");

        int n = sc.nextInt();
        int[] arr = new int[n];



        for(int i = 0;i<n;i++){
        arr[i] = sc.nextInt();
        }


        System.out.println("enter the index where u want to insert   and also element");
        int index = sc.nextInt();
        int newElement = sc.nextInt();

        int[] newArr = new int[arr.length + 1];



        // before index
        for(int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }



        // insert
        newArr[index] = newElement;

        // after index
        for (int i = index; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
