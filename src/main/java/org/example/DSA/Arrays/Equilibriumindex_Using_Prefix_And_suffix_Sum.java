package org.example.DSA.Arrays;

import java.util.Scanner;

public class Equilibriumindex_Using_Prefix_And_suffix_Sum {


    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size and elements for the array ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = scanner.nextInt();
        }


        int pr[] = new int[n];

        pr[0] = arr[0];

        for (int i = 1;i<n;i++){

            pr[i] = pr[i-1] +arr[i];

        }



        int sf2[] = new int[n];

        sf2[n-1] = arr[n-1];

        for (int i = n-2;i>=0;i--){

            sf2[i] = sf2[i+1] +arr[i];

        }

       int equi_index = -1;
        for (int i = 0;i<n;i++){
            if (pr[i] == sf2[i]){
                equi_index =i;
                break;
            }
        }

        System.out.println("Equilibrium Index : "+equi_index);




    }



}
