package org.example.module_5_collection_framework.list.arrayList.questions;

import java.util.ArrayList;

public class Question4 {
    public static void main(String[] args) {
        // Write a program to demonstrate how to create an ArrayList, add elements to it, and print the elements.
        // Create an ArrayList
        java.util.ArrayList<String> fruits = new java.util.ArrayList<>();

        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");

        ArrayList<String> array1 = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();

        for (int i=0; i<fruits.size(); i++) {
            String ele = fruits.get(i);

            if(array1.contains(ele) == false) {
                array1.add(ele);
                array2.add(1);
            } else {
                int index = array1.indexOf(ele);
                int prevCount = array2.get(index);
                array2.set(index, prevCount+1);
            }
        }

        // print output
        for(int i=0; i<array1.size(); i++) {
            System.out.println(array1.get(i) + ": " + array2.get(i));
        }
    }
}
