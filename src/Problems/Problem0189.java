package Problems;

/**
 * @Project: leetcode
 * @Package: Problems
 * @Description: Given an array, rotate the array to the right by k steps, where k is non-negative.
 * @Author: Wang Haichao
 * @CreateTime: 2020/5/13 14:02
 **/
public class Problem0189 {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        int count = 0 ;
        for(int start = 0; count < n; start++){
            //初始化起点
            int pre_value = nums[start];
            int cur_index = (start + k) % n;
            while (cur_index != start){
                int cur_value = nums[cur_index];
                nums[cur_index] = pre_value;
                //移向下一个位置
                cur_index = (cur_index + k) % n;
                pre_value = cur_value;
                count++;
            }
            //补全最后一位
            nums[start] = pre_value;
            count++;
        }


    }
}
