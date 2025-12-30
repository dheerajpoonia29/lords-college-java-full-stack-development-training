package org.example.module_5_collection_framework.queue.arrayDequeue;

import java.util.ArrayDeque;

public class LearningArrayDequeue {
    public static void main(String[] args) {
        // declare Queue
        ArrayDeque<Integer> myQeueue = new ArrayDeque<>();
        // 10 20 30 40

        // Enqueue - add elements to the end of the queue
        myQeueue.offer(10);
        myQeueue.offer(20);
        myQeueue.offer(30);
        myQeueue.offer(40);

        // Dequeue - remove elements from the front of the queue
        Integer removedElement = myQeueue.poll();
        // 20 30 40
        System.out.println("Removed element: " + removedElement); // 10

        removedElement = myQeueue.poll();
        // 30 40
        System.out.println("Removed element: " + removedElement); // 20
    }
}
