package org.example.module_5_collections_map_generic.map.hashMap.questions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Question2 {
    public static void main(String[] args) {
        String str = "wswissa"; // i & a is non-repeating character

        // write logic to print first non-repeating character
        LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>();
        for (Character ch: str.toCharArray()) {
            if(hm.containsKey(ch) == false) {
                hm.put(ch, 1);
            } else {
                int previousCount = hm.get(ch);
                hm.put(ch, previousCount+1);
            }
        }

        Set<Map.Entry<Character, Integer>> entries = hm.entrySet();
        for(Map.Entry<Character, Integer> pair: entries) {
            if(pair.getValue()==1) {
                System.out.println(pair.getKey());
                break;
            }
        }
    }
}
