package Problems;

/**
 * @Project: leetcode
 * @Package: Problems
 * @Description: You are given two non-empty linked lists representing two non-negative integers.
 *              The digits are stored in reverse order and each of their nodes contain a single digit.
 *              Add the two numbers and return it as a linked list.
 *              You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * @Author: Wang Haichao
 * @CreateTime: 2020/5/18 17:22
 **/
public class Problem0002 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode head =  new ListNode(0);
        ListNode cur = head;
        while(l1 != null || l2 != null){
            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;
            int sum = val1 + val2 + carry;
            int val = sum%10;
            carry = sum/10;
            ListNode add = new ListNode(val);
            cur.next = add;
            cur = add;
            l1 = l1 == null? l1:l1.next;
            l2 = l2 == null? l2:l2.next;
        }
        if(carry == 1) {
            ListNode add = new ListNode(1);
            cur.next = add;
        }
        return head.next;
    }
}
