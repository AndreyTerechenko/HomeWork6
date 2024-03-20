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
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является високосным");
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
        for (int month = 1; month <= 12; month++) {
            int contribution = 29000;
            int allMoney = contribution * month;
            System.out.println("Месяц " + month + " сумма накоплений равна " + allMoney + " рублей");
        }
        // Задача 9
        for (int month = 1; month <= 12; month++) {
            double contribution = 29000;
            double percent = contribution * 0.01 + contribution;
            double allMoney = percent * month;
            System.out.println("Месяц " + month + " сумма накоплений равна " + allMoney + " рублей");
        }
        // Задача 10
        for (int i = 1; i <= 10; i++) {
            int t = 2;
            int res = t * i;
            System.out.println(t + "*" + i + "=" + res);
        }
    }
}

