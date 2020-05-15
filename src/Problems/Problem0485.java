package Problems;

/**
 * @Project: leetcode
 * @Package: Problems
 * @Description: Given a binary array, find the maximum number of consecutive 1s in this array.
 * @Author: Wang Haichao
 * @CreateTime: 2020/5/10 19:14
 **/
public class Problem0485 {
    public static int findMaxConsecutiveOnes(int[] nums) {
        //return version1(nums);
        int Max = 0;
        int head = 0;
        int tail = 0;
        while(tail<nums.length){
            if(nums[tail] == 0){
                if(tail-head > Max){
                    Max = tail - head;
                }
                tail++;
                head = tail;
            }else{
                tail++;
            }
        }
        return tail - head > Max? tail-head : Max;
    }

    /**
    * @Description: 单指针，可以使用双指针，减少判断次数
    * @Param: [nums]
    * @return: int
    * @Author: Wang Haichao
    * @CreateTime: 2020/5/10 19:16
    * @Version: version1.0
    **/
    private static int version1(int[] nums) {
        int Max = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                Max = Max > count ? Max : count;
            } else {
                count = 0;
            }
        }
        return Max;
    }
}
