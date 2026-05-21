package org.example.DSA.Arrays;

import java.util.Scanner;

public class Equilibriumindex_Using_One_Prefix_Sum {
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


        for (int i = 0;i<pr.length;i++){
            int leftsum =0;
            int rightsum = 0;
            if (i == 0){
                leftsum =0;
            }

            else {
                leftsum  = pr[i-1];
            }

            rightsum = pr[n-1]-pr[i];

            if (leftsum == rightsum)
            {
                System.out.println("Equilibrium Index : "+i);
            }
        }


    }
}
