package org.example.module_5_collections_map_generic.collection_framework.list.linkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListSpecificMethods {
    public static void main(String[] args) {
        LinkedList<Integer> obj = new LinkedList<>(Arrays.asList(30, 10, 60, 5, 100, 0));

        printLL(obj);

        obj.addFirst(90);
        obj.addLast(45);

        printLL(obj);


        obj.removeFirst();
        obj.removeLast();

//        throw exception if linked list is empty
        System.out.println(obj.getFirst() + " " + obj.getLast());

//        return null if linked list if empty
        System.out.println(obj.peekFirst() + " " + obj.peekLast());

        Integer a = obj.pollFirst();
        Integer b = obj.pollLast();
        System.out.println(a + " " + b);
        System.out.println(obj.getFirst() + " " + obj.getLast());
    }

    public static <T> void printLL(LinkedList<T> obj) {
        System.out.println("Printing LL: ");
        for(T ele: obj) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
