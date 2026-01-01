package org.example.module_5_collections_map_generic.collection_framework.set.hashSet.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Question1 {
    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 1, 5));

        // ht = ()
        /*
        ele=1 ht(1)
        ele=2 ht(1,2)
        ele=3 ht(1,2,3)
        ele=2 print(2)
        ele=4 ht(1,2,3,4)
        ele=1 print(1)
         */

        // logic to print duplicate elements
        HashSet<Integer> ht = new HashSet<>();

        for(Integer ele: input) {
            if(ht.contains(ele)) {
                System.out.print(ele + " ");
            } else {
                ht.add(ele);
            }
        }

    }
}
