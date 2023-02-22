package ru.otus.java.example02.task;

import java.util.HashMap;
import java.util.Map;

// Что делает программа?
// Какой будет вывод?
// Не обращать внимание на прямое обращение к полям.
// Здесь ошибка, изменять структуру классов не надо.
public class Example02 {
    public static void main(String[] args) {
        Map<Person, Address> personAddresses = getPersonAddresses();

        Person petrov = new Person("Петров");
        Address petrovAddress = personAddresses.get(petrov);
        System.out.println(petrovAddress.city);
        System.out.println(petrovAddress.building);
        System.out.println(petrovAddress.street);
    }

    private static Map<Person, Address> getPersonAddresses() {
        Person person1 = new Person("Иванов");
        Person person2 = new Person("Петров");
        Person person3 = new Person("Сидоров");

        Map<Person, Address> personAddresses = new HashMap<>();
        personAddresses.put(person1, new Address("Москва", "Садовая", null));
        personAddresses.put(person2, new Address("Санкт-Петербург", "Вишневая", "123"));
        personAddresses.put(person3, new Address("Москва", "Абрикосовая", "55"));
        return personAddresses;
    }
}