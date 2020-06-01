package Problems;

/**
 * @Project: leetcode
 * @Package: Problems
 * @Description:
 * @Author: Wang Haichao
 * @CreateTime: 2020/6/1 19:46
 **/
public class Problem0153 {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while(left < right){
            int mid = left + (right - left)/2;
            if(nums[mid] > nums[right]){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        return nums[left];
    }
    //参考https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array/solution/er-fen-cha-zhao-wei-shi-yao-zuo-you-bu-dui-cheng-z/
    //对理解二分查找有很大帮助

    private int version1(int[] nums) {
        if(nums.length == 1) return nums[0];
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = left + (right -left)/2;
            if(nums[0] < nums[right]) return nums[0];
            if(nums[mid] > nums[mid + 1]) return nums[mid + 1];
            if(nums[mid] < nums[mid - 1]) return nums[mid];
            if(nums[mid] > nums[0]){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return -1;
    }
    private int version2(int[] nums){
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left + 1) / 2;   /* 先加一再除，mid更靠近右边的right */
            if (nums[left] < nums[mid]) {
                left = mid;                            /* 向右移动左边界 */
            } else if (nums[left] > nums[mid]) {
                right = mid - 1;                       /* 向左移动右边界 */
            }
        }
        return nums[(right + 1) % nums.length];    /* 最大值向右移动一位就是最小值了（需要考虑最大值在最右边的情况，右移一位后对数组长度取余） */

    }
}
