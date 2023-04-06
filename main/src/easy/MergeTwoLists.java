package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 21. 合并两个有序链表
 */
public class MergeTwoLists {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        final ListNode list1 = new ListNode();
        list1.val = 1;
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        final ListNode list2 = new ListNode();
        list2.val = 1;
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);
        System.out.println( mergeTwoLists(list1, list2));
    }

    static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {

            return list2;
        } else if (list2 == null) {
            return list1;
        } else if (list1.val < list2.val) {
            return mergeTwoLists(list1.next, list2);
        } else {
            return mergeTwoLists(list2, list2.next);
        }
    }
}
