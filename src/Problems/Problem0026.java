package Problems;

/**
 * @Project: leetcode
 * @Package: Problems
 * @Description: Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
 *              Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * @Author: Wang Haichao
 * @CreateTime: 2020/5/15 16:15
 **/
public class Problem0026 {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        int Index = 0;
        for(int i = 1; i < n; i++){
            if(nums[i] > nums[i-1]){
                nums[++Index] = nums[i];
            }
        }
        return Index+1;
    }
}
