package Problems;

/**
 * @Project: leetcode
 * @Package: Problems
 * @Description: Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * @Author: Wang Haichao
 * @CreateTime: 2020/5/15 18:01
 **/
public class Problem0286 {
    public void moveZeroes(int[] nums) {
        int Index = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[Index++] = nums[i];
            }
        }
        for(;Index < nums.length; Index++){
            nums[Index] = 0;
        }
    }
}
