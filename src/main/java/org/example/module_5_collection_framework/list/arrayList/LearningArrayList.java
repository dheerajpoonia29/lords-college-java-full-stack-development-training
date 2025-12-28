package org.example.module_5_collection_framework.list.arrayList;

import java.util.ArrayList;

public class LearningArrayList {
    public static void main(String[] args) {

        // ArrayList of type Integer
        ArrayList<Integer> numbers = new ArrayList();
        // ---- 1: add method ----
        numbers.add(1); // add element at 0th index
        numbers.add(2); // add element at 1st index

        // ---- 2: get method ----
        System.out.println("element at 2nd index: " + numbers.get(1));
        numbers.add(20); // add element at 0th index
        numbers.add(30);

        // ---- 3: add method with index ----
        numbers.add(1, 60); // add with index method shift the elements to right side
        System.out.println("element at 1st index: " + numbers.get(1));
        System.out.println("element at 2nd index: " + numbers.get(2));

        // ---- 4: set method ----
        numbers.set(1, 100); // set method replace the element at specified index, it does not shift the elements
        System.out.println("element at 1st index: " + numbers.get(1)); // 100

        // ---- 5: remove method ----
        numbers.remove(1);

        // ---- 6: size method ----
        Integer arraySize = numbers.size();
        System.out.println("Size of ArrayList: " + arraySize);

        // --- 7: indexOf method ----
        Integer indexOf30 = numbers.indexOf(30);
        System.out.println("Index of 30: " + indexOf30);

        // --- 8: lastIndexOf method ----
        numbers.add(30);
        Integer lastIndexOf30 = numbers.lastIndexOf(30);
        System.out.println("Last Index of 30: " + lastIndexOf30);

        // --- 9: isEmpty ----
        Boolean isArrayEmpty = numbers.isEmpty();
        System.out.println("Is ArrayList empty: " + isArrayEmpty);

        // --- 10: contains method ----
        Boolean isArrayContains20 = numbers.contains(20);
        System.out.println("Is ArrayList contains 20: " + isArrayContains20);

        // --- 11: clear method ----
        numbers.clear();
        System.out.println("Size of ArrayList after clear method: " + numbers.size());



        // ArrayList of type String
        ArrayList<String> array = new ArrayList();
        array.add("First");
        array.add("Second");
        array.add(null);

        // --- 12: toArray method ----
        String myArr[] = (String[]) array.toArray();
    }
}
