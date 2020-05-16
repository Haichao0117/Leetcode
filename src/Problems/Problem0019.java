package Problems;

/**
 * @Project: leetcode
 * @Package: Problems
 * @Description: Given a linked list, remove the n-th node from the end of list and return its head.
 * @Author: Wang Haichao
 * @CreateTime: 2020/5/16 20:11
 **/
public class Problem0019 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //return version1(head, n);
        return version2(head, n);
    }

    /**
    * @Description: 双指针，一次遍历的方法
    * @Param: [head, n]
    * @return: Problems.ListNode
    * @Author: Wang Haichao
    * @CreateTime: 2020/5/16 21:09
    * @Version: version2.0
    **/
    private ListNode version2(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode first = head;
        for(int i = 0; i < n; i++){
            first = first.next;
        }
        if(first == null){
            dummy.next = dummy.next.next;
            return dummy.next;
        }
        ListNode second = head;
        while(first.next != null){
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }

    /**
    * @Description: 比较直观的方法，但是没能一趟扫描实现
    * @Param: [head, n]
    * @return: Problems.ListNode
    * @Author: Wang Haichao
    * @CreateTime: 2020/5/16 20:51
    * @Version: version1.0
    **/
    private ListNode version1(ListNode head, int n) {
        if (head == null) return null;
        int size = 0;
        ListNode cur = head;
        while(cur != null){
            cur = cur.next;
            size++;
        }
        int index = size - n;
        if(index == 0) {
            head = head.next;
            return head;
        }
        cur = head;
        for(int i = 0; i < index-1; i++){
            cur = cur.next;
        }
        cur.next = cur.next.next;
        return head;
    }
}
