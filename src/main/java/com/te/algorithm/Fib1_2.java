package com.te.algorithm;

import java.util.HashMap;

public class Fib1_2 {
    public int fib(int n){
        if(n==0||n==1){
            return 1;
        }
        int sum=fib(n-1)+fib(n-2);
        return sum;
    }

    public int fib2(int n, HashMap<Integer, Integer> hp) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (hp.get(n) != null) {
            return hp.get(n);
        }
        else {
            int sum2 = fib(n - 1) + fib(n - 2);
            return sum2;
        }
    }

    public int fib3(int n) {
        int[] resultArray = new int[n + 2];
        int result = 0;
        for (int i = 0; i <= n; i++) {
            if (i == 0 || i == 1) {
                resultArray[i] = 1;
                result = resultArray[i];
            } else {
                resultArray[i] = resultArray[i - 1] + resultArray[i - 2];
                result=resultArray[i];
            }
        }
        return result;
    }



    public static void main(String[] args){
        Fib1_2 fib1_2=new Fib1_2();
        System.out.println(fib1_2.fib(4));
        HashMap<Integer, Integer> hp=new HashMap<>();
        System.out.println(fib1_2.fib2(4,hp));
        System.out.println(fib1_2.fib3(4));
    }
}
