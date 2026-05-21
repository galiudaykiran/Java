package org.example.DSA.General;

import java.util.Scanner;

public class Discount_Problem {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the original price of the product : ");
        double org_price = scanner.nextDouble();

        System.out.println("Enter the discount of the product : ");
        double dicount = scanner.nextDouble();

        discount_problem(org_price,dicount);
    }

    static void discount_problem(double price,double discount){

        double discount_ammount = (discount/100)*price;
        double final_price = price-discount_ammount;

        System.out.println("Final Price : "+final_price);

    }
}
