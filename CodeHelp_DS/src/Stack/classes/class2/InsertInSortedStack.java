package Stack.classes.class2;

import java.util.Stack;

public class InsertInSortedStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(5);
        stack.push(8);

        InsertInSortedStack insertInSortedStack = new InsertInSortedStack();
        insertInSortedStack.insert(stack, 9);
        insertInSortedStack.print(stack);
    }

    private void insert(Stack<Integer> stack, int element){
        if (stack.isEmpty()){
            stack.push(element);
            return;
        }

        int top = stack.peek();
        if (top<element){
            stack.push(element);
            return;
        }
        stack.pop();
        insert(stack,element);
        stack.push(top);
    }

    private void print(Stack<Integer> stack){
        System.out.println("Printing elements of stack : ");
        int n = stack.size();
        for (int i =0; i < n; i++){
            System.out.println(stack.pop());
        }
    }
}
