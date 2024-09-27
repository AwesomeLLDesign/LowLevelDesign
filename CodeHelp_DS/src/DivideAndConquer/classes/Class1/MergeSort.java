package DivideAndConquer.classes.Class1;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] input = {29,11,20,10,2,30,40};
       mergeSort(input,0,input.length-1);
       Arrays.stream(input).forEach(num -> System.out.println(num));

    }

    private static void mergeSort(int[] array, int start, int end){

        //base case
        if(start < end) {
            //processing
            int mid = (end - start) >> 1;
            mergeSort(array, start, mid);
            mergeSort(array, mid + 1, end);

            merge(array, start, mid, end);
            //recursion

        }
    }

    private static void merge(int[] array, int start, int mid, int end){
        int[] first = Arrays.copyOfRange(array,start,mid);
        int[] second = Arrays.copyOfRange(array,mid+ 1,end);

        int first_index = 0;
        int second_index = 0;
        int first_array_len = first.length;
        int second_array_len = second.length;

//        if(first_array_len == 0)return second;
//        if(second_array_len == 0) return first;

        int[] output = new int[first_array_len+ second_array_len];
        int output_index = start;
        while(first_index < first_array_len && second_index < second_array_len){
            if(first[first_index] < second[second_index]){
                output[output_index] = first[first_index];
                first_index++;
            }else{
                output[output_index] = second[second_index];
                second_index++;
            }
            output_index++;
        }

        while(first_index < first_array_len){
            output[output_index] = first[first_index];
            first_index++;
            output_index++;
        }

        while(second_index < second_array_len){
            output[output_index] = second[second_index];
            second_index++;
            output_index++;
        }


       // return output;
    }

}
