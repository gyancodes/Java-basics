package com.company;

import java.util.Scanner;

public class RupeeToUsd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Rupee: ");
        int rupee = in.nextInt();
        int value = rupee / 74;
        System.out.print("USD: " + value);

    }
}
