package org.example.module_7_multithreading.ways_to_create_thread.thread_life_cycle;

class Result {
    private boolean isResultReady = false;

     void waitForResult() {
        try {
            while (!isResultReady) {
                System.out.println("Student: Waiting for result...");
                wait();
            }
            System.out.println("Student: Result received!");
        } catch (InterruptedException e) {}
    }

     void publishResult() {
        System.out.println("Teacher: Preparing result...");
        isResultReady = true;
        notify();
        System.out.println("Teacher: Result published");
    }
}

public class WaitAndNotify {
    public static void main(String[] args) throws Exception {
        Result result = new Result();

        Thread student = new Thread(() -> {
            result.waitForResult();
        });
        Thread teacher = new Thread(() -> {
            result.publishResult();
        });

        student.start();
        Thread.sleep(2000); // delay to show waiting clearly
        teacher.start();
    }
}
