package org.example.DSA.General;

import java.util.Scanner;

public class Area_Of_Circle {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int r = scanner.nextInt();

        double area = 3.14*r*r;

        System.out.println("Area of the circle : "+area);
    }
}
