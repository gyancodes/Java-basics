package com.company;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Num1: ");
        int x = in.nextInt();
        System.out.print("Enter Num2: ");
        int y = in.nextInt();
        int sum = x+y;
        System.out.println("Sum of Num1 and Num2: " +sum);


    }
}
