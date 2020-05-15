package Problems;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @Project: leetcode
 * @Package: Problems
 * @Description: Given an input string, reverse the string word by word.
 * @Author: Wang Haichao
 * @CreateTime: 2020/5/13 15:40
 **/
public class Problem0151 {
    public static String reverseWords(String s) {
        //return version1(s);
        s = s.trim();
        StringBuilder sb = new StringBuilder();
        int cur_index = s.length()-1;
        int pre_index = cur_index;
        while (cur_index >=0){
            while(s.charAt(cur_index) != ' ') cur_index--;
            sb.append(s.substring(cur_index+1,pre_index+1));
            while (s.charAt(cur_index) == ' ') cur_index--;
            pre_index = cur_index;
        }
        return sb.toString().trim();
    }

    private static String version1(String s) {
        s = s.trim();
        List<String> list = Arrays.asList(s.split("//s+"));
        Collections.reverse(list);
        return String.join("",list);
    }
}
