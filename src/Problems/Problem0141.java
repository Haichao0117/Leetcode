package Problems;

/**
 * @Project: leetcode
 * @Package: Problems
 * @Description: Given a linked list, determine if it has a cycle in it.
 *              To represent a cycle in the given linked list, we use an integer pos which represents the position (0-indexed) in the linked list where tail connects to.
 *              If pos is -1, then there is no cycle in the linked list.
 * @Author: Wang Haichao
 * @CreateTime: 2020/5/16 17:20
 **/
public class Problem0141 {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {            //只需要判断fast是否为空即可，就可以避免fast指针为空
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
