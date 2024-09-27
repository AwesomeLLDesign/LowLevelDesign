package AlgoExpertProblems.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumberSum {

    public static void main(String[] args) {
        int[] arr = {12, 3, 1, 2, -6, 5, -8, 6};
        int sum = 0;
        List<Integer[]> result = findAllTriplets(arr, sum);
        for (Integer[] listItem: result){
            System.out.println("------");
            for (int i  =0; i < listItem.length; i++){
                System.out.println(listItem[i]);
            }
        }
    }

    private static List<Integer[]> findAllTriplets(int[] array, int targetSum) {
        int length = array.length;
        if (length == 0)
            return new ArrayList<>();

        List<Integer[]> result = new ArrayList<>();

        Arrays.sort(array);
        for (int first = 0; first < length - 2; first++) {
            int left = first + 1;
            int right = length - 1;
            while (left < right) {
                int x = array[first];
                if (x + array[left] + array[right] == targetSum) {
                    if (x != array[left] && x != array[right] && array[left] != array[right])
                    result.add(new Integer[]{x, array[left], array[right]});
                    left++;
                    right--;
                } else if (x + array[left] + array[right] < targetSum) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }
}
