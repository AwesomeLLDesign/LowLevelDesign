package Queue.classes.class2;

import java.util.LinkedList;
import java.util.Queue;

public class InterleaveTwoHalvesOfQueue {

    public static void main(String[] args) {

        String str = "test_input";
        if (str == null || str.length() == 0){
            System.out.println("Invalid Input: " + str);
            return;
        }
        Queue<Character> input = new LinkedList<>();
        for (char ch: str.toCharArray()){
            input.offer(ch);
        }
        if (input.size()%2 == 0){
            //even
            InterleaveTwoHalvesOfQueue interleaveTwoHalvesOfQueue = new InterleaveTwoHalvesOfQueue();
            input = interleaveTwoHalvesOfQueue.interleaveTwoHalves(input);
            System.out.println("After interleave two halves : " + input);

        }else{
            System.out.println("Invalid Input with size : " + input.size());
        }
    }

    private Queue<Character> interleaveTwoHalves(Queue<Character> queue){
        int countElements = queue.size();
        int halfElements = countElements/2;
        int currCount = 1;
        Queue<Character> firstHalf = new LinkedList<>();
        while (currCount <= halfElements){
            firstHalf.offer(queue.poll());
            currCount++;
        }

        while(!firstHalf.isEmpty()){
            queue.offer(firstHalf.poll());
            queue.offer(queue.poll());
        }

        return queue;
    }

}
