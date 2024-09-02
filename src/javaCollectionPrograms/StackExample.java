package javaCollectionPrograms;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack stack=new Stack<Integer>();
        stack.push(1);

        stack.push(2);
        stack.push("2");
        stack.push("max");
        stack.push(null);
        stack.push(1);

        stack.push(2);
        stack.push("2");
        stack.push("max");
        stack.push(null);
        System.out.println(stack.elementAt(4));
        System.out.println(stack);
        System.out.println(" peek : "+stack.peek());
        System.out.println("pop : "+stack.pop());
        System.out.println(stack);
        System.out.println(" peek : "+stack.peek());
        System.out.println("serch : "+stack.search(null));

    }
}
