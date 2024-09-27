package AlgoExpertProblems.Searching;

public class BinarySearch {

    private int binarySearchForValue(int[] array, int target) {

        if (array.length == 0)
            return -1;
        int targetIndex = -1;
        int start = 0, end = (array.length - 1);
        while (start <= end) {
            int mid = (start + end) / 2;
            if (array[mid] == target) {
                targetIndex = mid;
                break;
            } else if (target < array[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return targetIndex;
    }

    public static void main(String[] args) {
        int[] array = {0, 1, 21, 33, 45, 45, 61, 71, 72, 73};
        int target = 45;
        BinarySearch binarySearch = new BinarySearch();
        System.out.println("The element present at index: " + binarySearch.binarySearchForValue(array, target));

    }
}
