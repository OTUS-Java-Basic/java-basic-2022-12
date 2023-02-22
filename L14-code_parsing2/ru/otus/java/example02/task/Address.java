package ru.otus.java.example02.task;

public class Address {
    public String city;     // Поля специально public
    public String street;   // чтобы сократить код
    public String building; // на это не обращаем внимания

    public Address(String city, String street, String building) {
        this.city = city;
        this.street = street;
        this.building = building;
    }
}
