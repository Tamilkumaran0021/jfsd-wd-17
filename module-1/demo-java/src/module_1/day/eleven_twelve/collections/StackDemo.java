package module_1.day.eleven_twelve.collections;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        // stack -> LIFO
        Stack<Integer> stack = new Stack<>();
        stack.add(100);
        stack.add(1);
        stack.add(0);

//        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack);

    }
}
