package AlgoExpertProblems.Recursion;

import java.util.ArrayList;
import java.util.List;

public class ProductSum {

    public static void main(String[] args) {
        List<Object> array = new ArrayList<>();
        array.add(5);
        array.add(2);
        List<Object> arr1 = new ArrayList<>();
        arr1.add(7);
        arr1.add(-1);
        array.add(arr1);
        array.add(3);
        List<Object> arr2 = new ArrayList<>();
        arr2.add(6);
        List<Object> arr3 = new ArrayList<>();
        arr3.add(-13);
        arr3.add(8);
        arr2.add(arr3);
        arr2.add(4);
        array.add(arr2);
        System.out.println("The Product sum is " + productSum(1, array, 0));

    }

    private static int productSum(int depth, List<Object> array, int sum) {
        for (Object obj : array) {
            if (obj instanceof List) {
                sum += (depth + 1) * (productSum(depth + 1, (List<Object>) obj, 0));
            } else {
                sum += (int) obj;
            }
        }
        return sum;
    }
}
