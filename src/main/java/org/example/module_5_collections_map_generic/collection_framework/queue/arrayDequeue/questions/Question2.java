package org.example.module_5_collections_map_generic.collection_framework.queue.arrayDequeue.questions;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Stack;

public class Question2 {
    public static void main(String[] args) {
//        ArrayDeque<Integer> input = new ArrayDeque<>(Arrays.asList(10, 20, 30, 40, 50));

        ArrayDeque<Integer> input = new ArrayDeque<>(Arrays.asList(10, 20, 30, 20, 10));

        // logic - to check if Queue is palindrome
        boolean isPalindrome = true;

        Stack<Integer> stack = new Stack<>();
        int n = input.size();

        int i = 0;
        while(!input.isEmpty()) {
            if(n%2!=0 && i==n/2) {
                // skip the middle element for odd sized queue
                input.poll();
                i++;
                continue;
            }
            if(i<n/2) {
                stack.push(input.poll());
                i++;
                continue;
            } else {
                Integer ele = input.poll();
                if(!stack.isEmpty() && ele.equals(stack.peek())) {
                    stack.pop();
                } else {
                    isPalindrome = false;
                    break;
                }
            }
        }

        System.out.println(isPalindrome ? "Palindrome" : "Not a Palindrome");
    }
}
