package Problems;

/**
 * @Project: leetcode
 * @Package: Problems
 * @Description: Given an array of integers that is already sorted in ascending order,find two numbers such that they add up to a specific target number.
 *              The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.
 *              Note:
 *                  Your returned answers (both index1 and index2) are not zero-based.
 *                  You may assume that each input would have exactly one solution and you may not use the same element twice.
 * @Author: Wang Haichao
 * @CreateTime: 2020/5/10 16:05
 **/
public class Problem0167 {
    public static int[] twoSum(int[] numbers, int target) {
        //return version1(numbers, target);
        int begin = 0;
        int end = numbers.length-1;
        int sum = numbers[begin] + numbers[end];
        while(sum != target){
            if(sum > target) sum = numbers[begin] + numbers[--end];
            if(sum < target) sum = numbers[++begin] + numbers[end];
        }
        return new int[] {begin+1,end+1};
    }

    /**
    * @Description: 效率低，有序数组可以通过头尾两个指针搜索，效率更高
    * @Param: [numbers, target]
    * @return: int[]
    * @Author: Wang Haichao
    * @CreateTime: 2020/5/10 16:16
    * @Version: version1.0
    **/
    private static int[] version1(int[] numbers, int target) {
        int n = numbers.length;
        int[] res = new int[2];
        for(int i = 0; i < n-1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (numbers[j] == (target - numbers[i])) {
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }
        return res;
    }
}
