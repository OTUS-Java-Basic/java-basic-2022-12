package ru.otus.java.oop.polymorphism;

public class AnimalFactory {
    public static Animal createAnimal(){
        return new Dog("Феня");
    }
}
