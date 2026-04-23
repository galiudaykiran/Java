package org.example.DSA.General;

import java.util.Scanner;

public class Permutations {


    static int fact(int n){
        int ans = 1;

        for (int i = 1;i<=n;i++){
            ans = ans *i;
        }
        return  ans;
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Value N : ");

        int n = scanner.nextInt();

        System.out.println("Enter the Value R : ");

        int r = scanner.nextInt();

       int numerator = fact(n);

       int denominator = fact(n-r);

        System.out.println(numerator/denominator);
    }
}
