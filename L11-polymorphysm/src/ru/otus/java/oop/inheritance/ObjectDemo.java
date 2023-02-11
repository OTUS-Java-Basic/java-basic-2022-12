package ru.otus.java.oop.inheritance;

public class ObjectDemo {
    public static void main(String[] args) {
        Person ivanov1 = new Person("Иванов");

        // Неявно вызывается toString()
        System.out.println(ivanov1);
        // Эквивалентно следующему:
        System.out.println(ivanov1.toString());
        // Можем переопределить метод в наследнике

        Person ivanov2 = new Person("Иванов");
        // == сравнение по равенству ссылок
        System.out.println("ivanov1 == ivanov -> " + (ivanov1 == ivanov2));
        // В Object есть метод equals
        System.out.println("ivanov1 == ivanov -> " + (ivanov1.equals(ivanov2)));
        // Ссылочные типы, в том числе строки (String) сравнивайте через equals()
    }
}
