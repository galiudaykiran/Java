package org.example.Corejava.Collections.Nested_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



// Same as matrix

public class List_inside_List {
    static void main() {
        List<List<Integer>> numbers = new ArrayList<>();

        numbers.add(Arrays.asList(1,2,3));
        numbers.add(Arrays.asList(4,5,6));
        numbers.add(Arrays.asList(7,8,9));

        System.out.println(numbers);
        System.out.println(numbers.get(1).get(2));

    }
}
