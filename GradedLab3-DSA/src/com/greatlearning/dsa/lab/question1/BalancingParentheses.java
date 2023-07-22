package com.greatlearning.dsa.lab.question1;

import java.util.Scanner;
import java.util.Stack;

public class BalancingParentheses {
    Stack<Character> stack = new Stack<>();

    public String getStringExpression(Scanner scanner) {
        System.out.println("Enter the Expression: ");
        return scanner.nextLine();
    }

    public boolean isBalanced(String expression) {
        for (int idx = 0; idx < expression.length(); idx++) {
            char ch = expression.charAt(idx);
            if (ch == '(' || ch == '[' || ch == '{' || ch == ')' || ch == ']' || ch == '}') {
                if (ch == '(' || ch == '{' || ch == '[') {
                    stack.push(ch);
                } else {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    if ((ch == ')' && !(stack.pop() == '('))
                            || (ch == '}' && !(stack.pop() == '{'))
                            || (ch == ']' && !(stack.pop() == '['))) {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
