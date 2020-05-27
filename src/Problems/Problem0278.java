package Problems;

/**
 * @Project: leetcode
 * @Package: Problems
 * @Description:
 * @Author: Wang Haichao
 * @CreateTime: 2020/5/27 17:02
 **/
public class Problem0278 {
    public int firstBadVersion(int n) {
        int start = 0;
        int end = n;
        //int mid = 0;
        while(start < end){
            int mid = start + (end - start)/2;
            if(isBadVersion(mid)){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return isBadVersion(start)? start:start+1;
    }
}
