package org.example.module_5.list.linkedList.output;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Question2 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        // E, D, C, B, A

        // initial linked list ll is
        System.out.println("Before reversing:");
        Question1.printLL(ll);

        // logic which reverse linked list ll object
        ListIterator<String> leftItr = ll.listIterator(); // itr is at head node
        ListIterator<String> rightItr = ll.listIterator(ll.size()); // itr is at tail node

        while(leftItr.nextIndex() < rightItr.previousIndex()) {
            String leftVal = leftItr.next();
            String rightVal = rightItr.previous();

            leftItr.set(rightVal);
            rightItr.set(leftVal);
        }

        // print the reversed linked list
        System.out.println("After reversing:");
        Question1.printLL(ll);
    }
}
