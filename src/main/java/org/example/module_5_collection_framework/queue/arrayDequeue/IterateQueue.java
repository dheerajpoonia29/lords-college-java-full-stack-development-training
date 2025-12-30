package org.example.module_5_collection_framework.queue.arrayDequeue;

import java.util.ArrayDeque;
import java.util.Iterator;

public class IterateQueue {
    public static void main(String[] args) {
        ArrayDeque<Integer> myQueue = new ArrayDeque<>();
        myQueue.offer(10);
        myQueue.offer(20);
        myQueue.offer(30);
        myQueue.offer(40);

//        Queue does not support index based access, because get method is not defined in Queue interface
//        for(int i=0; i<myQueue.size(); i++) {
//            int ele = myQueue.get(i);
//        }

        System.out.println("Iterating using for-each loop:");
        for(Integer element : myQueue) {
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.println("Iterating using iterator:");
        Iterator<Integer> iterator = myQueue.iterator();
        while(iterator.hasNext()) {
            Integer element = iterator.next();
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.println("Iterating using while loop:");
        while(myQueue.isEmpty() == false) {
            Integer element = myQueue.poll();
            System.out.print(element + " ");
        }
        System.out.println("queue size after polling all elements: " + myQueue.size());

    }
}
