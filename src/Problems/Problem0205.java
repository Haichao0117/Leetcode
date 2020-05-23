package Problems;

import java.util.HashMap;

/**
 * @Project: leetcode
 * @Package: Problems
 * @Description:
 * @Author: Wang Haichao
 * @CreateTime: 2020/5/23 15:57
 **/
public class Problem0205 {
    public boolean isIsomorphic(String s, String t) {
        return Isomorphic(s,t) && Isomorphic(t,s);
    }

    public boolean Isomorphic(String s, String t) {
        HashMap<Character,Character> hm = new HashMap<>();
        for(int i = 0; i < s.length();i++){
            if(hm.containsKey(s.charAt(i))){
                if(hm.get(s.charAt(i)) != t.charAt(i)) return false;
            }else{
                hm.put(s.charAt(i),t.charAt(i));
            }
        }
        return true;
    }
}
