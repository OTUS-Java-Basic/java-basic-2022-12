package ru.otus.java.oop.static_demo;

public class Counter {
    String name;
    static int count;
    final static int MAX = 10;

    static {
        count = 10;
    }

    public void increaseCount() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}
