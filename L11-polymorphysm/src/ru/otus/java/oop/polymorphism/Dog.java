package ru.otus.java.oop.polymorphism;

public class Dog extends Animal implements Guarding {
    public Dog(String name) {
        setName(name);

        // Можно написать более явно:
        // super.setName(name);
        // super - ссылка на базовый класс
    }

    @Override
    public void speak() {
        System.out.println("Гав-гав!");
    }

    @Override
    public void guard() {
        System.out.println("Охраняю...");
    }
}
