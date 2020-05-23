package Problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @Project: leetcode
 * @Package: Problems
 * @Description: Write an algorithm to determine if a number n is "happy".A happy number is a number defined by the following process:
 *              Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.
 *              Return True if n is a happy number, and False if not.
 * @Author: Wang Haichao
 * @CreateTime: 2020/5/20 17:59
 **/
public class Problem0202 {
    public boolean isHappy(int n) {
        HashSet<Integer> hs = new HashSet<>();

        while(!hs.contains(n)){
            if(n == 1) return true;
            hs.add(n);
            n = getNext(n);
        }
        return false;
    }
    public int getNext(int n){
        int next = 0;
        while(n != 0){
            int d = n%10;
            next += d*d;
            n = n/10;
        }
        return next;
    }
}
