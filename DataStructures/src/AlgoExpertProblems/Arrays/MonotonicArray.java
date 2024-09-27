package AlgoExpertProblems.Arrays;

import java.util.List;
import java.util.Stack;

public class MonotonicArray {

    private static boolean checkMonotonicArray(int[] array) {
        if (array == null || array.length < 2)
            return true;

        boolean ascending = false, descending = false;

        int idx = 1;
        while (idx < array.length) {
            if (array[idx - 1] < array[idx]) {
                ascending = true;
            }
            if (array[idx - 1] > array[idx]) {
                descending = true;
            }
            if (ascending && descending) {
                return false;
            }
            idx++;
        }
        List l = new Stack<>();
        return true;
    }

    public static void main(String[] args) {
        int[] array = {-1,-5,-10,-1100,-1101,-1102,-9001};
        int[] array1 = {3,3,3,3,3,3,3,3,3};
        int[] array2 = {-1,-5,-10,1100,1101,1102,9001};
        int[] array3 = {5,6,7,8,8,8,8,9,8};
        System.out.println(checkMonotonicArray(array3));
    }
}
