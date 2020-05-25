package Problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 * @Project: leetcode
 * @Package: Problems
 * @Description: Design a data structure that supports all following operations in average O(1) time.
 *                  insert(val): Inserts an item val to the set if not already present.
 *                  remove(val): Removes an item val from the set if present.
 *                  getRandom: Returns a random element from current set of elements. Each element must have the same probability of being returned.
 * @Author: Wang Haichao
 * @CreateTime: 2020/5/25 21:45
 **/
public class Problem0380 {
}

class RandomizedSet {
    HashMap<Integer,Integer> hm;
    List<Integer> list;
    Random rand = new Random();
    /** Initialize your data structure here. */
    public RandomizedSet() {
        hm = new HashMap<>();
        list = new ArrayList<>();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(hm.containsKey(val)) return false;
        else{
            hm.put(val,list.size());
            list.add(list.size(),val);
            return true;
        }
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(!hm.containsKey(val)) return false;
        else{
            int lastElement = list.get(list.size()-1);
            int index = hm.get(val);
            list.set(index,lastElement);
            hm.put(lastElement,index);
            list.remove(list.size()-1);
            hm.remove(val);
            return true;
        }
    }

    /** Get a random element from the set. */
    public int getRandom() {
        return list.get(rand.nextInt(list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
