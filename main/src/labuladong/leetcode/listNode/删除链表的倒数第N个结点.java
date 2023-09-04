package labuladong.leetcode.listNode;

public class 删除链表的倒数第N个结点 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode fromEnd = findFromEnd(dummy, n + 1);
        fromEnd.next = fromEnd.next.next;
        return dummy.next;
    }

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
