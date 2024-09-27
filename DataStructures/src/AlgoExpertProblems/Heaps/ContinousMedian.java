package AlgoExpertProblems.Heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

public class ContinousMedian {

    static double median = 0;
    static Comparator<Integer> maxComp = new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            if (o1 > o2) {
                return -1;
            } else
                return 1;
        }
    };
    static PriorityQueue<Integer> maxHeap = new PriorityQueue<>(maxComp);
    static PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    public static void main(String[] args) {
        insert(5);
        System.out.println("1. " + getMedian());
        insert(10);
        System.out.println("2. " + getMedian());
        insert(100);
        System.out.println("3. " + getMedian());

    }

    public static void insert(int number) {
        if (maxHeap.isEmpty() || (maxHeap.peek() > number)) {
            maxHeap.add(number);
        } else {
            minHeap.add(number);
        }

        if (maxHeap.size() > minHeap.size() + 1) {
            minHeap.add(maxHeap.poll());

        } else if (minHeap.size() > maxHeap.size() + 1) {
            maxHeap.add(minHeap.poll());
        }

        if (minHeap.size() == maxHeap.size()) {
            median = ((double)minHeap.peek() + (double)maxHeap.peek()) / 2;
        } else if (minHeap.size() > maxHeap.size()) {
            median = minHeap.peek();
        } else if (maxHeap.size() > minHeap.size()) {
            median = maxHeap.peek();
        }


    }

    public static double getMedian() {
        return median;
    }
}
