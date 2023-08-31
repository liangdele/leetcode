package labuladong.leetcode;

public class 判断链表是否包含环的起点 {
    public ListNode detectCycle(ListNode head) {
        ListNode show, quick;
        show = head;
        quick = head;
        while (quick != null && quick.next != null) {
            show = show.next;
            quick = quick.next.next;
            if (show == quick) {
                break;
            }
        }
        if (quick == null || quick.next == null) {
            return null;
        }
        show = head;
        while (show != quick) {
            quick = quick.next;
            show = show.next;
        }
        return show;
    }
}
