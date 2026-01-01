package org.example.module_5_collections_map_generic.collection_framework.list.arrayList.questions;

import java.util.ArrayList;

public class Question3 {
    public static void main(String[] args) {
        ArrayList<String> input = new ArrayList<>();
        input.add("Java");
        input.add("Python");
        input.add("C++");
        input.add("JavaScript");
        input.add("Ruby");
        printArrayList(input);


        solution1(input);
        solution2(input);

    }

    public static void solution1(ArrayList<String> input) {
        // logic
        System.out.println("Solution1");
        ArrayList<String> output = new ArrayList<>();
        for(int i= input.size()-1; i>=0; i--) {
            output.add(input.get(i));
        }
        printArrayList(output);
    }

    public static void solution2(ArrayList<String> input) {
        // logic
        System.out.println("Solution2");

        int i=0, j = input.size()-1;
        while(i<j) {
            String valueAtI = input.get(i);
            String valueAtJ = input.get(j);

            input.set(i, valueAtJ);
            input.set(j, valueAtI);

            i++;
            j--;
        }

        printArrayList(input);
    }

    public static void printArrayList(ArrayList<String> list) {
        for (String element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

}
