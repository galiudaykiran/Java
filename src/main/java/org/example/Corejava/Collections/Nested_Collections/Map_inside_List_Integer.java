package org.example.Corejava.Collections.Nested_Collections;

import java.util.*;

public class Map_inside_List_Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Map<String, List<Integer>>  map = new HashMap<>();

        System.out.println("Enter the number of keys");

        int  n = sc.nextInt();
        sc.nextLine();

        for (int i = 0;i<n;i++){
            System.out.print("Enter key : ");

            String key = sc.nextLine();

            System.out.print("Enter the  no values for "+key+": ");
            int m = sc.nextInt();

            List<Integer> list = new ArrayList<>();

            for (int j = 0;j<m;j++){
                System.out.print("Enter value "+(j+1)+" : ");
                list.add(sc.nextInt());
            }
            sc.nextLine();
            map.put(key,list);
        }

        System.out.println("Final Map : "+map );
    }
}
