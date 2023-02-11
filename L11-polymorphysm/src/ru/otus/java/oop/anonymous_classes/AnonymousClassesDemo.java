package ru.otus.java.oop.anonymous_classes;

import ru.otus.java.oop.polymorphism.Animal;
import ru.otus.java.oop.polymorphism.Cat;
import ru.otus.java.oop.polymorphism.Guarding;

public class AnonymousClassesDemo {

    public static void main(String[] args) {
        // Так нельзя:
        // Animal animal = new Animal()

        Animal monkey = new Animal() {
            @Override
            public void speak() {
                System.out.println("Я обезьяна");
            }
        };

        monkey.speak();
        System.out.println(monkey);

        // для сравнения - класс Cat
        System.out.println(new Cat());

        // Можно создать класс сразу при вызове метода
        doSomething(new Guarding() {
            @Override
            public void guard() {
                System.out.println("Я анонимный класс");
            }
        });

        // можно поля определять и дополнительные методы
        Animal fish = new Animal() {
            private int weight = 10;

            @Override
            public void speak() {
                System.out.println("Рыба, вес = " + this.weight);
            }
        };
        fish.speak();
    }

    private static void doSomething(Guarding guarding){
        guarding.guard();
    }

}
