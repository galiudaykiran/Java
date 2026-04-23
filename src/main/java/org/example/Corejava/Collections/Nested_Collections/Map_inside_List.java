package org.example.Corejava.Collections.Nested_Collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map_inside_List {
    static void main() {
        Map<String, List<String>> studentsubjects = new HashMap<>();

        studentsubjects.put("uday", Arrays.asList("Java","OS","DBMS"));
        studentsubjects.put("Dhanalaxmi",Arrays.asList("Python","chemistry","ML"));

        System.out.println(studentsubjects);
        System.out.println(studentsubjects.get("uday"));
        System.out.println(studentsubjects.get("uday").get(1));


    }
}
