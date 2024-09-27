package Stack.classes.class2;

import java.util.Stack;

public class FindMiddleInStack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(8);
        stack.push(2);
        stack.push(12);
        stack.push(11);

        FindMiddleInStack findMiddleInStack = new FindMiddleInStack();
        try {
            System.out.println("The middle element is: " + findMiddleInStack.findMiddleUtil(stack));
        }catch (Exception ex){
            System.out.println("The stack is Empty");
            System.out.println(ex.getMessage());
        }
        }

    private int findMiddleUtil(Stack<Integer> stack) throws Exception {
        if (stack == null) throw new Exception("Invalid Stack");
        if (stack.size() == 0) throw new Exception("Stack in Empty");
        int noOfPopOperations = stack.size()  / 2;
        return findMiddle(stack, noOfPopOperations);
        //return stack.peek();
    }

    private int  findMiddle(Stack<Integer> stack, int noOfPops) {
        if (noOfPops == 0) return stack.peek();
        int element = stack.pop();
        int middleElement = findMiddle(stack, --noOfPops);
        stack.push(element);
        return middleElement;
    }

}
