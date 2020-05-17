package Problems;

/**
 * @Project: leetcode
 * @Package: Problems
 * @Description: Remove all elements from a linked list of integers that have value val.
 * @Author: Wang Haichao
 * @CreateTime: 2020/5/17 15:20
 **/
public class Problem0203 {
    public ListNode removeElements(ListNode head, int val) {
        //return version1(head, val);
        return version2(head, val);

    }

    private ListNode version2(ListNode head, int val) {
        if(head == null) return head;
        if(head.val == val) return removeElements(head.next,val);
        ListNode pre = head;
        ListNode cur = pre.next;
        while(cur != null){
            if(cur.val == val){
                pre.next = cur.next;
                cur = cur.next;
            }else{
                cur = cur.next;
                pre = pre.next;
            }
        }
        return head;
    }

    private ListNode version1(ListNode head, int val) {
        while(head != null && head.val == val) head = head.next;
        ListNode pre = head;
        if(pre == null) return head;
        ListNode cur = pre.next;
        while(cur != null){
            if(cur.val == val){
                pre.next = cur.next;
                cur = cur.next;
            }else{
                cur = cur.next;
                pre = pre.next;
            }
        }
        return head;
    }
}
