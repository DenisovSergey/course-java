package ru.chebaksa.basic;

import java.util.Scanner;

public class ifStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x > 5 || x < 1) {
            System.out.println("Неверное число");
        } else {
            if (x > 4) {
                System.out.println("Отлично");
            } else if (x > 3) {
                System.out.println("Хорошо");
            } else if (x > 2) {
                System.out.println("Удовлетворительно");
            } else {
                System.out.println("Неуд");
            }
        }
    }
}
