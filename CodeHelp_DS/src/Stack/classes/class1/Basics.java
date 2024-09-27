package Stack.classes.class1;

import java.util.Collections;
import java.util.Stack;

public class Basics {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        //top of the stack
        System.out.println("Top of the Stack: " + stack.peek());

        //size of the stack
        System.out.println("Size of the stack: " + stack.size());

        //iterative traversal
        printStack(stack);
        //recusive traversal
        printStackInRecursion(stack);

        //size of the stack
        System.out.println("Size of the stack: " + stack.size());
    }

    private static void printStack(Stack<Integer> stack){
        if (stack == null)return;
        System.out.println("Print in reverse order of Insertion: ");
        while (!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
    }

    private static void printStackInRecursion(Stack<Integer> stack){
        if (stack == null || stack.isEmpty())return;
        System.out.println(stack.pop());
        printStackInRecursion(stack);
    }

}
