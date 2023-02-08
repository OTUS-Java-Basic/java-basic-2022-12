package ru.otus.java.oop.constructors;

public class Box {
    double width;
    double height;
    double depth;
    String name;

    // Конструктор - используется для инициализации объекта
    // Можно явно не объявлять - тогда будет только конструктор по умолчанию без параметров
    public Box() {

    }

    public Box(double width, double height, double depth) {
        // this -- ссылка на текущий экземпляр
        // (на самого себя)
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double volume() {
        // this -- ссылка на текущий экземпляр,
        // указывать необязательно,
        // но иногда без this никак - см. пример конструктора
        double volume = this.width * height * depth;
        return volume; // возврат значения из метода
    }
}
