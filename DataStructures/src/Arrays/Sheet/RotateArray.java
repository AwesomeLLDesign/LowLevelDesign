package Arrays.Sheet;

public class RotateArray {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        int  k = 11;
        rotate(nums, k);
        for (int item: nums)
            System.out.println(item);
    }

    public static void rotate(int[] nums, int k) {
        k = k%nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums,0, k-1);
        reverse(nums, k, nums.length - 1);

    }

    private static void reverse(int[] nums, int start, int end){
        int temp = 0;
        while (start<end){
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

}
