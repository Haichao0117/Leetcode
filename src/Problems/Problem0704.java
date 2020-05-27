package Problems;

/**
 * @Project: leetcode
 * @Package: Problems
 * @Description: Given a sorted (in ascending order) integer array nums of n elements and a target value, write a function to search target in nums. If target exists, then return its index, otherwise return -1.
 * @Author: Wang Haichao
 * @CreateTime: 2020/5/27 11:36
 **/
public class Problem0704 {
    public int search(int[] nums, int target) {
        //return version1(nums, target);
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target) return mid;
            if(nums[mid] < target) left = mid + 1;
            if(nums[mid] > target) right = mid - 1;
        }
        return -1;
    }

    private int version1(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int mid = (left+right)/2;
        while(left != mid && right != mid){
            if(nums[mid] > target){
                right = mid;
                mid = (left+right)/2;
            }else if(nums[mid] < target){
                left = mid;
                mid = (left+right)/2;
            }else{
                return mid;
            }
        }
        if(nums[left]  == target) return left;
        if(nums[right] == target) return right;
        else return -1;
    }
}
