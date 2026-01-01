package org.example.module_5_collections_map_generic.collection_framework.list.arrayList.questions;

import java.util.ArrayList;

public class Question2 {
    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>();
        input.add(4);
        input.add(9);
        input.add(1);
        input.add(7);
        input.add(9);


        // logic
        Integer largest = Integer.MIN_VALUE;
        Integer secondLargest = Integer.MIN_VALUE;

        for (Integer ele: input) {
            if(ele > largest) {
                secondLargest = largest;
                largest = ele;
            } else if (ele > secondLargest) {
                secondLargest = ele;
            }
        }

        /*
        4,9,1,7,9
        largest = -10
        secondLargest = -10

        ele = 4
        4 > -10
        secondLargest = -10
        largest = 4
         */

        // print the output
        System.out.println("Second largest element is: " + secondLargest);
    }
}
