package org.example.module_5_collection_framework.queue.priorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class LearningPriorityQueue {
    public static void main(String[] args) {
        // declare Priority Queue
        // min heap algorithm
        PriorityQueue<Integer> q = new PriorityQueue<>();

        q.offer(30);
        q.offer(10);
        q.offer(20);
        q.offer(5);

        // 30 10 20 5

        for(Integer ele: q) {
            System.out.print(ele + " ");
        }
        System.out.println();


        PriorityQueue<Integer> q2 = new PriorityQueue<>(Collections.reverseOrder());
        q2.offer(30);
        q2.offer(10);
        q2.offer(20);
        q2.offer(5);

        for(Integer ele: q2) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
