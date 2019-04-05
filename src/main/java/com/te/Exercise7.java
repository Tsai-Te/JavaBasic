package com.te;

import java.util.Scanner;

public class Exercise7 {

    public static void main(String[] arg){
        Scanner in=new Scanner(System.in);

        System.out.println("Input a number:");
        int num=in.nextInt();

        for (int i=0; i<=10; i++){
            System.out.println(num+"x"+(i)+"="+(num*(i)));
        }
    }
}
