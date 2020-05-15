package Problems;

import java.util.Arrays;

/**
 * @Project: Java
 * @Package: Problems
 * @Description: Given an array of 2n integers, your task is to group these integers into n pairs of integer,
 * say (a1, b1), (a2, b2), ..., (an, bn)
 * which makes sum of min(ai, bi) for all i from 1 to n as large as possible.
 * @Author: Wang Haichao
 * @CreateTime: 2020/5/8 22:40
 **/
public class Problem0561 {
    public int arrayPairSum(int[] nums) {
        return version1(nums);
    }

    /**
     * @Description:
     * @Param: [nums]
     * @return: int
     * @Author: Wang Haichao
     * @CreateTime: 2020/5/8 23:01
     * @Version: version1.0
     **/
    public int version1(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for (int i = 0; i < nums.length; i += 2) {
            result += nums[i];
        }
        return result;
    }

    /**
    * @Description: 尝试实现双指针快速排序
    * @Param: [nums, begin, end]
    * @return: void
    * @Author: Wang Haichao
    * @CreateTime: 2020/5/10 16:11
    * @Version: version1.0
    **/
    public void doublePointerSort(int[] nums, int begin, int end){
        while (begin < end){
            while (nums[begin] <  nums[end]){
                end--;
            }
            int temp = nums[begin];
            nums[begin] = nums[end];
            nums[end] = temp;

        }
    }

}
