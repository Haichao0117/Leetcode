package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * @Project: leetcode
 * @Package: Problems
 * @Description:
 * @Author: Wang Haichao
 * @CreateTime: 2020/5/23 19:02
 **/
public class Problem0350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        //return version1(nums1, nums2);
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0 ,j = 0,k = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]) i++;
            else if(nums1[i] > nums2[j]) j++;
            else if(nums1[i] == nums2[j]){
                nums1[k++] = nums1[i];
                i++;
                j++;
            }
        }
        return Arrays.copyOfRange(nums1,0,k);
    }

    /**
    * @Description: 用HashMap
    * @Param: [nums1, nums2]
    * @return: int[]
    * @Author: Wang Haichao
    * @CreateTime: 2020/5/23 19:19
    * @Version: version1.0
    **/
    private int[] version1(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int num:nums1){
            if(hm.containsKey(num)){
                hm.put(num,hm.get(num)+1);
            }else{
                hm.put(num,1);
            }
        }
        ArrayList<Integer> inter = new ArrayList<>();
        for(int num : nums2){
            if(hm.containsKey(num)){
                if(hm.get(num) > 0){
                    hm.put(num,hm.get(num)-1);
                    inter.add(num);
                }
            }
        }
        int[] res = new int[inter.size()];
        int i = 0;
        for(int num : inter){
            res[i++] = num;
        }
        return res;
    }
}
