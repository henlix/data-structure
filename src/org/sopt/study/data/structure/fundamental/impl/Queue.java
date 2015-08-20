package org.sopt.study.data.structure.fundamental.impl;

import org.sopt.study.data.structure.fundamental.base.Collection;
import org.sopt.study.data.structure.fundamental.base.Node;

public class Queue<T> extends Collection<T> {

    private LinkedList<T> list = new LinkedList<T>();

    public void enqueue(Node<T> node) {

        list.add(node);
        size++;
    }

    public Node<T> dequeue() {

        if (size == 0)
            return null;

        Node<T> node = list.remove(0);
        size--;

        return node;
    }

    @Override
    public Node<T> get(int index) { return list.get(index); }
}
