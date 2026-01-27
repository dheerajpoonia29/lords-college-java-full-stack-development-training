package org.example.module_7_multithreading.single_thread_vs_multithreading_process;

public class SingleThreadedProgram {

    // Program1 is a single-threaded program

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    static void task1() {
        System.out.println("task1 is running");
    }

    static void task2() {
        System.out.println("task2 is running");
    }

    static void task3() {
        System.out.println("task3 is running");
    }
}
