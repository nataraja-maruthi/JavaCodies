package com.nats.datastructures;

import java.util.*;
import java.util.Stack;

/**
 * Created by nataraja.maruthi on 1/9/18.
 */
public class StackSortUsingTemp {
    public static void main(String[] args)
    {
        java.util.Stack<Integer> input = new java.util.Stack<>();
        input.add(34);
        input.add(3);
        input.add(31);
        input.add(98);
        input.add(92);
        input.add(23);
        System.out.println("input: "+input);
        System.out.println("final sorted list: "+sortStack(input));
    }

//    private static java.util.Stack<Integer> sortStack(java.util.Stack<Integer> input)
//    {
//        java.util.Stack<Integer> tempStack = new Stack<>();
//        while (!input.isEmpty()) {
//            Integer temp = input.pop();
//            while (!tempStack.isEmpty()&& tempStack.peek()>temp) {
//                input.push(tempStack.pop());
//            }
//            tempStack.push(temp);
//        }
//        return tempStack;
//    }
    
    private static java.util.Stack<Integer> sortStack(java.util.Stack<Integer> input)
    {
    		java.util.Stack<Integer> tempStack = new Stack<>();
    		while (!input.isEmpty()) {
    			int temp = input.pop();
    			while (!tempStack.isEmpty() && temp < tempStack.peek()) {
					input.push(tempStack.pop());
				}
    			tempStack.add(temp);
				
			}
    		return tempStack;
    }
}
