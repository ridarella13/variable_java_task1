package quru_qa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // примитивные переменные и операции с ними
        byte varByte = 115; //-128 ....... 127
        short varShort = 32767; // -32788 ....... 32767
        int varInt = 2147483647;
        long varLong = 3500000;
        float varFloat = 0.3f;
        double varDouble = 39.0;

        System.out.println(varByte + varShort);
        System.out.println(varLong - varInt);
        System.out.println(varFloat * varInt);
        System.out.println(varInt / varDouble);

        // Логические операторы
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите а");
        double a = sc.nextDouble();
        System.out.println("Введите b");
        double b = sc.nextDouble();
        System.out.println("Введите c");
        double c = sc.nextDouble();
        sc.close();
        if (a < b && b < c) {
            System.out.println("Неравенство выполняется");
        } else if (b > a && a > c) {
            System.out.println("Неравенство выполняется");
        } else {
            System.out.println("Ни одно неравенство не выполняется");
        }
        //переполнение
        System.out.println((int) (varInt + 1));

    }
}



