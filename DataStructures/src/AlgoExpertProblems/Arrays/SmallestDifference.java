package AlgoExpertProblems.Arrays;

import java.util.Arrays;

public class SmallestDifference {

    private static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        if (arrayOne == null || arrayTwo == null || arrayOne.length == 0 || arrayTwo.length == 0)
            return new int[0];

        // output array of size two
        int[] result = new int[2];

        // sorting both the arrays
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);

        int first_idx = 0, second_idx = 0;
        int prev_diff = Integer.MAX_VALUE, curr_diff = 0;

        while (first_idx < arrayOne.length && second_idx < arrayTwo.length) {

            curr_diff = Math.abs(arrayTwo[second_idx] - arrayOne[first_idx]);

            if (curr_diff == 0) {
                result[0] = arrayOne[first_idx];
                result[1] = arrayTwo[second_idx];
                return result;
            }

            if (curr_diff < prev_diff) {
                result[0] = arrayOne[first_idx];
                result[1] = arrayTwo[second_idx];
                prev_diff = curr_diff;
            }

            if (arrayOne[first_idx] < arrayTwo[second_idx]) {
                first_idx++;
            } else {
                second_idx++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] one = {-1, 5, 10, 20, 28, 3};
        int[] two = {26, 134, 135, 15, 17};
        int[] output = smallestDifference(one, two);
        for (int element : output)
            System.out.println(element);
    }
}
