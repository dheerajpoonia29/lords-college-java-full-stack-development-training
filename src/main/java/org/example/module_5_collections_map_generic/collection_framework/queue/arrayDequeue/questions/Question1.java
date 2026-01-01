package org.example.module_5_collections_map_generic.collection_framework.queue.arrayDequeue.questions;

import java.util.ArrayDeque;
import java.util.Arrays;

public class Question1 {
    public static void main(String[] args) {
        // declaration with intialization of ArrayDeque
        ArrayDeque<Integer> input = new ArrayDeque<>(Arrays.asList(10, 20, 30, 40, 50));
        int k = 3;

        // logic - print first k elements
        for(Integer ele: input) {
            if(k==0) break;
            System.out.print(ele + " ");
            k--;
        }

    }
}
