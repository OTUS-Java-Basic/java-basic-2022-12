package ru.otus.java.oop.lambdas;

import java.util.function.BiFunction;

public class Multiplication
        implements BiFunction<Integer, Integer, Integer> {
    @Override
    public Integer apply(Integer x, Integer y) {
        return x * y;
    }
}
