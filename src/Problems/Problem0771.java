package Problems;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @Project: leetcode
 * @Package: Problems
 * @Description: You're given strings J representing the types of stones that are jewels, and S representing the stones you have.
 *              Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
 *              The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".
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
