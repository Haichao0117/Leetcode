package Problems;

import java.util.HashSet;

/**
 * @Project: leetcode
 * @Package: Problems
 * @Description: Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
 *              To represent a cycle in the given linked list, we use an integer pos which represents the position (0-indexed) in the linked list where tail connects to.
 *              If pos is -1, then there is no cycle in the linked list.
 * @Author: Wang Haichao
 * @CreateTime: 2020/5/16 17:22
 **/
public class Problem0142 {
    public ListNode detectCycle(ListNode head) {
        //return version1(head);
        return version2(head);
    }

    /**
    * @Description:  Floyd 算法：先用快慢指针判断是否为环，如果为环则找到快慢指针的相遇的Node，再从head跟该Node点开始一起单步移动，两点必在入口处相遇.
    * @Param: [head]
    * @return: Problems.ListNode
    * @Author: Wang Haichao
    * @CreateTime: 2020/5/16 20:28
    * @Version: version1.0
    **/
    private ListNode version2(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;

        do{
            if (fast == null || fast.next == null) {            //只需要判断fast是否为空即可，就可以避免fast指针为空
                return null;
            }
            slow = slow.next;
            fast = fast.next.next;
        }while (slow != fast) ;
        ListNode start = head;
        while(start != slow){
            start = start.next;
            slow = slow.next;
        }
        return slow;
    }

    /**
    * @Description: 使用HashSet解决，方法简单，但是使用了额外的空间
    * @Param: [head]
    * @return: Problems.ListNode
    * @Author: Wang Haichao
    * @CreateTime: 2020/5/16 17:38
    * @Version: version1.0
    **/
    private ListNode version1(ListNode head) {
        HashSet<ListNode> hs = new HashSet<>();
        while(head != null){
            if(hs.contains(head)) return head;
            else hs.add(head);
            head = head.next;
        }
        return null;
    }
}
