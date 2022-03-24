package com.company;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int x = in.nextInt();
        System.out.print("Enter Second Number: ");
        int y = in.nextInt();
        double result = x * y;
        System.out.print("Result: " + result);
    }
}
