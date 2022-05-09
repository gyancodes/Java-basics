package com.company;

import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {
        System.out.print("Enter Your Name: ");
        Scanner in = new Scanner(System.in);
        String name = in.next();
        String message ="Good Morning " + name + " It's Monday Today";
        System.out.println(message);

    }
}


