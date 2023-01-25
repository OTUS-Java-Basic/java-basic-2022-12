package ru.otus.java.demo.slides;

public class SwitchExpression {
    public static void main(String[] args) {
        int operation = '-';
        int a = 5;
        int b = 3;

        oldSwitch(operation, a, b);
        newSwitch(operation, a, b);
    }

    /**
     *  Старый switch
     */
    private static void oldSwitch(int operation, int a, int b) {
        int result = 0;
        switch (operation) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            default:
                System.out.println("Неизвестная операция");
                break;
        }

        System.out.println(result);
    }

    /**
     *  Новый switch (с Java 12)
     */
    private static void newSwitch(int operation, int a, int b) {
        int result = switch(operation) {
            case '+' -> a + b;
            case '-' -> a - b;
            default -> throw new IllegalArgumentException("Неизвестная операция");
        };

        System.out.println(result);
    }

}
