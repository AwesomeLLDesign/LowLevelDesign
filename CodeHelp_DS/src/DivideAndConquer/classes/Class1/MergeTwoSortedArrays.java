package DivideAndConquer.classes.Class1;

import java.util.Arrays;

public class MergeTwoSortedArrays {

    public static void main(String[] args) {

        int[] first = {10,20,30,40};
        int[] second = {2, 11,23,27,29,33};
        int[] output = mergeTwoSortedArrays(first,second);
        Arrays.stream(output).forEach(num -> System.out.println(num));
    }

    private static int[] mergeTwoSortedArrays(int[] first, int[] second){

        // if first is empty , answer array should be the second one
        if(first.length == 0){
            return second;
        }

        // if second is empty, answer should be first array
        if(second.length == 0){
            return first;
        }
        //declarations
        int first_array_len = first.length;
        int second_array_len = second.length;
        int[] output = new int[first_array_len + second_array_len];
        int first_index = 0, second_index = 0, out_index = 0;

        //iterating, checking which array element is lesser as compared ot other one and storing it to output array
        while(first_index < first_array_len && second_index < second_array_len){
            if(first[first_index] < second[second_index]){
                output[out_index] = first[first_index];
                first_index++;
            }else{
                output[out_index] = second[second_index];
                second_index++;
            }
            out_index++;
        }

        // if some element still remaining in first array, copy them
        while(first_index < first_array_len){
            output[out_index] = first[first_index];
            first_index++;
            out_index++;
        }
        // if second array still have some elements left, copy them
        while(second_index < second_array_len){
            output[out_index] = second[second_index];
            second_index++;
            out_index++;
        }

        return output;
    }

}
