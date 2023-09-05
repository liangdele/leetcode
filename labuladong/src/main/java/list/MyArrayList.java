package list;

public class MyArrayList<E> {
    private E[] data;
    private int size;

    /**
     * 添加元素
     */
    public void addLast(E e) {
        //判断是否需要扩容
        if (data.length == size) {
            resize(2 * data.length);
        }
        data[size] = e;
        size++;
    }

    /**
     * 移除最后一个元素
     */
    public void removeLast() {
        if (size == 0) {
            return;
        }
        data[size - 1] = null;
        size--;
    }


    /**
     * 判断是否需要扩容
     */
    private void resize(int capacity) {
        //扩容
        E[] temp = (E[]) new Object[capacity];
        System.arraycopy(data, 0, temp, 0, size);
        data = temp;
    }
}
