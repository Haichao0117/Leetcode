package Problems;

/**
 * @Project: leetcode
 * @Package: Problems
 * @Description: Write a program to find the node at which the intersection of two singly linked lists begins.
 * @Author: Wang Haichao
 * @CreateTime: 2020/5/16 19:34
 **/
public class Problem0160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        return version1(headA, headB);
    }

    /**
    * @Description: 可以用暴力法（遍历找交点，时间复杂度O(mn)）跟哈希表（空间复杂度O(m)orO(n)），比较简单，不多赘述
    * @Param: [headA, headB]
    * @return: Problems.ListNode
    * @Author: Wang Haichao
    * @CreateTime: 2020/5/16 20:26
    * @Version: version1.0
    **/
    private ListNode version1(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        ListNode ptrA = headA;
        ListNode ptrB = headB;
        while(ptrA != ptrB){                        //若有焦点，则焦点处相遇；否则，在null处相遇。
            ptrA = ptrA == null ? headB : ptrA.next;
            ptrB = ptrB == null ? headA : ptrB.next;
        }
        return ptrA;
    }
}
