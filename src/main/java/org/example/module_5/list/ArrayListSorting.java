package org.example.module_5.list;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {
    public static void main(String[] args) {
        ArrayList<Integer> myArr = new ArrayList<>();
        myArr.add(10);
        myArr.add(5);
        myArr.add(20);
        myArr.add(15);

        for(Integer num: myArr) {
            System.out.print(num + " ");
        }
        System.out.println();

        myArr.sort(null); // Sort in ascending order

        System.out.println("ArrayList after sorting in ascending order:");
        for(Integer num: myArr) {
            System.out.print(num + " ");
        }

        myArr.sort(Collections.reverseOrder());
        System.out.println("\nArrayList after sorting in descending order:");
        for(Integer num: myArr) {
            System.out.print(num + " ");
        }
    }
}
