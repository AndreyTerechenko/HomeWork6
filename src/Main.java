public class Main {
    public static void main(String[] args) {
        // Задача 1
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        //Задача 2
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        // Задача 3
        for (int i = 0; i <= 17; i += 2) {
            System.out.println(i);
        }
        // Задача 4
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        // Задача 5
        for (int year = 1904; year <= 2096; year += 4) {
            System.out.println(year + " год является високосным");
        }
        // Задача 6
        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }
        // Задача 7
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }
        // Задача 8
        double contribution = 0;
        for (int month = 1; month <= 12; month++) {
            contribution = contribution + 29000;
            System.out.println("Месяц " + month + " сумма накоплений равна " + (long) contribution + " рублей");
        }
        // Задача 9
        contribution = 0;
        for (int month = 1; month <= 12; month++) {
            contribution = contribution * 1.01;
            contribution = contribution + 29000;
            System.out.println("Месяц " + month + " сумма накоплений равна " + (long) contribution + " рублей");
        }
        // Задача 10
        int t = 2;
        int res = 0;
        for (int i = 1; i <= 10; i++) {
            res = t * i;
            System.out.println(t + "*" + i + "=" + res);
        }
    }
}

