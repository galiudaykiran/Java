package org.example.Corejava.Collections.Nested_Collections;

import java.util.*;

public class Map_inside_list_values_from_users {
    static void main() {
        Scanner Sc = new Scanner(System.in);

        Map<String, List<String>> studentsubjects = new HashMap<>();

        int n = Sc.nextInt();

        for (int i = 0;i<n;i++){

            System.out.print("Enter the Student Name");

            String name = Sc.next();




            // Split and convert to List
            List<String> subjects = Arrays.asList(Sc.nextLine());


            studentsubjects.put(name,subjects);
        }

        System.out.println(studentsubjects);
    }
}
