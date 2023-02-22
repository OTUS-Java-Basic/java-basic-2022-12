package ru.otus.java.example04.task;

import java.util.*;

public class Example04 {
    public static void main(String[] args) {
        // У программиста была задача создать коллекцию
        // с уникальными объектами Person
        // Также в постановке задачи было указано,
        // что будет выполняться частая операция contains

        LinkedList<Person> people = new LinkedList<>();

        fillList(people);

        System.out.print("Contains person2: ");
        System.out.println(people.contains(new Person("person2")));

        // Все ли работает правильно?
        // Как улучшить, исправить?

        print(people);
    }

    private static void fillList(LinkedList<Person> personsUniqueList) {
        Person person1 = new Person("person1");
        personsUniqueList.add(person1);
        personsUniqueList.add(person1);
        Person person2 = new Person("person2");
        personsUniqueList.add(person2);
    }

    private static void print(LinkedList<Person> persons) {
        for(Person person : persons){
            System.out.println(person.name);
        }
    }
}