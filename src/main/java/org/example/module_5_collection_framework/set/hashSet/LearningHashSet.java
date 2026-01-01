package org.example.module_5_collection_framework.set.hashSet;

import java.util.Arrays;
import java.util.HashSet;

public class LearningHashSet {
    public static void main(String[] args) {
        HashSet<Integer> mySet = new HashSet();

        // add value in HashSet
        mySet.add(5);
        mySet.add(7);
        mySet.add(1);
        System.out.println("HashSet after adding elements: " + mySet);

        HashSet<Integer> mySet2 = new HashSet(Arrays.asList(1,1,2,2,3,3,4,5,6,7));
        mySet2.remove(1);
        mySet2.removeAll(Arrays.asList(6,7));
        System.out.println("HashSet with duplicate elements: " + mySet2);

        System.out.println("HashSet contains 2: " + mySet2.contains(2));
        System.out.println("HashSet contains 7: " + mySet2.contains(7));
    }
}
