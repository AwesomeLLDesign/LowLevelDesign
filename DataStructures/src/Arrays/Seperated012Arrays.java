package Arrays;

public class Seperated012Arrays {

    public static void main(String args[]) {
        int[] arr = {0, 1, 2, 0, 0, 2, 2, 1, 1, 0, 2, 1};
        arrangeArrayNumbers(arr);
        System.out.println("The arranged array numbers are: ");
        for (int item : arr) {
            System.out.println(item);
        }
        int[] arr1 = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
        arrangeArrayNumbers(arr);
        System.out.println("The arranged array numbers are: ");
        for (int item : arr1) {
            System.out.println(item);
        }
        int[] arr2 = {3, 2, 2, 2, 2, 3, 2, 2, 2, 2, 2, 2};
        arrangeArrayNumbers(arr);
        System.out.println("The arranged array numbers are: ");
        for (int item : arr2) {
            System.out.println(item);
        }

    }

    public static int[] arrangeArrayNumbers(int[] input) {
        int i = 0;
        int j = input.length - 1;
        while (i < j) {
            if ((input[i] == 1 || input[i] == 2) && input[j] == 0) {
                int temp = input[i];
                input[i] = input[j];
                input[j] = temp;
            } else if (input[i] == 0) {
                i++;
            } else if (input[i] == 1 || input[i] == 2) {
                j--;
            }
        }
        i = 0;
        j = ((input.length) - 1);
        while (i < j) {
            if (input[i] == 0) {
                i++;
            } else if (input[i] == 2 && input[j] == 1) {
                int temp = input[i];
                input[i] = input[j];
                input[j] = temp;
            } else if (input[i] == 1) {
                i++;
            } else if (input[j] == 2) {
                j--;
            }
        }
        return input;
    }
}
