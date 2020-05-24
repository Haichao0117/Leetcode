package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @Project: leetcode
 * @Package: Problems
 * @Description:
 * @Author: Wang Haichao
 * @CreateTime: 2020/5/24 16:31
 **/
public class Problem0049 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        if(strs.length == 0) return result;
        HashMap<String,List<String>> hm = new HashMap<>();
        for(String str:strs){
            String temp = getSort(str);
            if(hm.containsKey(temp)){
                List<String> list = hm.get(temp);
                list.add(str);
                hm.put(temp,list);
            }else {
                List<String> list = new ArrayList<>();
                list.add(str);
                hm.put(temp,list);
            }
        }
        for(String key:hm.keySet()){
            result.add(hm.get(key));
        }
        return result;
    }

    public String getSort(String str){
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
//        StringBuilder sb = new StringBuilder();
//        for(char ch:chars){
//            sb.append(ch);
//        }
//        return sb.toString();
        return new String(chars);
    }
}
