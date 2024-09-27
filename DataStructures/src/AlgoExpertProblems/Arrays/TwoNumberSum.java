package AlgoExpertProblems.Arrays;

import java.util.*;

public class TwoNumberSum {

    private int[] twoNumberSumArray(int[] array, int targetSum) {
        Map<Integer, Integer> map = new HashMap<>();

        //inserting into map
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i]))
                map.put(array[i], (map.get(array[i])) + 1);
            else
                map.put(array[i], 1);
        }
        List<Integer> result = new ArrayList<>();
        int[] solution = new int[array.length];
        int solution_index = 0;
        //Iterating over an array and check with map for target sum
        for (int array_index = 0; array_index < array.length; array_index++) {
            int currNo = array[array_index];
            if (map.containsKey(targetSum - currNo) && (map.get(currNo) > 0) && (map.get(targetSum - currNo) > 0)) {
                if (currNo == (targetSum - currNo)) {
                    if (!((map.get(currNo) > 1)))
                        continue;
                    map.put(currNo, map.get(currNo) - 2);
                    result.add(currNo);
                    result.add(currNo);
                    solution[solution_index] = currNo;
                    solution_index++;
                    solution[solution_index] = currNo;
                    solution_index++;
                    continue;
                }
                map.put(currNo, map.get(currNo) - 1);
                map.put(targetSum - currNo, map.get(targetSum - currNo) - 1);
                result.add(currNo);
                result.add(targetSum - currNo);
                solution[solution_index] = currNo;
                solution_index++;
                solution[solution_index] = targetSum - currNo;
                solution_index++;
            }
        }
        int[] sol = new int[result.size()];
        int sol_index = 0;
        for (Integer num : result) {
            sol[sol_index] = num;
            sol_index++;
        }

        return sol;
    }

    public static void main(String[] args) {
        int[] array = {3, 5, 5, -4, 8, 11, 1, -1, 6};
        int targetSum = 100;
        TwoNumberSum twoNumberSum = new TwoNumberSum();
        int[] result = twoNumberSum.twoNumberSumArray(array, targetSum);
        Arrays.stream(result).forEach(num -> System.out.println(num));
    }
}
