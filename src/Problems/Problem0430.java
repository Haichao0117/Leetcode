package Problems;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @Project: leetcode
 * @Package: Problems
 * @Description: ou are given a doubly linked list which in addition to the next and previous pointers, it could have a child pointer, which may or may not point to a separate doubly linked list.
 *              These child lists may have one or more children of their own, and so on, to produce a multilevel data structure, as shown in the example below.
 *              Flatten the list so that all the nodes appear in a single-level, doubly linked list. You are given the head of the first level of the list.
 * @Author: Wang Haichao
 * @CreateTime: 2020/5/18 17:58
 **/
public class Problem0430 {
    public Node flatten(Node head) {
        return version1(head);

    }

    /**
    * @Description: 迭代方式
    * @Param: [head]
    * @return: Problems.Node
    * @Author: Wang Haichao
    * @CreateTime: 2020/5/18 21:17
    * @Version: version1.0
    **/
    private Node version1(Node head) {
        if(head == null) return head;
        Node pseudoHead = new Node(0,null,head,null);
        Deque<Node> stack = new ArrayDeque<>();             //Deque双端队列，可做栈可做队列，对应的方法不同
        Node cur,pre = pseudoHead;
        stack.push(head);
        while(!stack.isEmpty()){
            cur = stack.pop();
            pre.next = cur;
            cur.prev = pre;
            if(cur.next != null) stack.push(cur.next);
            if(cur.child != null){
                stack.push(cur.child);
                cur.child =null;
            }
            pre = cur;
        }
        pseudoHead.next.prev = null;
        return pseudoHead.next;
    }
}
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;

    public Node() {}

    public Node(int _val,Node _prev,Node _next,Node _child) {
        val = _val;
        prev = _prev;
        next = _next;
        child = _child;
    }
}
