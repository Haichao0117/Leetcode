package Problems;

import java.util.HashMap;

/**
 * @Project: leetcode
 * @Package: Problems
 * @Description:
 * @Author: Wang Haichao
 * @CreateTime: 2020/5/24 22:05
 **/
public class Problem0454 {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < B.length; j++){
                int sum = A[i]+B[j];
                hm.put(sum,hm.getOrDefault(A[i]+B[j],0)+1);
            }
        }
        int res = 0;
        for(int i = 0; i < C.length; i++){
            for(int j = 0; j < D.length; j++){
                int sum = -(C[i]+D[j]);
                if(hm.containsKey(sum)){
                    res += hm.get(sum);
                }
            }
        }
        return res;
    }
    //Note:考虑暴力解法，但是时间复杂度过大；分成两组，时间复杂度O（n^2）
}
