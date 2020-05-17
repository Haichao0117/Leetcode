package Problems;

/**
 * @Project: leetcode
 * @Package: Problems
 * @Description: Given a singly linked list, group all odd nodes together followed by the even nodes. Please note here we are talking about the node number and not the value in the nodes.
 *              You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.
 * @Author: Wang Haichao
 * @CreateTime: 2020/5/17 15:46
 **/
public class Problem0328 {
    public ListNode oddEvenList(ListNode head) {
        ListNode odd = head;
        ListNode odd_end = head;
        if(odd == null) return head;
        ListNode even = head.next;
        ListNode even_end = head.next;
        if(even == null) return head;
        while(even_end != null && even_end.next != null){
            odd_end.next = even_end.next;
            even_end.next = even_end.next.next;
            odd_end = odd_end.next;
            even_end = even_end.next;
        }

        odd_end.next = even;
        return head;
    }
}
