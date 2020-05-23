package Problems;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @Project: leetcode
 * @Package: Problems
 * @Description:
 * @Author: Wang Haichao
 * @CreateTime: 2020/5/23 16:26
 **/
public class Problem0599 {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> hm = new HashMap<>();
        int min = Integer.MAX_VALUE;
        ArrayList<String> result = new ArrayList<>();
        for(int i = 0; i < list1.length; i++){
            hm.put(list1[i],i);
        }
        for(int i = 0; i < list2.length;i++){
            if(hm.containsKey(list2[i])){
                if(hm.get(list2[i]) + i < min){
                    result.clear();
                    result.add(list2[i]);
                    min = hm.get(list2[i]) + i ;
                }else if(hm.get(list2[i]) + i == min)
                {
                    result.add(list2[i]);
                }

            }
        }

        return result.toArray(new String[result.size()]);
    }
}
