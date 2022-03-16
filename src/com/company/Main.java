package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите первое число");
        int a = scanner.nextInt();
        System.out.println(a + " Перове число");
        System.out.println("Ведите второе число");
        int b = scanner.nextInt();
        int c = a + b;
        System.out.println(c + " Ваш ответ");
    }
}
