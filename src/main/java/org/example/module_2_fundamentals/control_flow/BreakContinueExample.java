package org.example.module_2_fundamentals.control_flow;

public class BreakContinueExample {
    public static void main(String[] args) {
        for(int i=0; i<=4; i++) {
            if(i<2) continue;
            System.out.println("Iteration: " + i);
            if(i==3) break;
        }
    }
}
