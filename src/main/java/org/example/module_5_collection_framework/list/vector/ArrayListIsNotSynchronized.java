package org.example.module_5_collection_framework.list.vector;

import java.util.ArrayList;

public class ArrayListIsNotSynchronized {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> arrayList = new ArrayList<>();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i <= 1000; i++) {
                arrayList.add(i);
            }
            // arrayList.size = 1000
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i <= 1000; i++) {
                arrayList.add(i);
            }
            // arrayList.size = 2000
        });

        System.out.println("Initial size: " + arrayList.size()); // Expected: 0

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("ArrayList size after thread start: " + arrayList.size()); // Expected: 2000, Actual: ?

    }
}
