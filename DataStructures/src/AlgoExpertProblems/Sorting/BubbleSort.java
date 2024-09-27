package AlgoExpertProblems.Sorting;

public class BubbleSort {

    public static void main(String[] args) {

        int[] array = {8,5,2,9,5,6,3};
        BubbleSort bubbleSort  = new BubbleSort();
        int[] result = bubbleSort.sortArray(array);
        for(int i = 0 ; i < result.length; i++){
            System.out.println(result[i]);
        }
    }

    private int[] sortArray(int[] array) {

        if(array.length == 0)
            return array;

        int size = array.length;

        for(int i = 0; i < size; i++){
            for(int j = 0; (j+1) < (size - i); j++){
                if(array[j] > array[j+1]){
                    int swapHelpingNumber = array[j];
                    array[j] = array[j+1];
                    array[j+1] = swapHelpingNumber;
                }
            }
        }
        return array;
    }
}
