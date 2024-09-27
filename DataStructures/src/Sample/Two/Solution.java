package Sample.Two;

import java.util.EmptyStackException;
import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("4 5 6 - 7 +"));
    }
    Stack<Integer> stk = new Stack<>();
    Integer min = 0;
    double max = Math.pow(2, 20) - 1;

    private Integer stackPop() throws EmptyStackException {
        return stk.pop();
    }

    private void stackPush(String item) throws EmptyStackException {
        double value = Double.parseDouble(item);
        if (value < min || value > max){
            throw new EmptyStackException();
        }
        stk.push((int)value);
    }

    private void stackDup() throws EmptyStackException {
        stk.push(stk.peek());
    }

    private Integer stackAdd() throws EmptyStackException {
        Integer first = stackPop();
        Integer second = stackPop();

        double result = first + second;

        if (result < min || result > max)
            throw new EmptyStackException();

        stk.push((int) result);
        return 0;
    }

    private Integer stackSub() throws EmptyStackException {
        Integer first = stackPop();
        Integer second = stackPop();

        double result = first - second;

        if (result < min || result > max)
            throw new EmptyStackException();

        stk.push((int) result);
        return 0;
    }


    public int solution(String S) {
        String[] array = S.split(" ");

        try {
            for (String item : array) {

                switch (item) {
                    case "POP":
                        stackPop();
                        break;
                    case "DUP":
                        stackDup();
                        break;
                    case "+":
                        stackAdd();
                        break;
                    case "-":
                        stackSub();
                        break;
                    default:
                        stackPush(item);
                }

            }
        } catch (EmptyStackException stkExp) {
            return -1;
        }


        return stackPop();
    }

//    public static int solution(String S) {
//        // write your code in Java SE 8
//        Stack<Integer> stk = new Stack<>();
//        String[] array = S.split(" ");
//        for (String item : array) {
//
//            switch (item) {
//                case "POP":
//                    stk.pop();
//                    break;
//                case "DUP":
//                    Integer top = stk.peek();
//                    stk.push(top);
//                    break;
//                case "+":
//                    Integer first = stk.pop();
//                    Integer second = stk.pop();
//                    stk.push(first + second);
//                    break;
//                case "-":
//                    Integer firstTop = stk.pop();
//                    Integer secondTop = stk.pop();
//                    stk.push(firstTop - secondTop);
//                    break;
//                default:
//                    stk.push(Integer.parseInt(item));
//            }
//
//        }
//        return stk.peek();
//    }


}
