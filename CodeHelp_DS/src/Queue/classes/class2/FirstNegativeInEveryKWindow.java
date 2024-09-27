package Queue.classes.class2;

import java.util.LinkedList;
import java.util.*;

public class FirstNegativeInEveryKWindow {

    public static void main(String[] args) {
        int[] input = {-8,2,3,-5,10};
        int k =2;
        FirstNegativeInEveryKWindow firstNegativeInEveryKWindow = new FirstNegativeInEveryKWindow();
        List<Integer> output = firstNegativeInEveryKWindow.findFirstNegative(input,k);
        System.out.println("First Negative number in respective K size windows: ");
        for (int item: output) System.out.println(item);
    }

    private List<Integer> findFirstNegative(int[] input, int k) {
        List<Integer> output = new ArrayList<>();
        //case for first window
        if (input == null || input.length == 0 || k <= 1) return new ArrayList<>();
        Queue<Integer> negativeNumbersQueue = new LinkedList<>();
        for (int i =0 ;i < k; i++){
            if (input[i] < 0) negativeNumbersQueue.offer(i);
        }
        if (negativeNumbersQueue.isEmpty())output.add(0);
        else output.add(input[negativeNumbersQueue.peek()]);
        //case for rest windows
        for (int i = k; i < input.length; i++){
            //addition
            if (input[i] < 0) negativeNumbersQueue.offer(i);

            //removal
            while (!negativeNumbersQueue.isEmpty() && negativeNumbersQueue.peek() < i - k + 1){
                negativeNumbersQueue.poll();
            }
            //answer
            if (negativeNumbersQueue.isEmpty())output.add(0);
            else output.add(input[negativeNumbersQueue.peek()]);
        }
        return output;
    }


}
