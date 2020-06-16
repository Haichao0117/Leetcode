package Problems;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @Project: leetcode
 * @Package: Problems
 * @Description: You are given a perfect binary tree where all leaves are on the same level, and every parent has two children.
 * Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.
 * Initially, all next pointers are set to NULL.
 * @Author: Wang Haichao
 * @CreateTime: 2020/6/16 11:02
 **/
public class Problem0116 {
    public Node_116 connect(Node_116 root) {
        Deque<Node_116> q = new LinkedList<Node_116>();
        if(root == null) return root;
        Node_116 cur = root;
        q.add(cur);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                cur = q.remove();
                if(i<size-1){
                    cur.next = q.peek();
                }
                if(cur.left != null){
                    q.add(cur.left);
                }
                if(cur.right != null){
                    q.add(cur.right);
                }
            }

        }
        return root;

    }
}

class Node_116{
    public int val;
    public Node_116 left;
    public Node_116 right;
    public Node_116 next;

    public Node_116() {}

    public Node_116(int _val) {
        val = _val;
    }

    public Node_116(int _val, Node_116 _left, Node_116 _right, Node_116 _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
