package ru.chebaksa.basic;
// VCS
import java.util.Scanner;

public class Sandbox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                int x = scanner.nextInt();
        if (x > 5){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
