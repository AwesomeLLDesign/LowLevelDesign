package Arrays.Sheet;

public class SquareArray {

    public static void main(String[] args) {
        int[] array = {-4,-3,-2,-1,0};
        //int[] array = {1,2,3,4,5};
        int[] output = sortedSquares(array);
        for (int item: output)
            System.out.println(item);
    }

    private static int[] sortedSquares(int[] nums) {
        boolean checkNegative = false;
        int negIndex = -1;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] < 0){
                checkNegative = true;
                negIndex = i;
            }
        }

        if (checkNegative){
            int moveForward = negIndex + 1;
            int moveBackward = negIndex;
            int[] output = new int[nums.length];
            int idx = 0;
            while(moveBackward >= 0 && moveForward < nums.length ){
                int a = nums[moveForward] * nums[moveForward];
                int b = nums[moveBackward] * nums[moveBackward];
                if(a < b){
                    output[idx] = a;
                    moveForward++;
                }else{
                    output[idx] = b;
                    moveBackward--;
                }
                idx++;
            }
            if (moveBackward >= 0){
                for (int i = moveBackward; i >= 0; i--){
                    output[idx] = nums[i] * nums[i];
                    idx++;
                }
            }
            if (moveForward < nums.length){
                for (int i = moveForward; i < nums.length; i++){
                    output[idx] = nums[i] * nums[i];
                    idx++;
                }
            }
            return output;
        }else{
            for (int i =0 ; i < nums.length; i++){
                nums[i] = nums[i] * nums[i];
            }
            return nums;
        }

    }

}
