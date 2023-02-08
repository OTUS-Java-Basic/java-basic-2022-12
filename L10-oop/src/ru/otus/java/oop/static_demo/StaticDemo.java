package ru.otus.java.oop.static_demo;

public class StaticDemo {
    public static void main(String[] args) {

        System.out.println("1 Counter.count = " + Counter.count);
        System.out.println("2 Counter.getCount() = " + Counter.getCount());

        Counter counter1 = new Counter();
        counter1.name = "counter1";
        counter1.increaseCount();
        System.out.println("3 Counter.count = " + Counter.count);

        Counter counter2 = new Counter();
        counter2.name = "counter2";
        counter2.increaseCount();
        System.out.println("4 Counter.getCount() = " + Counter.getCount());

        Counter counter3 = new Counter();
        counter3.name = "counter3";
        counter3.increaseCount();
        System.out.println("5 Counter.getCount() = " + Counter.getCount());


    }

}