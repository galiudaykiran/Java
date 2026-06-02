package org.example.DSA.Arrays;



//Array = [16, 17, 4, 3, 5, 2]
//Leaders = 17 5 2(Left to right)





import javax.xml.transform.Source;
import java.util.ArrayList;
import java.util.Collections;
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

         System.out.println("From the right to left : ");
        int maxleader = arr[n-1];
        System.out.println("Leaders : "+maxleader+" ");



        for (int i = n-2;i>=0;i--){
            if (maxleader<arr[i]){
                maxleader = arr[i];
                System.out.print(arr[i]+" ");
            }
        }

//Array = [16, 17, 4, 3, 5, 2]
//Leaders = 2 5 17
        // out put :  from the right to left it will print



        // but output : [17 , 5, 2]

        System.out.println();
        printleadersleft_to_right(arr);

    }

    static void printleadersleft_to_right(int arr[]){

        ArrayList<Integer>  array = new ArrayList<>();

        int n = arr.length;

        int maxleader = arr[n-1];
        array.add(maxleader);

        System.out.println("From the left to right : ");
        for (int i = n-2;i>=0;i--){
            if (maxleader<arr[i]){
                maxleader = arr[i];
                array.add(maxleader);
            }
        }

        Collections.reverse(array);
        System.out.println(array);
    }





}
