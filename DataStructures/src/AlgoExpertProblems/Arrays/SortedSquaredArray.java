package AlgoExpertProblems.Arrays;

import java.util.Arrays;

public class SortedSquaredArray {

    private int[] sortedSquaredArray(int[] array) {
        int[] result = new int[array.length];
        for (int i =0; i< array.length;i++){
            result[i] = array[i] * array[i];
        }
        Arrays.sort(result);
        return result;
    }

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7};
        SortedSquaredArray sortedSquaredArray = new SortedSquaredArray();
        System.out.println("The Output is " );
        Arrays.stream(sortedSquaredArray.sortedSquaredArray(array)).forEach(n -> System.out.println(n));
    }
}
