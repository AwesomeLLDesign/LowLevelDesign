package AlgoExpertProblems.Arrays;

public class ArrayOfProducts {

    private static int[] arrayOfProducts(int[] array) {
        if (array == null || array.length == 0)
            return new int[0];
        int size = array.length;
        int[] output = new int[size];
        output[0] = 1;
        for (int i = 1; i < size; i++) {
            output[i] = array[i - 1] * output[i - 1];
        }
        int prev = 1;
        for (int j = size - 2; j >= 0; j--) {
            prev *= array[j + 1];
            output[j] *= prev;
        }
        return output;
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2};
        int[] out = ArrayOfProducts.arrayOfProducts(arr);
        for (int element : out) {
            System.out.println(element);
        }
    }
}
