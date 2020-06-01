package Problems;

/**
 * @Project: leetcode
 * @Package: Problems
 * @Description:
 * @Author: Wang Haichao
 * @CreateTime: 2020/6/1 19:19
 **/
public class Problem0162 {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while(left < right){
            int mid = left + (right -left)/2;
            if(nums[mid] < nums[mid+1]){
                left = mid + 1;
            }else if(nums[mid]>nums[mid+1]){
                right = mid;
            }
        }
        return left;
    }
}
