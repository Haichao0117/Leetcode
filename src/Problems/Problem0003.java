package Problems;

import java.util.HashMap;

/**
 * @Project: leetcode
 * @Package: Problems
 * @Description:
 * @Author: Wang Haichao
 * @CreateTime: 2020/5/24 18:13
 **/
public class Problem0003 {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        char[] chars = s.toCharArray();
        int length = chars.length;
        int left = 0;
        int max = 0;
        for(int i = 0; i < length; i++){
            if(hm.containsKey(chars[i])){
                left = Math.max(left,hm.get(chars[i])+1);
                //left = hm.get(chars[i])+1;
            }
            hm.put(chars[i],i);
            max = Math.max(max,i-left+1);
        }
        return max;


    }
}
