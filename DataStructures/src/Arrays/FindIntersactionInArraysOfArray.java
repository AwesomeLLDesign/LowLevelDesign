package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindIntersactionInArraysOfArray {

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 3, 4}, {3, 2, 3, 4, 6}, {3, 2, 3, 1}, {4, 6, 3, 2, 3, 2}};
        for (Integer item: findIntersaction(array)) System.out.println(item);
    }

    private static List<Integer> findIntersaction(int[][] array) {
        if (array == null || array.length == 0) {
            return new ArrayList<>();
        }
        Map<Integer, Integer> compareMap = new HashMap<>();
        for (int i = 0; i < array[0].length; i++) {
            if (compareMap.containsKey(array[0][i])) {
                compareMap.put(array[0][i], compareMap.get(array[0][i]) + 1);
            } else {
                compareMap.put(array[0][i], 1);
            }
        }

        List<Integer> result = new ArrayList<>();

        for (int row = 1; row < array.length; row++) {
            Map<Integer, Integer> comparedMap = new HashMap<>(compareMap);
            boolean intersectionFlag = false;
            for (int col = 0; col < array[row].length; col++) {
                if (compareMap.containsKey(array[row][col])) {
                    intersectionFlag = true;
                    comparedMap.put(array[row][col], comparedMap.get(array[row][col]) - 1);
                }
            }
            if (!intersectionFlag){
                return result;
            }
            for (Map.Entry<Integer, Integer> entry : comparedMap.entrySet()) {
                if (entry.getValue() > 0){
                    compareMap.remove(entry.getKey());
                }
            }
        }

        for (Map.Entry<Integer, Integer> entry : compareMap.entrySet()) {
                for (int i =0 ; i < entry.getValue(); i++)
                result.add(entry.getKey());
        }
        return result;
    }
}
