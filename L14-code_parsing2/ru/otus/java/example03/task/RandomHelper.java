package ru.otus.java.example03.task;

import java.util.Random;

public class RandomHelper {
    private static Random random = new Random();

    public static int generateAccountId() {
        return random.nextInt(100);
    }

    public static long generateBalance() {
        return random.nextInt(9999);
    }
}
