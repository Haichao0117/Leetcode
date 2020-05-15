package Problems;

public class Problem0747 {
    public static int dominantIndex(int[] nums) {
        //return version1(nums);
        int Max = 0;
        int Second = 0;
        int Index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>Max){
                Second = Max;
                Max = nums[i];
                Index = i;
            }else if(nums[i] > Second){
                Second = nums[i];
            }
        }
        return Max > (Second * 2)? Index:-1;
    }

    public static int version1(int[] nums) {
        int Max = 0;
        int DoubleMax = 0;
        int Index = 0;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] > Max){
                DoubleMax = Max*2;
                Max = nums[i];
                Index = i;
            }else if(nums[i]*2>DoubleMax){
                DoubleMax = nums[i]*2;
            }
        }
        return Max>=DoubleMax ? Index:-1;
    }
}
