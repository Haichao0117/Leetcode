package Problems;

/**
 * @Project: leetcode
 * @Package: Problems
 * @Description: We are playing the Guess Game. The game is as follows:
 *              I pick a number from 1 to n. You have to guess which number I picked.
 *              Every time you guess wrong, I'll tell you whether the number is higher or lower.
 *              You call a pre-defined API guess(int num) which returns 3 possible results (-1, 1, or 0):
 * @Author: Wang Haichao
 * @CreateTime: 2020/5/27 15:07
 **/
public class Problem0374 {
    public int guessNumber(int n) {
        int max = n;
        int min = 0;
        int mid = 0;
        while(min <= max){
            mid = min + (max - min)/2;
            int res = guess(mid);
            if(res == 0) return mid;
            if(res == -1){
                max = mid - 1;
            }
            if(res == 1){
                min = mid + 1;
            }
        }
        return -1;
    }

    /**
     * Forward declaration of guess API.
     * @param  num   your guess
     * @return 	     -1 if num is lower than the guess number
     *			      1 if num is higher than the guess number
     *               otherwise return 0
     * int guess(int num);
     */
}
