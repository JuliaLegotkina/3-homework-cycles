package ru.skypro;

public class Main {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.print (i + " ");
            i++;
        }

        System.out.println();
        for (int a = 10; a >= 1; a--) {
            System.out.print (a + " ");
        }

        System.out.println();
        System.out.println();
        int friday = 1;
        for (friday = 1; friday <= 31; friday += 7) {
            System.out.println("Сегодня пятница, " + friday + "-ое число. Необходимо подготовить отчет.");
        }

        System.out.println();
        int currentYear = 2021;
        int periodStarts = currentYear - 200;
        int periodEnds = currentYear + 100;
        for (int b = periodStarts; b < periodEnds; b++) {
            if (b % 79 == 0) {
                System.out.println(b);
            }
        }
    }
}