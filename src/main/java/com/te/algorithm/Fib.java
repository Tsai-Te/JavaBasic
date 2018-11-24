package com.te.algorithm;

import java.util.HashMap;
import java.util.List;

public class Fib {

    public int f(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int sum = f(n - 1) + f(n - 2);
        return sum;
    }


    public int fi2(int n,HashMap<Integer,Integer> hp) {
        if (n == 1 || n == 0) {
            return 1;
        }
        if (hp.get(n) != null) {
            return hp.get(n);
        } else {
            int result = f(n - 1) + f(n - 2);
            hp.put(n, result);
            return result;
        }
    }

    public int fi3(int n){  //bottom, up
        int[] resultArray=new int[n+2];
        int result=0;
        for(int i=0;i<=n;i++){
            if(i==0||i==1){
                resultArray[i]=1;
                result=resultArray[i];
            }
            else{
                resultArray[i]=resultArray[i-1]+resultArray[i-2];
                result=resultArray[i];
            }
        }
        return result;
    }


    public static void main(String[] args){
        Fib fib =new Fib();
        //int sum = fib.f(5);
        //System.out.println(sum);
        System.out.println(fib.f(9));
        HashMap<Integer,Integer> hp=new HashMap<>();
        System.out.println(fib.fi2(9,hp)); //---wait to be solved
        System.out.println(fib.fi3(9));
    }


}
