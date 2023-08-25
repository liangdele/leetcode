package labuladong.dataStructure;

/**
 * @ClassName : MyLinkedList  //类名
 * @Description :   //描述
 * @Author : liangdele //作者
 * @Date: 2023/8/25  下午 05:10
 */

public class MyLinkedList<E> {
    private Node head;//头节点
    private int size;

    public void addLast(Node data) {
        size++;
        Node headCopy = head;
        while (headCopy.next!=null) {
            headCopy = headCopy.next;
        }
        headCopy.next = data;
    }


    private class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

}
