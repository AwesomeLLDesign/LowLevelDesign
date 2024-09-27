package AlgoExpertProblems.Sorting;

import java.util.Arrays;

public class ThreeNumberSort {

    public static void main(String[] args) {
        int[] array = {2, 1, 0, 1, 2, 1, 0, 0, 2};
        int[] order = {0, 1, 2};
        int[] result = threeNumberSort(array, order);
        Arrays.stream(result).forEach(i -> System.out.println(i));
    }

    public static int[] threeNumberSort(int[] array, int[] order) {
        int low = 0, mid = 0;
        int high = array.length - 1;
        while (mid <= high) {
            if (array[mid] == order[0]) {
                swap(low,mid,array);
                low++;
                mid++;
            } else if (array[mid] == order[1]) {
                mid++;
            } else if (array[mid] == order[2]) {
                swap(mid,high,array);
                high--;
            } else {
                System.out.println("Wrong Input");
            }
        }
        return array;
    }

    public static int[] swap(int first, int second, int[] arr){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
        return arr;
    }
}
