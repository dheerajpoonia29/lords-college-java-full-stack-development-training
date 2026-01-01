package org.example.module_5_collections_map_generic.collection_framework.list.linkedList.questions;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class Question6 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>(Arrays.asList("Java", "Python", "Java", "C++", "Java", "Python", "JavaScript", "Python", "Ruby"));

        System.out.println("Original LinkedList:");
        Question1.printLL(ll);

        ListIterator<String> leftItr = ll.listIterator(); // itr is at head node
        ListIterator<String> rightItr = ll.listIterator(ll.size());

        String target = "Java";
        Boolean firstRemoved = false;
        Boolean lastRemoved = false;

        while(leftItr.nextIndex() < rightItr.previousIndex() || (!firstRemoved && !lastRemoved)) {

            if(firstRemoved==false && leftItr.hasNext() && leftItr.next().equals(target)) {
                leftItr.remove();
                firstRemoved = true;
            } else {
                leftItr.next();
            }

            if(lastRemoved==false && rightItr.hasPrevious() && rightItr.previous().equals(target)) {
                rightItr.remove();
                lastRemoved = true;
            } else {
                rightItr.previous();
            }
        }

        System.out.println("After remove first and last elements of linked list:");
        Question1.printLL(ll);
    }
}
