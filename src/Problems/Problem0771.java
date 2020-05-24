package Problems;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @Project: leetcode
 * @Package: Problems
 * @Description:
 * @Author: Wang Haichao
 * @CreateTime: 2020/5/24 18:01
 **/
public class Problem0771 {
    public int numJewelsInStones(String J, String S) {
        //return version1(J, S);
        HashSet<Character> hs = new HashSet<>();
        char[] Jchars = J.toCharArray();
        char[] Schars = S.toCharArray();
        for(char ch : Jchars){
            hs.add(ch);
        }
        int res = 0;
        for(char ch : Schars){
            if(hs.contains(ch)){
                res++;
            }
        }
        return res;
    }

    private int version1(String J, String S) {
        HashMap<Character,Integer> hm = new HashMap<>();
        char[] Jchars = J.toCharArray();
        char[] Schars = S.toCharArray();
        for(char ch : Jchars){
            hm.put(ch,0);
        }
        for(char ch : Schars){
            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)+1);
            }
        }
        int res = 0;
        for(char key : hm.keySet()){
            res += hm.get(key);
        }
        return res;
    }
}
