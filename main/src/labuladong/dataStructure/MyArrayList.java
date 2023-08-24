package labuladong.dataStructure;

/**
 * @ClassName : MyArrayList  //类名
 * @Description : 自实现数组  //描述
 * @Author : liangdele //作者
 * @Date: 2023/8/24  上午 11:47
 */

public class MyArrayList<E> {
    private E[] data;
    private int size;

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
        if (index < 0 || index > size) {
            throw new Exception("边界溢出");
        }

        if (index == data.length) {
            resize(data.length * 2);
        }

        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = e;
        size++;
    }

    /**
     * 删除最后一个元素
     */
    public void removeLast() {
        if (size == 0) {
            return;
        }
        data[size] = null;
        size--;
    }

    /**
     * 删除指定位置元素
     */
    public void remove(int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("边界溢出");
        }
        for (int i = index; i < size; i++) {
            data[i]=data[i+1];
        }
        size--;
    }

    /**
     * 扩容
     */
    private void resize(int capacity) {
        E[] newData = (E[]) new Object[capacity];
        System.arraycopy(data, 0, newData, 0, data.length);
        data = newData;
    }
}
