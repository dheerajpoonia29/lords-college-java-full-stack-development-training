package org.example.module_5_collection_framework.list.linkedList.questions;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Question3 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7)); // expected output = 3
        int[] result = getMiddle(ll);
        System.out.println("Middle element(s): " + result[0]);

        LinkedList<Integer> ll2 = new LinkedList<>(Arrays.asList(1,2,3,4)); // expected output = 2,3
        result = getMiddle(ll);
        System.out.println("Middle element(s): " + result[0] + ", " + result[1]);
    }

    public static int[] getMiddle(LinkedList<Integer> ll) {
        Iterator<Integer> slowItr = ll.iterator();
        Iterator<Integer> fastItr = ll.iterator();

        Integer middleLeft = null;
        Integer middle = null;


        while(fastItr.hasNext()) {
            fastItr.next(); // first move of fast itr
            if(fastItr.hasNext() == false) break;
            fastItr.next();

            // we get middle element as well slow itr move with 1 step toward right direction
            middleLeft = middle;
            middle = slowItr.next();
        }

        return new int[]{middleLeft, middle};
    }
}
