package ru.otus.java.oop.overload;

// Перегрузка методов
public class Overload {
    void test() {
        System.out.println("Без параметров");
    }

    void test(int a) {
        System.out.println("Один параметр int: " + a);
    }

    void test(long a) {
        System.out.println("Один параметр long: " + a);
    }

    void test(double a) {
        System.out.println("Один параметр double: " + a);
    }

    int test(int a, int b) {
        System.out.println("Два параметра int: " + a + " " + b);
        return a + b;
    }

    double test(double a, double b) {
        System.out.println("Два параметра double: " + a + " " + b);
        return a + b;
    }
}
