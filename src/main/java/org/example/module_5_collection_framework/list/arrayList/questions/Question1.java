package org.example.module_5_collection_framework.list.arrayList.questions;

import java.util.ArrayList;

public class Question1 {
    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>();
        input.add(10);
        input.add(20);
        input.add(10);
        input.add(30);
        input.add(20);
        input.add(40);
        printArrayList(input);

        // logic
        solution1(input);
//        solution2(input);

        // print the output
    }

    private static void solution1(ArrayList<Integer> input) {
        ArrayList<Integer> output = new ArrayList<>();
        for (Integer ele: input) {
            if(output.contains(ele)==false) {
                output.add(ele);
            }
        }
        printArrayList(output);
    }

    private static void solution2(ArrayList<Integer> input) {
        for (Integer i=0; i<input.size(); i++){
            Integer currEle = input.get(i);
            for (Integer j = i+1; j<input.size(); j++) {
                Integer nextEle = input.get(j);
                if(currEle.equals(nextEle)) {
                    input.remove(j);
                    j--; // Adjust index after removal
                }
            }
        }
        printArrayList(input);
    }

    public static void printArrayList(ArrayList<Integer> list) {
        for (Integer element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
