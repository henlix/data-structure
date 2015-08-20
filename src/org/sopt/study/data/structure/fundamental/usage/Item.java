package org.sopt.study.data.structure.fundamental.usage;

public class Item {

    private static long ID_COUNTER = 1;

    public long id = ID_COUNTER++;
    public String name;

    public Item(String name) { this.name = name; }

    @Override
    public String toString() { return "ID: " + id + " | Name: " + name; }
}
