package ru.otus.java.oop.polymorphism;

public abstract class Animal {
    private String name;

    public abstract void speak();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
