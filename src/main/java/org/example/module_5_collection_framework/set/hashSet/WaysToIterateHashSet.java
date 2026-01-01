package org.example.module_5_collection_framework.set.hashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class WaysToIterateHashSet {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<>(Arrays.asList("Apple", "Banana", "Cherry", "Date"));

        System.out.println("Iterating using for-each loop:");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        System.out.println("\nIterating using forEach method with lambda:");
        fruits.forEach(fruit -> System.out.print(fruit + " "));
        System.out.println();

        System.out.println("\nIterating using Iterator:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
