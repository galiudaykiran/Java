package org.example.Corejava.Collections.Map;

import java.util.HashMap;
import java.util.Map;


//🔹 How HashMap Works Internally (Interview Gold ⭐)
//
//1️⃣ Key → hashCode()
//2️⃣ Hash → bucket index (array)
//3️⃣ If collision → store in linked list (or tree in Java 8+)
//4️⃣ On get(key) → compare equals() inside bucket


// operations
// get , put , remove

public class HashMap_imp {
    public static void main(String[] args){
        Map<Integer,String> h_map = new HashMap<>();

        h_map.put(1,"java");
        h_map.put(2,"spring");
        h_map.put(1,"boot");

        System.out.println(h_map.get(1));




        Map<String,Integer>  mp = new HashMap<>();

        mp.put("java",1);
        mp.put("spring",2);
        System.out.println(mp.containsKey("java"));
        System.out.println(mp.containsValue(2));


        for(Map.Entry<String,Integer> e : mp.entrySet()){
            System.out.println(e.getKey()+ " = "+e.getValue());
        }


    }
}
