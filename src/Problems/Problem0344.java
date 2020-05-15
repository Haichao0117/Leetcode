package Problems;

/**
 * Write a function that reverses a string. The input string is given as an array of characters char[].
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * You may assume all the characters consist of printable ascii characters.
 */
public class Problem0344 {
    public void reverseString(char[] s) {
        int n = s.length;
        //if( n==0 || n ==1) return ;
        int i=0,j = n-1;
        while(i<j){
            char c = s[i];
            s[i++] = s[j];
            s[j--] = c;
        }
    }
}
