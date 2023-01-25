package ru.otus.java.demo;

import java.util.Scanner;

// Простейший калькулятор
public class Calculator {
    public static void main(String[] args) {
        System.out.println("Введите два числа и операцию (+ или -) через пробел (например, 3 + 7):");

        // Пример как считать ввод пользователя
        // не забудьте - import java.util.Scanner;
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        char operation = scanner.next().charAt(0);
        int b = scanner.nextInt();
        // Подробнее про Scanner - https://vertex-academy.com/tutorials/ru/rabota-so-skannerom-v-java/

        int result = 0;
        // Логика калькулятора
        switch (operation) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            default:
                System.out.println("Неизвестная операция " + operation);
                break;
        }

        System.out.println(a + " " + operation + " " + b + " = " + result);
    }
}









/*

Эквивалент switch:

if (operation == '+') {
    result = a + b;
} else if (operation == '-') {
    result = a - b;
} else {
    System.out.println("Неизвестная операция");
}


 */