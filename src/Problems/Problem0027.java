package Problems;

/**
 * @Project: leetcode
 * @Package: Problems
 * @Description: Given an array nums and a value val, remove all instances of that value in-place and return the new length.
 *              Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 *              The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 * @Author: Wang Haichao
 * @CreateTime: 2020/5/10 16:44
 **/
public class Problem0027 {
    public static int removeElement(int[] nums, int val) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (nums[i] == val) {
                for (int j = i; j < length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[--length] = 0;
                i--;
            }
        }
        return length;
    }
}
