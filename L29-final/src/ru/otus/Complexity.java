package ru.otus;


import java.util.Arrays;

public class Complexity {

    public static void main(String[] args) {
        // Задача -- дан массив, хотим узнать есть ли заданное число в массиве
        int[] numbers = new int[]{3, 4, 6, 1, 8, 9};

        // Первый вариант решения - простой перебор (самодельный)
        boolean idx3 = isExistsFirst(numbers, 3);
        boolean idx19 = isExistsFirst(numbers, 19);

        System.out.println("1 idx3:" + idx3);
        System.out.println("1 idx19:" + idx19);
        System.out.println();

        // Второй вариант - используем возможности JDK
        idx3 = isExistsSecond(Arrays.copyOf(numbers, numbers.length), 3);
        idx19 = isExistsSecond(Arrays.copyOf(numbers, numbers.length), 19);

        System.out.println("2 idx3:" + idx3);
        System.out.println("2 idx9:" + idx19);
    }

    /**
     * Проверка существования элемента в массиве.
     * Самый простой способ - итерация по всем элементам.
     */
    private static boolean isExistsFirst(int[] numbersArray, int number) {
        // Какая сложность этого алгоритма в терминах "О-большое"?
        for (int i : numbersArray) {
            if (number == i) {
                return true;
            }
        }
        return false;
    }

    /**
     * Проверка существования элемента в массиве.
     * Используем возможности JDK.
     */
    private static boolean isExistsSecond(int[] numbersArray, int number) {
        // Какая сложность этого алгоритма в терминах "О-большое"?
        Arrays.sort(numbersArray); // Сложность? Как узнать, используемый алгоритм?
        return Arrays.binarySearch(numbersArray, number) >= 0;  // Сложность?
    }
}
