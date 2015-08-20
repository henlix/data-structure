package org.sopt.study.data.structure.fundamental.impl;

import org.sopt.study.data.structure.fundamental.base.Collection;
import org.sopt.study.data.structure.fundamental.base.Node;

public class LinkedList<T> extends Collection<T> {

    private Node<T> header = new Node<T>();

    public void add(Node<T> node) {

        Node pointer = header;

        while (pointer.next != null)
            pointer = pointer.next;

        pointer.next = node;
        size++;
    }

    public void insert(int index, Node<T> node) {

        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();

        int count = 0;

        Node pointer = header;

        while (pointer.next != null) {

            if (count++ == index)
                break;

            pointer = pointer.next;
        }

        node.next = pointer.next;
        pointer.next = node;

        size++;
    }

    public int indexOf(Node<T> node) {

        int index = 0;

        Node pointer = header;

        while (pointer.next != null) {

            pointer = pointer.next;

            if (pointer.equals(node))
                return index;

            index++;
        }

        return -1;
    }

    public Node<T> remove(int index) {

        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();

        int count = 0;
        Node pointer = header;

        while (count++ < index)
            pointer = pointer.next;

        Node<T> temp = pointer.next;
        pointer.next = pointer.next.next;

        size--;
        return temp;
    }

    @Override
    public Node<T> get(int index) {

        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();

        int count = 0;
        Node<T> pointer = header.next;

        while (count++ < index)
            pointer = pointer.next;

        return pointer;
    }
}
