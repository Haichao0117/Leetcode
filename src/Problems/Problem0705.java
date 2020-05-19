package Problems;

import java.util.LinkedList;

/**
 * @Project: leetcode
 * @Package: Problems
 * @Description:
 * @Author: Wang Haichao
 * @CreateTime: 2020/5/19 18:12
 **/
public class Problem0705 {

}

class MyHashSet {

    private Bucket[] bucketArray;
    private int keyRange;
    /** Initialize your data structure here. */
    public MyHashSet() {
        this.keyRange = 769;
        this.bucketArray = new Bucket[this.keyRange];
    }

    public int _hash(int key){
        return key % this.keyRange;
    }
    public void add(int key) {
        int index = this._hash(key);
        this.bucketArray[index].insert(key);
    }

    public void remove(int key) {
        int index = this._hash(key);
        this.bucketArray[index].delete(key);
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        int index = this._hash(key);
        return this.bucketArray[index].exists(key);
    }
}

class Bucket{
    private LinkedList<Integer> container;

    public Bucket() {
        container = new LinkedList<>();
    }

    public void insert(Integer key){
        int index = this.container.indexOf(key);
        if(index == -1){
            this.container.addFirst(key);
        }
    }

    public void delete(Integer key){
        this.container.remove(key);
    }

    public boolean exists(Integer key) {
        int index = this.container.indexOf(key);
        return (index != -1);
    }

}


/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
