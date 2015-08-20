package org.sopt.study.data.structure.fundamental.base;

public abstract class Collection<T> {

    protected int size;
    public int size() { return size; }

    public abstract Node<T> get(int index);
}
