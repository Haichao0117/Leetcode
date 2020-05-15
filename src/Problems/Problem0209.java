package Problems;

/**
 * @Project: leetcode
 * @Package: Problems
 * @Description: Given an array of n positive integers and a positive integer s, find the minimal length of a contiguous subarray of which the sum ≥ s.
 *              If there isn't one, return 0 instead.
 * @Author: Wang Haichao
 * @CreateTime: 2020/5/10 19:28
 **/
public class Problem0209 {
    public static int minSubArrayLen(int s, int[] nums) {
        int length = nums.length;
        if(length == 0) return 0;
        int sum = 0, left = 0, right = 0;
        int min = Integer.MAX_VALUE;
        while(right < length){
            sum += nums[right++];
            while(sum >= s){
                min = Math.min(min,right-left);
                sum -= nums[left++];
            }
        }
        return min == Integer.MAX_VALUE ? 0:min;
    }
}
