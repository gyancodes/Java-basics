package com.company;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Base: ");
        double base = in.nextDouble();
        System.out.print("Enter Height: ");
        double height = in.nextDouble();

        double area = (base*height)/2;
        System.out.println("Area of Triangle= "+area);


    }

}
