package Problems;

/**
 * @Project: leetcode
 * @Package: Problems
 * @Description: Reverse a singly linked list.
 * @Author: Wang Haichao
 * @CreateTime: 2020/5/17 15:02
 **/
public class Problem0206 {
    public ListNode reverseList(ListNode head) {
        return version1(head);
    }

    private ListNode version1(ListNode head) {
        if(head == null) return head;
        ListNode next_node = head.next;
        ListNode end = head;
        while(end.next != null){
            next_node = end.next;
            end.next = next_node.next;
            next_node.next = head;
            head = next_node;
        }
        return head;
    }
}
