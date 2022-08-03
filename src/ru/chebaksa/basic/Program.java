package ru.chebaksa.basic;
     // Типы данных
     // char - целое число (символ) (1 байт)
     // byte - целое число (1 байт)
     // short - целое число (2 байта)
     // int - целое число (4 байта)
     // long - целое число (8 байт)
     // float - сисло с плавующей запятой (4 байта)
     // double - число с плавующей запятой (8 байт)
     // string - строка

     // Базовые команды
     // - Выделение памяти
     // Тип имя;
     // - Копирование
     // куда = откуда;
     // печать в консоль
     // System.out.println(...);

     // Scanner scanner = new Scanner(System.in);
     // int x = scanner.nextInt();


import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int bricks = 10;
        while (bricks >= 0) {
            System.out.println("Неси 5 кирпичей");
            bricks = bricks - 5;
        }
        Scanner scanner = new Scanner (System.in);
        int x;
        int sum = 0;
        while (true) {
            x = scanner.nextInt();
            sum += x;
            if (x == 0){
                break;
            }
        }
        System.out.println(sum);
    }
}
