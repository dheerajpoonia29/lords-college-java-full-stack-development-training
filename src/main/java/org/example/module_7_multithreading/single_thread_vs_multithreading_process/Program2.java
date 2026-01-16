package org.example.module_7_multithreading.single_thread_vs_multithreading_process;

public class Program2 {
    public static void main(String[] args) {

        // Program2 is multi-threaded program
        // jvm will also hold 2 mb ram for program1

        Task1Thread t1Thread = new Task1Thread(); // 1 kb
        Task2Thread t2Thread = new Task2Thread(); // 1 kb
        Task3Thread t3Thread = new Task3Thread(); // 1 kb

        t1Thread.start();
        t2Thread.start();
        t3Thread.start();
    }
}

class Task1Thread extends Thread {
    int a = 10;
    public void run() {
        System.out.println("task1 is running");
    }
}

class Task2Thread extends Thread {
    int a = 10;
    public void run() {
        System.out.println("task2 is running");
    }
}

class Task3Thread extends Thread {
    public void run() {
        System.out.println("task3 is running");
    }
}