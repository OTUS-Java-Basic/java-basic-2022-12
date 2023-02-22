package ru.otus.java.example01.task;

public class Example01 {
    public static void main(String[] args) {
        Customer customer = new Customer(
                CustomerType.CORPORATE,
                "ABC corporation",
                "John",
                "123-45-67",
                null);

        var discount = customer.getDiscount();
        System.out.println(discount);

        Customer ivanov = new Customer(
                CustomerType.PERSONAL,
                "Ivanov",
                null,
                null,
                "4257932619875103");

        var discountIvanov = ivanov.getDiscount();
        System.out.println(discountIvanov);
    }
}

