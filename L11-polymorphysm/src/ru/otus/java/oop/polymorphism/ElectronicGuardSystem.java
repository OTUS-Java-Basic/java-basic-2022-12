package ru.otus.java.oop.polymorphism;

public class ElectronicGuardSystem implements Guarding {
    private String manufacturer;
    private String model;

    @Override
    public void guard() {
        System.out.println("Сигнализация включена...");
    }
}
