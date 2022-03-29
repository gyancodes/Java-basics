package com.company;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter P: ");
        float p = in.nextFloat();
        System.out.print("Enter R: ");
        float r = in.nextFloat();
        System.out.print("Enter T: ");
        float t = in.nextFloat();

        float si = (p*r*t)/100;
        System.out.print("Simple Interest is " + si);
    }
}
