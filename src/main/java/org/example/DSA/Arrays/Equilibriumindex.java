package org.example.DSA.Arrays;

import java.util.Scanner;

public class Equilibriumindex {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);


        System.out.println("enter the size and elements for the array ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        
        int leftarr[] = new int[n];
        int rightarr[] = new int[n];


        //left sum
        int left_sum= 0;

        for(int i = 0;i<n;i++){
            left_sum = left_sum+arr[i];
            leftarr[i] = left_sum;
        }




        //right sum

        int right_sum =0;
        for(int i = n-1;i>=0;i--){
            right_sum = right_sum+arr[i];
            rightarr[i] = right_sum;
        }


        int equi_index = -1;
        for(int i = 0;i<n;i++){
            if(leftarr[i]==rightarr[i]){
                equi_index =i;
                break;
            }
        }


        if(equi_index != -1){
            System.out.println("equilibrium  index : "+equi_index);
        }

        else{
            System.out.println("no eqilibrum index");
        }

    }
}
