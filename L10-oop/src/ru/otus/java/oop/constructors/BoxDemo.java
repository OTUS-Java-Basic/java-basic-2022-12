package ru.otus.java.oop.constructors;

public class BoxDemo {
    public static void main(String[] args) {
        // Создание экземпляра (объекта)
        Box box1 = new Box();
        // При вызове оператора new вызывается "конструктор"
        // "конструктор" - специальный метод, название которого совпадает с именем класса
        // Если конструктор явно не задавать,
        // то в классе есть конструктор по умолчанию без параметров

        System.out.println(box1);
        // Значения всех полей равны нулю (значение по умолчанию)
        System.out.printf(
                "width = %f, height = %f, depth = %f, name = %s\n",
                box1.width, box1.height, box1.depth, box1.name);
        System.out.println("volume() = " + box1.volume());

        // Но локальным переменным значения по умолчанию не присваиваются
        // их надо явно инициализировать
        int localWidth;
//        System.out.println(localWidth);

        // null - значит, что по ссылке нет никакого значения
        Box box10 = null;
        // if (box10 == null)
        System.out.println(box10);

        System.out.println("=== Зададим значения через поля");
        box1.width = 1;
        box1.height = 2;
        box1.depth = 3;

        System.out.printf(
                "width = %f, height = %f, depth = %f\n",
                box1.width, box1.height, box1.depth);
        System.out.println("volume() = " + box1.volume());

        System.out.println("=== Значения через конструктор");
        Box box2 = new Box(2, 4, 8);
        System.out.println(box2);
        System.out.printf(
                "width = %f, height = %f, depth = %f\n",
                box2.width, box2.height, box2.depth);
        System.out.println("volume() = " + box2.volume());

        // См. слайд про ссылки

        // Ссылки
        System.out.println("=== Ссылки");
        Box box3 = box2;
        System.out.println("box1 - " + box1);
        System.out.println("box2 - " + box2);
        System.out.println("box3 - " + box3);

        // Изменяем box3, выводим box2 - видим изменения
        System.out.printf(
                "width = %f, height = %f, depth = %f\n",
                box2.width, box2.height, box2.depth);
        box3.width = 1;
        box3.height = 1;
        box3.depth = 1;
        System.out.printf(
                "width = %f, height = %f, depth = %f\n",
                box2.width, box2.height, box2.depth);

        // Объекты передаются в методы "по ссылке"
        // (на самом деле "по значению ссылки")
        System.out.println("=== Передача объекта в методы");
        System.out.println("volume() = " + box1.volume());
        printBox(box1);
        System.out.println();
        System.out.println("After printBox(box1)");
        System.out.println("Box.width  = " + box1.width);
        System.out.println("Box.height = " + box1.height);
        System.out.println("Box.depth  = " + box1.depth);
        System.out.println("volume() = " + box1.volume());
    }

    private static void printBox(Box box) {
        System.out.println("--- printBox()");
        System.out.println("Box.width  = " + box.width);
        System.out.println("Box.height = " + box.height);
        System.out.println("Box.depth  = " + box.depth);

        box.depth = 1000; // зачем-то влезли во "внешний" объект и испортили его
        box = new Box(22,22,22); // изменение копии ссылки, на код снаружи метода не повлияет
    }
}
