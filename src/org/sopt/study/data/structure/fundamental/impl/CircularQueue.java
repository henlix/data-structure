package org.sopt.study.data.structure.fundamental.impl;

import org.sopt.study.data.structure.fundamental.base.Node;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CircularQueue<T> {

    private int size;
    private int capacity;

    private int front;
    private int rear;

    private Class<T> c;
    private T[] array;

    /**
     *
     * 주어진 크기의 큐를 생성합니다.
     *
     * @param c 큐에 저장할 노드의 타입을 의미합니다.
     * @param capacity 큐의 전체 크기를 의미하며, 순환 큐 구현을 위해 주어진 크기보다 1 큰 공간을 할당합니다. (cf. size는 컨텐츠의 갯수를 의미합니다.)
     *
     */
    public CircularQueue (Class<T> c, int capacity) {

        this.c = c;
        this.capacity = capacity;
        this.array = (T []) Array.newInstance(c, capacity);
    }

    public void enqueue(T t) {

        if ((rear + 1) % capacity == front) {

            T[] newArray = (T []) Array.newInstance(c, 2 * capacity);

            int start = (front + 1) % capacity;

            if (start < 2) {

                System.arraycopy(array, start, newArray, 0, rear - start + 1);
            }
            else {

                System.arraycopy(array, start, newArray, capacity, capacity);
                System.arraycopy(array, 0, newArray, capacity - start, rear + 1);
            }

            front = 2 * capacity - 1;
            rear = capacity - 2;

            capacity *= 2;
            array = newArray;
        }

        rear = (rear + 1) % capacity;
        array[rear] = t;
    }

    public T dequeue() {

        front = (front + 1) % capacity;
        return array[front];
    }

    public T get(int index) {

        return array[(front + 1 + index) % capacity];
    }

    public int size() {

        return Math.abs(rear - (front + 1) % capacity + 1);
    }

    public boolean isEmpty() { return front == rear; }
}
