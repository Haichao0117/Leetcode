package Problems;

/**
 * @Project: leetcode
 * @Package: Problems
 * @Description:
 * @Author: Wang Haichao
 * @CreateTime: 2020/5/19 17:38
 **/
public class Problem0061 {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return null;
        ListNode cur = head;
        ListNode pre = head;
        int size = 0;
        while(cur != null){
            size++;
            pre = cur;
            cur = cur.next;
        }
        pre.next = head;

        int step = k%size;
        cur = head;
        while(size - step != 0){
            pre = cur;
            cur = cur.next;
            step++;
        }
        pre.next = null;
        return cur;
    }
}
