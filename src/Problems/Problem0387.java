package Problems;

import java.util.HashMap;

/**
 * @Project: leetcode
 * @Package: Problems
 * @Description: Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
 * @Author: Wang Haichao
 * @CreateTime: 2020/5/23 17:12
 **/
public class Problem0387 {
    public int firstUniqChar(String s) {
        //return version1(s);
        int[] char_num = new int [26];
        char[] chars = s.toCharArray();
        for(char c : chars){
            char_num[c - 'a']++;
        }
        for(int i = 0; i < chars.length; i++){
            if(char_num[chars[i] - 'a'] == 1) return i;
        }
        return -1;
    }

    private int version1(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(!hm.containsKey(c)){
                hm.put(c,1);
            }else{
                hm.put(c,hm.get(c)+1);
            }
        }
        for(int i = 0; i < s.length(); i++){
            if(hm.get(s.charAt(i)) == 1) return i;
        }
        return -1;
    }
}
