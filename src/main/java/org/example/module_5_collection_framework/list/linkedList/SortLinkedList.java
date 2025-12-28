package org.example.module_5_collection_framework.list.linkedList;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class SortLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> obj = new LinkedList<>(Arrays.asList(30, 10, 60, 5, 100, 0));

        obj.sort(null); // sort in asenceding order

        System.out.println("loop 1");
        for(Integer ele: obj) {
            System.out.print(ele + " ");
        }
        System.out.println();

        obj.sort(Collections.reverseOrder()); // descending order sorting
        System.out.println("loop 2");
        for(Integer ele: obj) {
            System.out.print(ele + " ");
        }
        System.out.println();

        Collections.sort(obj);
        System.out.println("loop 3");
        for(Integer ele: obj) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
