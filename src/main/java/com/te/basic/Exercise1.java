package com.te.basic;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Hi, what's your name?");
        String fname=s.next();
        System.out.println("How are you,"+" "+fname+"?");
        String lname=s.next();
        System.out.println("\nWhat can I do for you?");
    }

}
