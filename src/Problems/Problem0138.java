package Problems;

import java.util.HashMap;

/**
 * @Project: leetcode
 * @Package: Problems
 * @Description:
 * @Author: Wang Haichao
 * @CreateTime: 2020/5/18 21:28
 **/
public class Problem0138 {
    public Node_138 copyRandomList(Node_138 head) {
        if(head == null) return null;
        Node_138 copy_head = new Node_138(head.val);
        Node_138 cur = head;
        Node_138 copy_cur = copy_head;
        HashMap<Node_138,Node_138> hm = new HashMap<>();
        hm.put(cur,copy_cur);
        while(cur!= null){
            if(cur.random != null){
                if(!hm.containsKey(cur.random)){
                    copy_cur.random = new Node_138(cur.random.val);
                    hm.put(cur.random,copy_cur.random);
                }else{
                    copy_cur.random = hm.get(cur.random);
                }
            }else{
                copy_cur.random = null;
            }

            if(cur.next != null){
                if(!hm.containsKey(cur.next)){
                    copy_cur.next = new Node_138(cur.next.val);
                    hm.put(cur.next,copy_cur.next);
                }else{
                    copy_cur.next = hm.get(cur.next);
                }
            }else{
                copy_cur.next = null;
            }

            hm.put(cur,copy_cur);

            cur = cur.next;
            copy_cur = copy_cur.next;
        }
        return copy_head;
    }
}
class Node_138 {
    int val;
    Node_138 next;
    Node_138 random;

    public Node_138(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}