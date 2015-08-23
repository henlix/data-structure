package org.sopt.study.data.structure.fundamental.usage;

import org.sopt.study.data.structure.fundamental.base.Collection;
import org.sopt.study.data.structure.fundamental.base.Node;

import org.sopt.study.data.structure.fundamental.impl.CircularQueue;
import org.sopt.study.data.structure.fundamental.impl.LinkedList;
import org.sopt.study.data.structure.fundamental.impl.Queue;
import org.sopt.study.data.structure.fundamental.impl.Stack;

public class Program {

    public static void main(String[] args) {

        /*

        LinkedList<Item> list = new LinkedList<Item>();


        list.add(new Node<Item>(new Item("Hi")));
        list.add(new Node<Item>(new Item("Hello")));
        list.add(new Node<Item>(new Item("Nice to meet you")));
        printAll(list);


        list.insert(1, new Node<Item>(new Item("XXX")));
        printAll(list);


        Node<Item> removed = list.remove(0);
        printAll(list);
        System.out.println("=============================================");
        System.out.println("Removed : " + removed.t);


        list.add(removed);
        printAll(list);
        System.out.println("Index of removed node : " + list.indexOf(removed));


        Stack<Item> stack = new Stack<Item>();

        stack.push(new Node<Item>(new Item("This")));
        stack.push(new Node<Item>(new Item("Is")));
        stack.push(new Node<Item>(new Item("Stack")));

        printAll(stack);

        Node<Item> popped = stack.pop();
        printAll(stack);
        System.out.println("=============================================");
        System.out.println("Popped : " + popped.t);


        Queue<Item> queue = new Queue<Item>();

        queue.enqueue(new Node<Item>(new Item("This")));
        queue.enqueue(new Node<Item>(new Item("Is")));
        queue.enqueue(new Node<Item>(new Item("Queue")));

        printAll(queue);

        Node<Item> dequeue = queue.dequeue();
        printAll(queue);
        System.out.println("=============================================");
        System.out.println("Dequeue : " + dequeue.t);

        */

        // ¿±πÃ »Æ¿Œ.
        CircularQueue<Item> cQueue = new CircularQueue<Item>(Item.class, 5);

        cQueue.enqueue(new Item("Hello"));
        cQueue.enqueue(new Item("Circular"));
        cQueue.enqueue(new Item("Queue"));

        printAll(cQueue);

        cQueue.enqueue(new Item("Size"));
        cQueue.enqueue(new Item("Overflow ?"));
        cQueue.enqueue(new Item("NO WAY"));

        printAll(cQueue);

        Item dequeue = cQueue.dequeue();

        System.out.println("=============================================");
        System.out.println("Dequeue : " + dequeue);

        while (!cQueue.isEmpty()) {

            Item item = cQueue.dequeue();
            System.out.println("Size : " + cQueue.size() + " >> " + item);
        }

        printAll(cQueue);
    }

    private static void printAll(CircularQueue<Item> items) {

        System.out.println("=============================================");

        for (int i = 0; i < items.size(); i++) {

            Item item = items.get(i);
            System.out.println(item);
        }
    }

    private static void printAll(Collection<Item> items) {

        System.out.println("=============================================");

        for (int i = 0; i < items.size(); i++) {

            Node<Item> item = items.get(i);
            System.out.println(item.t);
        }
    }
}
