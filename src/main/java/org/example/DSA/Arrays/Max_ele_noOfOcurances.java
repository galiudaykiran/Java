package org.example.DSA.Arrays;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Max_ele_noOfOcurances {

    static void main() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;

        for(int i = 0;i<n;i++){
           if (arr[i]>max){
               max = arr[i];
           }
        }


        int maxcount = 0;
        for(int i = 0;i<n;i++ ){
            if (arr[i]== max){
               maxcount++;
            }
        }

        System.out.println(maxcount+" ");


    }
}
