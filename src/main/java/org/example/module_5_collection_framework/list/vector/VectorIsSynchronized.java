package org.example.module_5_collection_framework.list.vector;

import java.util.ArrayList;
import java.util.Vector;

public class VectorIsSynchronized {
    public static void main(String[] args) throws InterruptedException {
        Vector<Integer> vector = new Vector<>();

        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 1000; i++) {
                vector.add(i);
            }
            // vector.size = 1000
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 1000; i++) {
                vector.add(i);
            }
            // vector.size = 2000
        });

        System.out.println("Initial size: " + vector.size()); // Expected: 0

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("ArrayList size after thread start: " + vector.size()); // Expected: 2000, Actual: ?

    }
}
