package org.example.module_5_collection_framework.list.linkedList.questions;

import java.util.Arrays;
import java.util.LinkedList;

public class Question1 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>(Arrays.asList(1,2,1,3,2, 1));

        printLL(ll);

        solution1(ll);
    }

    public static void solution1(LinkedList<Integer> ll) {
        LinkedList<Integer> output = new LinkedList<>();
        for(Integer ele: ll) {
            if(output.contains(ele)) {
                continue;
            } else {
                output.add(ele);
            }
        }

        printLL(output);
    }

    public static <T> void printLL(LinkedList<T> ll) {
        System.out.println("iteration with for each loop");
        for(T ele: ll) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }


}
