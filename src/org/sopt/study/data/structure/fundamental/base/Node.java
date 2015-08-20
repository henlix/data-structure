package org.sopt.study.data.structure.fundamental.base;

public class Node<T> {

    public Node next;
    public T t;

    public Node() {}
    public Node(T t) { this.t = t; }
}
