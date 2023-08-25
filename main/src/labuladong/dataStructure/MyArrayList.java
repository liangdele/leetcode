package labuladong.dataStructure;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * @ClassName : MyArrayList  //类名
 * @Description : 自实现数组  //描述
 * @Author : liangdele //作者
 * @Date: 2023/8/24  上午 11:47
 */

public class MyArrayList<E> implements Iterable<E> {
    private E[] data;
    private int size;
    private final static int INIT_CAP = 1;

    public MyArrayList() {
    }

    public MyArrayList(int initCap) {
        data = (E[]) new Object[initCap];
        size = 0;
    }

    /**
     * 在最后一位添加元素
     */
    public void addLast(E e) {
        if (data.length == size) {
            //扩容
            resize(data.length * 2);
        }
        data[size] = e;
        size++;
    }

    /**
     * 在指定位置添加一个元素
     */
    public void add(int index, E e) throws Exception {
        checkPositionIndex(index);

        if (index == data.length) {
            resize(data.length * 2);
        }

        System.arraycopy(data, index, data, index + 1, size - index);
        data[index] = e;
        size++;
    }

    private void checkPositionIndex(int index) throws Exception {
        if (!isPositionIndex(index)) {
            throw new Exception("边界溢出");
        }
    }

    private void checkIsElementIndexIndex(int index) throws Exception {
        if (!isElementIndex(index)) {
            throw new Exception("边界溢出");
        }
    }

    private boolean isPositionIndex(int index) {
        return index >= 0 && index <= size;
    }

    private boolean isElementIndex(int index) {
        return index >= 0 && index < size;
    }

    /**
     * 删除最后一个元素
     */
    public E removeLast() {
        if (isEmpty()) {
            return null;
        }

        if (size == data.length / 4) {
            resize(data.length / 4);
        }

        E lastElement = data[size - 1];
        data[size - 1] = null;
        size--;
        return lastElement;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    /**
     * 删除指定位置元素
     */
    public E remove(int index) throws Exception {
        checkIsElementIndexIndex(index);

        if (size == data.length / 4) {
            resize(data.length / 4);
        }

        E element = data[index];
        System.arraycopy(data, index + 1, data, index, size - index - 1);
        data[size - 1] = null;
        size--;
        return element;
    }

    public E get(int index) throws Exception {
        checkIsElementIndexIndex(index);
        return data[index];
    }

    /**
     * 扩容
     */
    private void resize(int capacity) {
        E[] newData = (E[]) new Object[capacity];
        System.arraycopy(data, 0, newData, 0, data.length);
        data = newData;
    }

    @Override
    public Iterator<E> iterator() {
        return new MyArrayListIterator();
    }

    private class MyArrayListIterator implements Iterator<E> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public E next() {
            if (!hasNext()) {
                return null;
            }
            return data[index++];
        }
    }
}
