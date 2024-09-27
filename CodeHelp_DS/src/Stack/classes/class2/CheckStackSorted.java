package Stack.classes.class2;

import java.util.Stack;

public class CheckStackSorted {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(8);
        stack.push(5);

        CheckStackSorted checkStackSorted = new CheckStackSorted();
        System.out.println("The stack is sorted: " + checkStackSorted.checkStackSortedUtil(stack));
    }

    private boolean checkStackSortedUtil(Stack<Integer> stack){
        if (stack == null || stack.isEmpty())return true;

        return validateSorting(stack,Integer.MAX_VALUE);
    }

    private boolean validateSorting(Stack<Integer> st, int top){
        if (st.isEmpty()) return true;
        //first case
        int second = st.pop();
        if (top < second){
            return false;
        }

        //recursion
        boolean isSort = validateSorting(st,second);

        //backtracking
        st.push(second);
        return isSort;
    }
}
