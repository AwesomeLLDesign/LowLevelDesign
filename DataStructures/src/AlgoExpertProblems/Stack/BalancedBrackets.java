package AlgoExpertProblems.Stack;

import java.util.Stack;

public class BalancedBrackets {

    public static boolean balancedBrackets(String str) {
        Stack<Character> stack = new Stack<>();
        if (str.length() == 0) {
            return true;
        }
        char[] arr = str.toCharArray();
        int i = 0;
        while (i < arr.length) {
            char ch = arr[i];
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(arr[i]);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty())return false;
                char temp = stack.peek();
                if (checkForBalancedBrackets(temp, ch)) {
                    stack.pop();
                } else {
                    return false;
                }
            }
            i++;
        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }

    private static boolean checkForBalancedBrackets(char stackChar, char stringChar) {
        if (stackChar == '(') {
            return (stringChar == ')');
        } else if (stackChar == '[') {
            return (stringChar == ']');
        } else if (stackChar == '{') {
            return (stringChar == '}');
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String str = "([])(){}(())(p)(q)";
        System.out.println(balancedBrackets(str));
    }
}
