package Arrays;

import java.util.Arrays;

public class Whatfix {

    /**given an array A of N integers, returns smallest positive integer (greater than 0) that does not occur in A.
     For example, given A= [1, 3, 6, 4, 1, 2] the function should return 5.
     Given A= [1, 2, 3], the function should return 4.
     Given A= [-1, -3], the function should return 1
     * */

    private static int findSmallestPositiveNumber(int[] array){
        int length = array.length;
        if(length == 0){
            return 1;
        }
        int result = -1;
        int[] new_array = new int[length+1];
        Arrays.fill(new_array,0);

        for(int i = 0; i < length; i++){
            if(array[i] > 0 && array[i] < length+1){
                new_array[array[i]] = 1;
            }
        }

        for(int i = 1; i < length+1; i++){
            if(new_array[i] == 0){
                result = i;
                break;
            }
        }

        if(result == -1){
            result = length+1;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] array = {-1,-3};
        System.out.println("the smallest number: " + findSmallestPositiveNumber(array));
    }

    /**
     * 1,1,1,1,8
     * */
}
