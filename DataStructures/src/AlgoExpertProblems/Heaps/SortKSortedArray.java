package AlgoExpertProblems.Heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

public class SortKSortedArray {

    public static void main(String[] args) {
        int[] array = {3, 2, 1, 5, 4, 7, 6, 5};
        int[] output = sortKSortedArray(array, 3);
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }

    }

    public static int[] sortKSortedArray(int[] array, int k) {

        PriorityQueue pq = new PriorityQueue();
        for (int i = 0; i < array.length; i++) {
            pq.add(array[i]);
        }
        int[] result = new int[array.length];
        int i = 0;
        while (!pq.isEmpty()) {
            int temp = (int) pq.peek();
            result[i] = temp;
            pq.remove();
            i++;
        }
        return result;
    }

}
