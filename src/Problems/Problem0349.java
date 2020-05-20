package Problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @Project: leetcode
 * @Package: Problems
 * @Description: Given two arrays, write a function to compute their intersection.
 * @Author: Wang Haichao
 * @CreateTime: 2020/5/20 17:25
 **/
public class Problem0349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<>();
        for(int num:nums1){
            if(!hs.contains(num)) hs.add(num);
        }
        List<Integer> res = new ArrayList<>();
        for(int num:nums2){
            if(hs.contains(num)) {
                res.add(num);
                hs.remove(num);
            }
        }
        int[] nums = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            nums[i] = res.get(i);
        }
        return nums;
    }
}
