package com.te.algorithm;

import java.util.HashMap;

public class FibTimeComplex {
    HashMap<Integer, Integer> hp = new HashMap<>();
    public int f(int n) {
       if (n==1||n==0){
           return 1;
       }
       if (hp.get(n)!=null){
           return hp.get(n);
       }
       else {
           int result=f(n-1)+f(n-2);
           hp.put(n,result);
            return result;
       }

    }

    public static void main(String args[]) {
        FibTimeComplex fb=new FibTimeComplex();
        System.out.println(fb.f(10));
    }
}
