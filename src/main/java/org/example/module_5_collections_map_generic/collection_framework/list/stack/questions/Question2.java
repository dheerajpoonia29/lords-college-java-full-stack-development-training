package org.example.module_5_collections_map_generic.collection_framework.list.stack.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Question2 {
    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,5,2,10));

        // logic
        ArrayList<Integer> result = solution(input);

        // print result
        for(int i=result.size()-1; i>=0; i--) {
            System.out.print(result.get(i) + " ");
        }
    }

    public static ArrayList<Integer> solution(ArrayList<Integer> input) {
        ArrayList<Integer> result = new ArrayList<>();

        Stack<Integer> stack = new Stack<>();

        for(int i= input.size()-1; i>=0; i--) {
            int ele = input.get(i);

            if (stack.isEmpty()) {
                result.add(-1);
            } else {
                int stackTopEle = stack.peek();
                if(stackTopEle > ele) {
                    result.add(stackTopEle);
                } else {
                    while(!stack.isEmpty() && stack.peek() <= ele) {
                        stack.pop();
                    }
                    if(!stack.isEmpty()) {
                        result.add(stack.peek());
                    }
                }
            }

            stack.push(ele);
        }

        return result;
    }
}
