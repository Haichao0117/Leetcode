package Problems;

import java.util.HashMap;

/**
 * @Project: leetcode
 * @Package: Problems
 * @Description: Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.
 * @Author: Wang Haichao
 * @CreateTime: 2020/5/23 19:51
 **/
public class Problem0219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i],i);
            }else{
                if(i - hm.get(nums[i]) <= k){
                    return true;
                }
                hm.put(nums[i],i);
            }
        }
        return false;
    }
}
