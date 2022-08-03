package ru.chebaksa.basic;

import java.util.Scanner;



public class scCycle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        a = scanner.nextInt();
        b = scanner.nextInt();
        if (a < b) {
            for (int i = a; i < b; i++) {
                System.out.println(i);
            }
        } else if(a > b) {
            for(int i = a; i > b; i--){
                System.out.println(i);
            }
        } else {
            System.out.println("Числа равны");
        }
    }
}
