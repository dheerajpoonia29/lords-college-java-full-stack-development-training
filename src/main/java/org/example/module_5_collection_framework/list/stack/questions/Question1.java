package org.example.module_5_collection_framework.list.stack.questions;

import java.util.Stack;

public class Question1 {
    public static void main(String[] args) {

        // logic to check Valid Parentheses
//        boolean isValid = solution("{[()]}");
//        boolean isValid = solution("{[(])}");
        boolean isValid = solution("{{[[(())]]}}");

        // print result
        if(isValid) {
            System.out.println("The parentheses are valid.");
        } else {
            System.out.println("The parentheses are not valid.");
        }
    }

    public static boolean solution(String str) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            } else {
                if(!stack.isEmpty()) {
                    Character topChar = stack.pop();
                    switch(topChar) {
                        case '{':
                            if(ch !='}') return false;
                            break;
                        case '[':
                            if(ch !=']') return false;
                            break;
                        case '(':
                            if(ch !=')') return false;
                            break;
                        default:
                            return false;
                    }
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
