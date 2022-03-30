package com.company;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        int ans = sum2();
        System.out.println(ans);
    sum();

    }
    static  void sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println(sum);
    }

    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a = in.nextInt();
        System.out.print("Enter number 2: ");
        int b = in.nextInt();

        int sum2 = a + b;
        return sum2;
    }
}
