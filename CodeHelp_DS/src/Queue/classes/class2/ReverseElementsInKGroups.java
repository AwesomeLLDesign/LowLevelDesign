package Queue.classes.class2;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseElementsInKGroups {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(7);
        queue.add(8);
        queue.add(9);
        queue.add(10);
        queue.add(11);
        int k = 3;
        System.out.println("Elements in Queue: " + queue);
        ReverseElementsInKGroups reverseElementsInKGroups = new ReverseElementsInKGroups();
        Queue<Integer> output = reverseElementsInKGroups.reverseInKGroupsUtil(queue, 3);
        System.out.println("Elements after reversal in K Groups in Queue : " + output);

    }

    private Queue<Integer> reverseInKGroupsUtil(Queue<Integer> queue, int k) {
        if (queue == null || queue.isEmpty()) return queue;
        int count = queue.size();
        if (count < k) return queue;
        while (true) {
            reverseInKGroups(queue, k, 0);
            count = count - k;
            if (count < k) break;
        }
        while (count > 0) {
            queue.offer(queue.poll());
            count--;
        }
        return queue;
    }


    private Queue<Integer> reverseInKGroups(Queue<Integer> queue, int k, int currStep) {
        if (currStep == k) {
            return queue;
        }

        int front = queue.poll();
        reverseInKGroups(queue, k, currStep + 1);
        queue.offer(front);
        return queue;
    }


}
