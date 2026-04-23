package org.example.Corejava.Collections.Nested_Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List_inside_List_Values_from_user {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        List<List<Integer>> numbers = new ArrayList<>();

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        for (int i = 0;i<n;i++){
            List<Integer> row =  new ArrayList<>();
            System.out.println("Enter the elements for row "+(i+1)+" :");
            for (int j = 0;j<m;j++){
                row.add(scanner.nextInt());
            }
            numbers.add(row);
        }

        System.out.println(numbers);
        System.out.println("Specific row element "+numbers.get(1).get(2));
    }
}
