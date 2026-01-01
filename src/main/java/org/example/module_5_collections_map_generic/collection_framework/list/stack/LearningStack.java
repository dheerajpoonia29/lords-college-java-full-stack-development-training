package org.example.module_5_collections_map_generic.collection_framework.list.stack;

import java.util.Stack;

public class LearningStack {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();

        // with push method we add elements to the stack
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);

        System.out.println("Stack after pushes");
        printStack(myStack);

        // with pop method we remove the top element from the stack
        Integer poppedElement = myStack.pop();
        System.out.println("Popped element: " + poppedElement);

        System.out.println("Stack after pop");
        printStack(myStack);

        Integer topElement = myStack.peek();
        System.out.println("Top element (peek): " + topElement);

        System.out.println("Stack after peek (unchanged)");
        printStack(myStack);
    }

    public static void printStack(Stack<Integer> stack) {
       for(Integer element : stack) {
           System.out.print(element + " ");
       }
        System.out.println();
    }
}
