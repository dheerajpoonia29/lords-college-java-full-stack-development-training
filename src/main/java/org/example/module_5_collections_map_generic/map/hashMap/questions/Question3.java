package org.example.module_5_collections_map_generic.map.hashMap.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Question3 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2, 7, 11, 15));
        int target = 9;

        // a+b = c
        /*
        b = c-a
        we store b in hashmap with index
        will store a also in hashmap with index
         */

        // write logic to find indices of two numbers such that they add up to target
        HashMap<Integer, Integer> hm = new HashMap<>();

        int c = target;

        for(int i=0; i<arr.size(); i++) {
            int a = arr.get(i);
            int b = c - a;
            if (hm.containsKey(a)==false) {
                hm.put(b, i);
            } else {
                System.out.println("[" + hm.get(a) + ", " + i + "]");
                break;
            }
//            System.out.println("Current a: " + a + ", b: " + b + ", hm: " + hm);
        }
    }
}
