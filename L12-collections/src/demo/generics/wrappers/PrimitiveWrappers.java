package demo.generics.wrappers;

import demo.generics.generics.Tuple;

// Обертки примитивов
public class PrimitiveWrappers {
    public static void main(String[] args) {
        //Так работает
        Tuple<String, Integer> tuple2 = new Tuple<>("abc", 100);

        //Так нет:
//        Tuple<String, int> tuple2 = new Tuple<>("abc", 100);

        // Можем создать как и любые другие объекты
        Integer a = new Integer(123);
        Double b = new Double(12.34);
        Boolean c = new Boolean(false);

        // Можно и более привычным образом:
        Integer a2 = 123;
        Double b2 = 12.34;
        Boolean c2 = false;

        // Автоупаковка (autoboxing) / автораспаковка (autounboxing)

        // Автоупаковка
        // primitive -> object (wrapper)
        Integer d = 10;
        int e = 20;
        d = e;

        // Автораспаковка
        // object (wrapper) -> primitive
        int f = d;

        // Вызов метода
        int sum = sum(12, 34);
        System.out.println(sum);


        // Примитивом нельзя присвоить null
//        int f = null;

        // Оберткам можно
        Integer g = null;

        // Производительность оберток и примитивов
        // Найти сумму чисел от 1 до N
        final long N = 100_000_000;

        // примитивы
        long startTimePrimitives = System.currentTimeMillis();
        long sumPrimitives = 0L; // <<< Примитив
        for (int i = 1; i < N; i++) {
            sumPrimitives += i;
        }
        long endTimePrimitives = System.currentTimeMillis();
        System.out.println("Sum primitives: " + (endTimePrimitives - startTimePrimitives) + " milliseconds");

        // обертки
        long startTimeWrappers = System.currentTimeMillis();
        Long sumWrappers = 0L; // <<< Обертка (ссылочный тип)
        for (Integer i = 1; i < N; i++) {
            sumWrappers += i;
        }
        long endTimeWrappers = System.currentTimeMillis();
        System.out.println("Sum wrappers: " + (endTimeWrappers - startTimeWrappers) + " milliseconds");
    }

    private static Integer sum(Integer x, Integer y) {
        return x + y;
    }
}
