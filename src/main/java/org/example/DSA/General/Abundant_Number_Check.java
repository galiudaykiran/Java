package org.example.DSA.General;

import java.util.Scanner;

public class Abundant_Number_Check {

    static void main() {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

       int sumofdivisors =0;

      for (int i=1 ;i<n;i++){
          if (n%i == 0){
              sumofdivisors = sumofdivisors+i;
          }
      }


      if (sumofdivisors>n){
          System.out.println("Yes,Given number is abundant Number ");
      }
     else {
          System.out.println("No,Given number is not abundant Number" );
      }
    }

}
