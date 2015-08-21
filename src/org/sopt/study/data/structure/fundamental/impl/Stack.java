package org.sopt.study.data.structure.fundamental.impl;

import org.sopt.study.data.structure.fundamental.base.Collection;
import org.sopt.study.data.structure.fundamental.base.Node;

public class Stack<T> extends Collection<T> {

    private LinkedList<T> list = new LinkedList<T>();

    public void push(Node<T> node) {

        list.add(node);
        size++;
    }

    public Node<T> pop() {

        if (size == 0)
            return null;

        return list.remove(--size);
    }

    @Override
    public Node<T> get(int index) { return list.get(index); }
}
