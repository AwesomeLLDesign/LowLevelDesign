package Arrays.Sheet;

public class KadaneAlgorithm {

    public static void main(String[] args) {

        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.print(findMaxSumOfSubArray(arr));
    }

    private static int findMaxSumOfSubArray(int[] arr){

        if(arr == null || arr.length == 0){
            return Integer.MIN_VALUE;
        }

        int idx = 0;
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        while(idx < arr.length){
            currSum += arr[idx];
            maxSum = (maxSum < currSum? currSum: maxSum);
            currSum = (currSum < 0)? 0: currSum;
            idx++;
        }
        return maxSum;
    }

}
