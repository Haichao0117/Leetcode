package Problems;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 */
public class Problem0014 {
    public static String longestCommonPrefix(String[] strs) {
        //return version1(strs);
        return version2(strs);
    }

    public static String version2(String[] strs) {
        int n = strs.length;
        if(n==0) return "";
        if(n==1) return strs[0];
        StringBuilder sb = new StringBuilder();                 //字符串修改，用StringBuilder
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[i].charAt(i);
            for (int j = 1; j < n; j++) {
                if(i>strs[j].length()) return sb.toString();
                if(strs[j].charAt(i) != c) return sb.toString();
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public static String version1(String[] strs) {
        if (strs.length == 0) return "";
        String res = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if(res.length() == 0) return "";
            if(strs[i].length() == 0) return "";
            for (int j = 0; j < strs[i].length(); j++) {
                if ((j<res.length() && res.charAt(j) != strs[i].charAt(j)) ){
                    res = res.substring(0,j);
                    break;
                }
                else if(j == strs[i].length()-1  && j<res.length() && res.charAt(j) == strs[i].charAt(j)){
                    res = strs[i];
                    break;
                }
            }
        }
        return res;
    }
}
