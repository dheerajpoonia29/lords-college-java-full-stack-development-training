package org.example.module_5.list.linkedList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class WaysToIterateLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> obj = new LinkedList<>(Arrays.asList(10,20,30,40,50));

        System.out.println("iteration with for loop");
        for (int i=0; i<obj.size(); i++) {
            System.out.print(obj.get(i) + " ");
        }
        System.out.println();

        System.out.println("iteration with for each loop");
        for(Integer ele: obj) {
            System.out.print(ele + " ");
        }
        System.out.println();

        System.out.println("iteration with while loop");
        int i=0;
        while(i<obj.size()) {
            System.out.print(obj.get(i++) + " ");
        }
        System.out.println();

        System.out.println("iteration with iterator");
        Iterator<Integer> itr = obj.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        System.out.println("iteration with list iterator");
        ListIterator<Integer> lstItr = obj.listIterator(3);
        while(lstItr.hasPrevious()) {
            System.out.print(lstItr.previous() + " ");
        }
        System.out.println();

        System.out.println("iteration with iterator reference to descendingIterator method returend object");
        Iterator<Integer> itrObj2 = obj.descendingIterator();
        while (itrObj2.hasNext()) {
            System.out.print(itrObj2.next() + " ");
        }
        System.out.println();
    }
}

