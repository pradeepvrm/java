package com.pradeep.stacksAndQueues;

import java.util.*;

public class InBuiltExamples {
    static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());


//        queue is an interface
//        Queue<Integer> queue = new LinkedList<>();
//            queue.add(10);
//            queue.add(20);
//            queue.add(30);
//
//             System.out.println(queue.peek());
//             System.out.println(queue.remove());
//             System.out.println(queue.remove());

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(89);
        deque.addLast(78);
        deque.removeFirst();
        System.out.println(deque);
    }
}
