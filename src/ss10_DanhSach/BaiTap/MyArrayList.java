package ss10_DanhSach.BaiTap;

import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayList {
    public Object add;
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    Object elements[];

    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];

    }

    public MyArrayList(int capacity) throws IllegalAccessException {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalAccessException("capacity :" + capacity);
        }
    }

    int size() {
        return this.size;
    }

    private void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

    <E> boolean add(E element) throws IllegalAccessException {
        if (elements.length == size) {
            this.ensureCapacity(5);
        }
        elements[size] = element;
        size++;
        return true;
    }

    private <E> void add(E element, int index) throws IllegalAccessException {
        if (index > elements.length) {
            throw new IllegalAccessException(" index :" + index);
        } else if (elements.length == size) {
            this.ensureCapacity(5);
        } else {
            for (int i = size + 1; i <= index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            size++;
        }
    }

    private void ensureCapacity(int minCapacity) throws IllegalAccessException {
        if (minCapacity >= 0) {
            int newSize = this.elements.length + minCapacity;
          elements= Arrays.copyOf(elements,newSize);
        }else {
            throw new IllegalAccessException(" minCapacity :"+minCapacity);
        }
    }
}

