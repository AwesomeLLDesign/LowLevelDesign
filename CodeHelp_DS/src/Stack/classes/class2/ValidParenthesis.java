package Stack.classes.class2;

import java.util.Stack;

public class ValidParenthesis {

    public static void main(String[] args) {
        ValidParenthesis validParenthesis = new ValidParenthesis();
        System.out.println("The string have valid parenthesis: "
                + validParenthesis.validParenthesis("{[()()[]]}"));

    }

    private boolean validParenthesis(String input) {
        if (input == null || input.length() == 0) return true;

        char[] charArray = input.toCharArray();
        Stack<Character> parenthesisStack = new Stack<>();
        for (char ch : charArray) {
            if (ch == '(' || ch == '[' || ch == '{') {
                parenthesisStack.push(ch);
            } else if (ch == ')') {
                if (parenthesisStack.isEmpty() || parenthesisStack.peek() != '(') {
                    return false;
                }
                parenthesisStack.pop();
            } else if (ch == ']') {
                if (parenthesisStack.isEmpty() || parenthesisStack.peek() != '[') {
                    return false;
                }
                parenthesisStack.pop();
            } else if (ch == '}') {
                if (parenthesisStack.isEmpty() || parenthesisStack.peek() != '{') {
                    return false;
                }
                parenthesisStack.pop();
            }
        }
        if (!parenthesisStack.isEmpty()) return false;
        return true;
    }

}
