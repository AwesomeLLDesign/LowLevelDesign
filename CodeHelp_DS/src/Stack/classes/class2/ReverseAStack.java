package Stack.classes.class2;
import java.util.Stack;

public class ReverseAStack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(8);
        stack.push(5);

        ReverseAStack reverseAStack = new ReverseAStack();
        try {
            reverseAStack.reverseStack(stack);
        }catch (Exception ex){
            System.out.println("Invalid Stack, Stack in NULL");
            System.out.println(ex.getMessage());
        }
        reverseAStack.print(stack);
    }

    private void reverseStack(Stack<Integer> stack) throws Exception{
        if (stack==null){
            throw new Exception("Invalid Stack");
        }

        if (stack.isEmpty()) return;

        int top = stack.pop();
        reverseStack(stack);
        insertAtBottom(stack,top);
    }

    private void insertAtBottom(Stack<Integer> stack, int element){
        //Base Case
        if (stack.isEmpty()){
            stack.push(element);return;
        }
        //for single case
        int currTopElement = stack.pop();
        //recursion
        insertAtBottom(stack,element);
        //backtracking
        stack.push(currTopElement);
    }

    private void print(Stack<Integer> stack){
        int n = stack.size();
        System.out.println("Printing all elements of Stack: ");
        for(int i = 0 ;i < n; i++){
            System.out.println(stack.pop());
        }

    }



}
