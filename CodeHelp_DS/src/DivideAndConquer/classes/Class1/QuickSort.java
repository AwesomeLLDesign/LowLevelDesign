package DivideAndConquer.classes.Class1;

import java.util.Arrays;

public class QuickSort {

    /***
     * Time Complexity = O(nlogn)
     * Space Complexity = O(n)
     * **/

    public static void main(String[] args) {
        int[] input = {2,1,3,8,6,7,5,4};
        quickSort(input, 0, input.length-1);
        Arrays.stream(input).forEach(num -> System.out.println(num));
    }

    private static void quickSort(int[] arr, int start, int end){
        // base Case
        if(start>= end) return;
        // processing
        int low = start -1;
        int high = start;
        int pivot = end;

        while(high < pivot){
            if(arr[high] < arr[pivot]){
                low++;
                swap(arr, low,high);
            }
            high++;
        }
        low++;
        swap(arr, low, pivot);
        // recursion
        quickSort(arr, start, low - 1);
        quickSort(arr, low +1, end);
    }

    private static void swap(int[] arr, int first, int second){
        int swapHelp = arr[first];
        arr[first] = arr[second];
        arr[second] = swapHelp;
    }
}
