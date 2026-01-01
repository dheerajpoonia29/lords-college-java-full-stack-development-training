package org.example.module_5_collections_map_generic.map.hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LearningHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();

        // add pair in hashmap
        hm.put(1, "apple");
        hm.put(2, "banana");
        hm.put(3, "grapes");
        hm.put(2, "orange"); // updating the value for key 2
        hm.put(null, "mango"); // adding null key
        hm.put(4, null);
        hm.put(5, null);
        hm.put(6, "apple");
        hm.putIfAbsent(3, "kiwi"); // will not update as key 3 is already present
        System.out.println("HashMap: " + hm);

        System.out.println("Value for key 2: " + hm.get(2)); // search value based on key
        System.out.println("Value for key 10: " + hm.get(10));
        System.out.println("value for key 10: " + hm.getOrDefault(10, "not found"));


        // search key presence
        System.out.println("Is key 3 present? " + hm.containsKey(3));

        // search value presence
        System.out.println("Is value 'banana' present? " + hm.containsValue("banana"));


        // get list of keys
        ArrayList<Integer> arrayListOfKeys = new ArrayList<>(hm.keySet());
        System.out.println("Keys: " + arrayListOfKeys);

        // get list of values
        ArrayList<String> arrayListOfValues = new ArrayList<>(hm.values());
        System.out.println("Values: " + arrayListOfValues);

        // get pair entries
        Set<Map.Entry<Integer, String>> pairsList = hm.entrySet();
        System.out.println("Pairs: " + pairsList);


    }
}
