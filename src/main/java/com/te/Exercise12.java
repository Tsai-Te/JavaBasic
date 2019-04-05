package com.te;

import java.util.Scanner;

public class Exercise12 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input first number: ");
        int num1 = in.nextInt();

        System.out.println("Input second number: ");
        int num2 = in.nextInt();

        System.out.println("Input third number: ");
        int num3 = in.nextInt();

        System.out.println("Average of three numbers is:"+((num1+num2+num3)/3));
    }
}