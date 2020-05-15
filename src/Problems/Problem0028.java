package Problems;

public class Problem0028 {
    public static int strStr(String haystack, String needle) {
        //return version1_0(haystack, needle);
        //return version1_1(haystack, needle);                                  //超时
        int Len= haystack.length(),len = needle.length();
        for (int i = 0; i < Len-len+1; i++) {
            if (haystack.substring(i,i+len).equals(needle)) return i;
        }
        return -1;
    }

    public static int version1_1(String haystack, String needle) {
        int len1 = haystack.length();
        int len2 = needle.length();
        if (needle.isEmpty()) return 0;
        if (haystack.isEmpty() || len2 > len1) return -1;

        int index = 0;
        while (index < len1){
            int i = 0;
            if(haystack.charAt(index) == needle.charAt(i)){
                while(i<len2){
                    if (index+i>=len1) break;
                    if (haystack.charAt(index+i) != needle.charAt(i)) break;
                    if (i == needle.length()-1) return index;
                    i++;
                }
            }
            index++;
        }
        return -1;
    }

    public static int version1_0(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        if (haystack.isEmpty()) return -1;
        if (needle.length() > haystack.length()) return -1;

        int index = 0;
        while (index < haystack.length()){
            int i = 0;
            if(haystack.charAt(index) == needle.charAt(i)){
                while(i<needle.length()){
                    if (index+i>=haystack.length()) break;
                    if (haystack.charAt(index+i) != needle.charAt(i)) break;
                    if (i == needle.length()-1) return index;
                    i++;
                }
            }
            index++;
        }
        return -1;
    }
}
