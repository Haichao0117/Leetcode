package Problems;

import java.util.HashMap;

/**
 * @Project: leetcode
 * @Package: Problems
 * @Description: Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 * @Author: Wang Haichao
 * @CreateTime: 2020/5/20 17:09
 **/
public class Problem0136 {
    public int singleNumber(int[] nums) {
        //return version1(nums);
        return version2(nums);
    }

    /**
    * @Description: 用到了位运算
     *              异或运算：1）与0异或为本身；2）与自己异或为0；3）符合交换律
    * @Param: [nums]
    * @return: int
    * @Author: Wang Haichao
    * @CreateTime: 2020/5/20 17:19
    * @Version: version1.0
    **/
    private int version2(int[] nums) {
        int single = 0;
        for(int num:nums){
            single ^= num;
        }
        return single;
    }

    private int version1(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int num : nums){
            if(hm.containsKey(num)){
                hm.put(num,hm.get(num)+1);
            }else{
                hm.put(num,1);
            }
        }
        for (int key: hm.keySet()
             ) {
            if(hm.get(key) == 1) return key;
        }
        return -1;
    }
}
