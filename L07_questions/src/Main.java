import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {5, 6};
        int[][] array2 = {{1}, {2}};
        int[][][] array3 = {
                {
                    {1}
                },
                {
                    {2}
                }
        };
        System.out.println(array1.length); // 2
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array1.length; i++) {
            System.out.println(i + 1 + " " + array1[i]);
        }
        int result = scanner.nextInt();
        System.out.println(array1[--result]);

        System.out.println("1 ===================================");
        System.out.println(result);
        System.out.println(--result);
        System.out.println(result);
        System.out.println("2 ===================================");
        System.out.println(result);
        System.out.println(result + 1);
        System.out.println(result);

        System.out.println("Scanner ===================================");
        if (scanner.hasNextInt()) { // при вводе с консоли буквы результат будет false
            int res = scanner.nextInt();
            System.out.println(res);
        } else {
            System.out.println("wrong input");
        }


        try {
            String res = scanner.nextLine();
            scanner.hasNextInt();
            int res2 = Integer.valueOf(res);
        } catch (Exception ex) {
            System.out.println("ERROR");
        }
    }
}