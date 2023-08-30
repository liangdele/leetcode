package labuladong.leetcode;

public class 单链表的倒数第K个节点 {
    public ListNode findFromEnd(ListNode head, int k) {
        ListNode p1 = head;
        int n = 0;
        while (n < k) {
            p1 = p1.next;
            n++;
        }
        ListNode p2 = head;
        while (p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }

        return p2;
    }
}
