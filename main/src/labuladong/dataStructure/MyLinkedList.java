package labuladong.dataStructure;

import java.util.LinkedList;

/**
 * @ClassName : MyLinkedList  //类名
 * @Description :   //描述
 * @Author : liangdele //作者
 * @Date: 2023/8/25  下午 05:10
 */

public class MyLinkedList<E> {
    private final Node<E> head;//虚拟头节点
    private final Node<E> tail;//虚拟尾结点
    private int size;

    public MyLinkedList() {
        this.head = new Node<E>(null);
        this.tail = new Node<E>(null);
        size = 0;
    }

    public void addFirst(Node<E> element) {
        Node<E> temp = head.next;
        head.next = element;
        element.pre = head;
        element.next = temp;
        size++;
    }

    public void addLast(Node<E> element) {
        Node<E> temp = tail.pre;
        tail.pre = element;
        element.next = tail;
        element.pre = temp;
        size++;
    }

    public void add(int index, Node<E> element) {
        Node<E> node = getNode(index);
        Node<E> preNode = node.pre;

        preNode.next = element;
        node.pre = element;

        element.pre = preNode;
        element.next = node;
        size++;

    }



    private Node<E> getNode(int index) {
        Node<E> p = head.next;
        for (int i = 0; i < index; i++) {
            p = p.next;
        }
        return p;
    }


    private static class Node<E> {
        E val;
        Node<E> next;
        Node<E> pre;

        public Node(E val) {
            this.val = val;
        }
    }


}
