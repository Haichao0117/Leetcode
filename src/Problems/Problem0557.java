package Problems;

/**
 * @Project: leetcode
 * @Package: Problems
 * @Description: Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
 * @Author: Wang Haichao
 * @CreateTime: 2020/5/13 17:25
 **/
public class Problem0557 {
    public static String reverseWords(String s) {
        //return version1(s);
        if(s == null) return null;
        StringBuilder sb = new StringBuilder();
        for(String temp : s.split(" ")){
            temp = new StringBuilder(temp).reverse().toString();
            sb.append(temp).append(" ");
        }
        return sb.toString().substring(0,sb.toString().length()-1);
    }

    private static String version1(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.trim();
        int preIndex = -1;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' ' && i < s.length()-1){
                char[] c = s.substring(preIndex+1,i).toCharArray();
                for (int j = c.length-1;j>=0;j--) {
                    sb.append(c[j]);
                }
                sb.append(' ');
                preIndex = i;
            }else if(i == s.length()-1){
                char[] c = s.substring(preIndex+1,i+1).toCharArray();
                for (int j = c.length-1;j>=0;j--) {
                    sb.append(c[j]);
                }
            }
        }
        return sb.toString();
    }
}
