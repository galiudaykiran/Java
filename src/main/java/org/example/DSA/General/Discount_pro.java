package org.example.DSA.General;

import java.util.Scanner;

public class Discount_pro {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int price = scanner.nextInt();


        int discount = 0;


        if (price<1000){
            discount = price *(5 / 100);
        }
        else if (1000 < price && price<=5000) {

            int dis = (10/100);
            System.out.println(price-discount);

        }

        else {
            int dis = 15%100;
            discount = dis*price;
            System.out.println(price-discount);
        }

        System.out.println(price-discount);

    }
}
