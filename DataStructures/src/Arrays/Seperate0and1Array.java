package Arrays;

public class Seperate0and1Array {
    public static void main(String... args) {
        int[] arr = {0, 1, 0, 1, 1, 0, 0, 1, 1, 0};
        int[] output = arrangeArray(arr);
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i] + " , ");
        }
    }

    public static int[] arrangeArray(int[] array) {
        int i = 0, j = array.length - 1;
        while (i <= j) {
            if (array[i] == 1 && array[j] == 0) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            } else if (array[i] == 0) {
                i++;
            } else if (array[j] == 1) {
                j--;
            }
        }
        return array;
    }

    /**
     * approach 1: short the array - time complexity is O(nlogn)
     * approach 2: count number of 0's and 1's and then print them as per there count - leads two for loops - O(n)
     * approach 3: just implemented above - O(n)
     * **/
}
