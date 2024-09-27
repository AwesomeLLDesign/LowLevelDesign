package AlgoExpertProblems.Arrays;

public class LongestPeak {

    private static int longestPeak(int[] array) {
        if (array == null || array.length < 0)
            return -1;

        int[] left = new int[array.length];
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] < array[i])
                left[i] = left[i - 1] + 1;
        }

        int[] right = new int[array.length];
        for (int j = array.length - 2; j >= 0; j--) {
            if (array[j] > array[j + 1])
                right[j] = right[j + 1] + 1;
        }

        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (left[i] != 0 && right[i] != 0) {
                max = Math.max(left[i] + right[i] + 1, max);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3};
        System.out.println(longestPeak(input));
    }
}
