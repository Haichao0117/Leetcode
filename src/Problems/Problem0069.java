package Problems;

/**
 * @Project: leetcode
 * @Package: Problems
 * @Description: Implement int sqrt(int x).
 *              Compute and return the square root of x, where x is guaranteed to be a non-negative integer.
 *              Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.
 * @Author: Wang Haichao
 * @CreateTime: 2020/5/27 12:10
 **/
public class Problem0069 {
    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        int mid = 0;
        while(left <= right){
            mid = left + (right - left)/2;
            long square = (long)mid * mid;
            if(square == x) return mid;
            if(square > x) right = mid - 1;
            if(square < x) left = mid + 1;
        }
        return mid * mid > x? mid - 1 : mid;
    }
}
