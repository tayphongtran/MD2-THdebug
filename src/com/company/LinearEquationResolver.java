package com.company;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("co gi khong");
        System.out.println(" phep tinh");
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao a:");
        double a = scanner.nextDouble();

        System.out.println("nhap vao b:");
        double b = scanner.nextDouble();

        if (a != 0) {
            double solution = -b/a;
        }
    }
}
