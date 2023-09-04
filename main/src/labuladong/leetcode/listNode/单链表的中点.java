package labuladong.leetcode.listNode;

public class 单链表的中点 {
    ListNode middleNode(ListNode head) {
        ListNode show = head;
        ListNode quick = head;
        while (quick != null && quick.next != null) {
            show = show.next;
            quick = quick.next;
            quick = quick.next;
        }

        return show;
    }
}
