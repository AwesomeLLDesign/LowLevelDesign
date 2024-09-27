package Stack.classes.class3;

import java.util.Arrays;
import java.util.Stack;

public class NextSmallerElement {

    public static void main(String[] args) {
        //int[] arr = {8,4,6,2,3};
        int[] arr = {7, 5, 4, 10, 3, 11};
        NextSmallerElement nextSmallerElement = new NextSmallerElement();
        int[] output = nextSmallerElement.nextSmaller(arr);
        System.out.println("Input: ");
        Arrays.stream(arr).forEach(num -> System.out.print(num + " "));
        System.out.println("Output: ");
        Arrays.stream(output).forEach(num -> System.out.print(num + " "));
    }

    private int[] nextSmaller(int[] arr) {
        if (arr == null) return null;
        int n = arr.length;
        int[] output = new int[n];
        Stack<Integer> lastSmaller = new Stack<>();
        lastSmaller.push(-1);
        for (int i = n - 1; i >= 0; i--) {
            int top = lastSmaller.peek();
            while (arr[i] < top) {
                lastSmaller.pop();
                top = lastSmaller.peek();
            }
            output[i] = top;
            lastSmaller.push(arr[i]);
        }
        return output;
    }

}
