package Problems;

import java.util.HashSet;

/**
 * @Project: leetcode
 * @Package: Problems
 * @Description: Given an array of integers, find if the array contains any duplicates.
 *              Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
 * @Author: Wang Haichao
 * @CreateTime: 2020/5/19 18:38
 **/
public class Problem0217 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++) {
            if (hs.contains(nums[i])) return true;
            else hs.add(nums[i]);
        }
        return false;
    }
}
