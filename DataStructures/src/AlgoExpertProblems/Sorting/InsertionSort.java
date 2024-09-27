package AlgoExpertProblems.Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {8, 5, 2, 9, 5, 6, 3};
        int[] result = insertionSort(array);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static int[] insertionSort(int[] array) {
        for (int p = 0; p < array.length - 1; p++) {
            int smallerElement = Integer.MAX_VALUE;
            int index = -1;
            for (int q = p + 1; q < array.length; q++) {
                if (smallerElement > array[q]) {
                    smallerElement = array[q];
                    index = q;
                }
            }
            if(array[p]> array[index]){
                int temp = array[p];
                array[p] = array[index];
                array[index] = temp;
            }
        }

        return array;
    }
}
