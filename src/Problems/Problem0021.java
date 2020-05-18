package Problems;

/**
 * @Project: leetcode
 * @Package: Problems
 * @Description: Merge two sorted linked lists and return it as a new list. 
 *              The new list should be made by splicing together the nodes of the first two lists.
 * @Author: Wang Haichao
 * @CreateTime: 2020/5/18 16:14
 **/
public class Problem0021 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //return version1(l1, l2);
        return version2(l1, l2);
    }

    /**
    * @Description: 迭代方式
    * @Param: [l1, l2]
    * @return: Problems.ListNode
    * @Author: Wang Haichao
    * @CreateTime: 2020/5/18 18:39
    * @Version: version1.0
    **/
    private ListNode version2(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        head.next = l1.val<l2.val? l1:l2;
        ListNode cur = head;
        while(l1 != null && l2 != null){
            if(l1.val<l2.val){
                cur.next = l1;
                l1 = l1.next;
            }else{
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        cur.next = l1 == null? l2:l1;
        return head.next;
    }

    /**
    * @Description: 递归方式
    * @Param: [l1, l2]
    * @return: Problems.ListNode
    * @Author: Wang Haichao
    * @CreateTime: 2020/5/18 16:16
    * @Version: version1.0
    **/
    private ListNode version1(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        if(l1.val < l2.val){
            l1.next = mergeTwoLists(l1.next,l2);
            return l1;
        }else{
            l2.next = mergeTwoLists(l1,l2.next);
            return l2;
        }
    }
}
