package Stack.classes.class3;

import java.util.Arrays;
import java.util.Stack;

public class PreviousSmallerElement {

    public static void main(String[] args) {
        int[] arr = {8,4,6,2,3}; // ouput: -1 -1 4 -1 2
//        int[] arr = {7, 5, 4, 10, 3, 11}; //output : -1,-1,-1,4,-1,3
        PreviousSmallerElement previousSmallerElement = new PreviousSmallerElement();
        int[] output = previousSmallerElement.previousSmaller(arr);
        System.out.println("Input: ");
        Arrays.stream(arr).forEach(num -> System.out.print(num + " "));
        System.out.println(" ");
        System.out.println("Ouput: ");
        Arrays.stream(output).forEach(num -> System.out.print(num + " "));
    }

    private int[] previousSmaller(int[] arr){
        if (arr == null) return null;
        int n = arr.length;
        int[] output = new int[n];
        Stack<Integer> prevSmallerStack = new Stack<>();
        prevSmallerStack.push(-1);
        for(int i =0; i < n; i++){
            int top = prevSmallerStack.peek();
            while (arr[i] < top){
                prevSmallerStack.pop();
                top = prevSmallerStack.peek();
            }
            output[i] = top;
            prevSmallerStack.push(arr[i]);
        }
        return output;
    }
}
