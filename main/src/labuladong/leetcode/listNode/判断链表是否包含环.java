package labuladong.leetcode.listNode;

public class 判断链表是否包含环 {
    boolean hasCycle(ListNode head) {
        boolean hasCycle = false;
        ListNode show = head;
        ListNode quick = head;
        while (quick != null && quick.next != null) {
            show = show.next;
            quick = quick.next.next;
            if (quick == show) {
                hasCycle = true;
                break;
            }
        }
        return hasCycle;
    }
}
