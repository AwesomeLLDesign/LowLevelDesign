package Queue.classes.class2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseElementsInQueue {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        System.out.println("Queue Elements: " + queue);

        ReverseElementsInQueue reverseElementsInQueue = new ReverseElementsInQueue();
        reverseElementsInQueue.reverseElements(queue);

        System.out.println("Reverse Queue Elements with Recursion: " + queue);

        Queue<Integer> output = reverseElementsInQueue.reverseWithTheHelpOfStack(queue);
        System.out.println("Reverse Elements with Stack: " + output);


    }

    private void reverseElements(Queue<Integer> queue) {
        if (queue.isEmpty()){
            return;
        }
        int front = queue.poll();
        reverseElements(queue);
        queue.offer(front);
    }

    private Queue<Integer> reverseWithTheHelpOfStack(Queue<Integer> queue){
        if (queue.isEmpty())return queue;

        Queue<Integer> output = new LinkedList<>();
        Stack<Integer> reversalStack = new Stack<>();
        while (!queue.isEmpty()){
            reversalStack.push(queue.poll());
        }

        while (!reversalStack.isEmpty()){
            output.offer(reversalStack.pop());
        }

        return output;

    }





}
