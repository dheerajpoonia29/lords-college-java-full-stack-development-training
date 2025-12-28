package org.example.module_5_collection_framework.list.linkedList.output;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class Question4 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>(Arrays.asList("r", "a", "d", "a", "r"));
        System.out.println(solution(ll)); // true
        ll = new LinkedList<>(Arrays.asList("r", "a", "d", "a", "r", "x", "y", "z"));
        System.out.println(solution(ll)); // false
    }

    public static boolean solution(LinkedList<String> ll) {
        ListIterator<String> leftItr = ll.listIterator(); // itr is at head node
        ListIterator<String> rightItr = ll.listIterator(ll.size());

        while(leftItr.nextIndex() < rightItr.previousIndex()) {
            String leftVal = leftItr.next();
            String rightVal = rightItr.previous();

            if(!leftVal.equals(rightVal)) {
                return false;
            }
        }

        return true;
    }
}
