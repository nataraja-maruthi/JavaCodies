package com.nats.strings;

import java.util.Stack;

/**
 * Created by nataraja.maruthi on 1/7/18.
 */
public class CheckValidExpression {
    public static void main(String[] args) {
        String expr = "(a[b]c{c}))";
        Stack<Character> stack = new Stack<>();
        boolean result = true;
        for (int i=0;i<expr.length();i++) {
                if (expr.charAt(i)=='(' || expr.charAt(i)=='{' || expr.charAt(i)=='[') {
                    stack.push(expr.charAt(i));
                } else if (expr.charAt(i)=='}' || expr.charAt(i)==']' || expr.charAt(i)==')'){
                    if (stack.isEmpty()) {
                        result = false;
                        break;
                    }
                    if (!isMatching(stack.pop(),expr.charAt(i))) {
                        result = false;
                        break;
                    }
                }
        }

        System.out.println(result && stack.isEmpty());

    }

    public static boolean isMatching(char c1, char c2) {
        if (c1=='(' && c2==')') {
                return true;
        }
         else if (c1=='[' && c2==']') {
            return true;
        }
        else if (c1=='{' && c2=='}') {
            return true;
        }
        return false;
    }
}

