package AlgoExpertProblems.Searching;

import java.util.Arrays;

public class FindThreeLargestNumbers {

    private int[] findThreeLargestNumbers(int[] array) {

        int firstMax = Integer.MIN_VALUE;
        int firstIndex = 0, secondIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (firstMax < array[i]) {
                firstMax = array[i];
                firstIndex = i;
            }
        }
        int[] result = {0,0,0};
        result[2] = firstMax;

        int secondMax = Integer.MIN_VALUE;
        for (int j = 0; j < array.length; j++) {
            if (secondMax <= firstMax && secondMax < array[j] && j != firstIndex) {
                secondMax = array[j];
                secondIndex = j;

            }
        }
        result[1] = secondMax;
        int thirdMax = Integer.MIN_VALUE;
        for (int k = 0; k < array.length; k++) {
            if (thirdMax <= secondMax && thirdMax < array[k] && k != firstIndex && k != secondIndex) {
                thirdMax = array[k];
            }
        }
        result[0] = thirdMax;
        return result;
    }

    public static void main(String[] args) {

        int[] array = {10, 5, 9, 10, 12};
        FindThreeLargestNumbers findThreeLargestNumbers = new FindThreeLargestNumbers();
        int[] results = findThreeLargestNumbers.findThreeLargestNumbers(array);
        Arrays.stream(results).forEach(num -> System.out.println(num));

    }
}
