package ru.otus.java.oop.incapsulation;

public class Box {
    double width;
    double height;
    double depth;

    public Box() {

    }

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double volume() {
        // this -- ссылка на текущий экземпляр,
        // указывать необязательно,
        // но иногда без this никак - см. конструктор
        double volume = this.width * height * depth;
        return volume; // возврат значения из метода
    }
}
