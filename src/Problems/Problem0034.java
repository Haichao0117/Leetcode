package Problems;

/**
 * @Project: leetcode
 * @Package: Problems
 * @Description:
 * @Author: Wang Haichao
 * @CreateTime: 2020/6/1 22:05
 **/
public class Problem0034 {
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1,-1};
        if(nums.length == 0) return res;
        //左边界
        int left = 0;
        int right = nums.length;        //左闭右开
        while(left  < right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                right = mid;        //注意寻找右边界时，此时的条件
            }
            if(nums[mid] < target){
                left = mid + 1;
            }
            if(nums[mid] > target){
                right = mid;        //右开
            }
        }
        //判断循环结束结果是否正确
        if(left == nums.length) return new int[] {-1,-1};
        res[0] = nums[left] == target? left:-1;

        //右边界
        left = 0;
        right = nums.length;        //左闭右开
        while(left  < right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                left = mid + 1;
            }
            if(nums[mid] < target){
                left = mid + 1;
            }
            if(nums[mid] > target){
                right = mid;
            }
        }
        //判断循环结束结果是否正确
        if(left == 0) return new int[] {-1,-1};
        res[1] = nums[left - 1] == target? left-1:-1;
        return res;
    }
}
