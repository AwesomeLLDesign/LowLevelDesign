package Stack.classes.class1;

import java.util.Stack;

public class InsertAtBottomInStack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(8);
        stack.push(5);

        InsertAtBottomInStack insertAtBottomInStack = new InsertAtBottomInStack();
        insertAtBottomInStack.insertAtBottom(stack,20);
        insertAtBottomInStack.print(stack);
    }

    private void insertAtBottom(Stack<Integer> stack, int element){
        if (stack.isEmpty()){
            stack.push(element);
            return;
        }
        int topElement = stack.pop();
        insertAtBottom(stack,element);
        stack.push(topElement);
    }

    private void print(Stack<Integer> stack){
        System.out.println("The elements in stack are: ");
        int n = stack.size();
        for (int i = 0; i < n; i++){
            System.out.println(stack.pop());
        }

    }

}
