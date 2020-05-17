package Problems;

/**
 * @Project: leetcode
 * @Package: Problems
 * @Description: Given a singly linked list, determine if it is a palindrome.
 * @Author: Wang Haichao
 * @CreateTime: 2020/5/17 17:29
 **/
public class Problem0234 {
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        fast = reverse(slow);

        ListNode back = fast;
        ListNode front = head;
        while(back != null){
            if(front.val != back.val) return false;
            front = front.next;
            back = back.next;
        }
        return true;
    }

    public ListNode reverse(ListNode head){
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
