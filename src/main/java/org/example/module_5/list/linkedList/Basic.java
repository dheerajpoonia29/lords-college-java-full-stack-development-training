package org.example.module_5.list.linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Basic {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Chandler"); // head
        linkedList.add("joey");
        linkedList.add("Abc");
        linkedList.add("Xyz"); // tail

        System.out.println(linkedList.get(2));

        System.out.println("Before remove: " + linkedList.get(2));
        linkedList.remove(2);
        System.out.println("After remove: " + linkedList.get(2));

        System.out.println(linkedList.size());

        System.out.println(linkedList.contains("Xyz"));
        System.out.println(linkedList.indexOf("Xyz"));
        System.out.println(linkedList.indexOf("Xyzzzzz"));

        String[] arr = linkedList.toArray(new String[0]);
        System.out.println("first element of arr: " + arr[1]);
    }
}
