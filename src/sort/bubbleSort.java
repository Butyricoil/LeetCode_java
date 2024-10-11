package sort;

public class bubbleSort {
    class Solution {
        public int[] sortArray(int[] nums) {

            boolean swapped = true;
            while (swapped) {
                swapped = false;
                for (int i =0; i < nums.length - 1; i ++) {
                    if (nums[i] > nums[i + 1]) {
                        int temp = nums[i];
                        nums[i] = nums[i + 1];
                        nums[i + 1] = temp;
                        swapped = true;
                    }
                }
            }
            return nums;
        }
    }

}
