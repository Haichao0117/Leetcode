package Problems;

public class Problem0724 {
    public static int pivotIndex(int[] nums) {
        if (nums.length == 0)
            return -1;
        int leftSum = 0;
        int Sum = 0;
        for (int i : nums
        ) {
            Sum += i;
        }
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == (Sum - nums[i] - leftSum)) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}
