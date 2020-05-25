package Problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Project: leetcode
 * @Package: Problems
 * @Description: Given a non-empty array of integers, return the k most frequent elements.
 * @Author: Wang Haichao
 * @CreateTime: 2020/5/25 20:56
 **/
public class Problem0347 {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm1 = new HashMap<>();
        for(int num : nums){
            hm1.put(num,hm1.getOrDefault(num,0)+1);
        }
        List<Integer>[] list = new List[nums.length+1];
        for(int key : hm1.keySet()){
            int i = hm1.get(key);
            if(list[i] == null){
                list[i] = new ArrayList();
            }
            list[i].add(key);
        }
        int[] res = new int[k];
        int index = 0;
        for(int i = list.length-1; i>=0 && index < k;i--){
            if(list[i] == null) continue;
            else{
                for(int j = 0; j < list[i].size();j++){
                    res[index++] = list[i].get(j);
                }
            }
        }
        return res;
    }
}
