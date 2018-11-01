package com.te.algorithm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FizzBuzz2 {
    public Set<String> solution(int n) {
        Set<String> result = new HashSet();
        for (int i = 1; i <= n; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(String.valueOf(i));
            }
        }
        return result;
    }

    public static Set<String> solution2(int n) {
        Set<String> result = new HashSet();
        for (int i = 1; i <= n; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(String.valueOf(i));
            }
        }
        return result;
    }
        public static void main(String[] args){
            FizzBuzz2 fb2=new FizzBuzz2();
            Set<String> result=fb2.solution(19);
            System.out.println(result);
//            Set<String> result2=fb2.solution(11);
//            System.out.println(result2);
            System.out.println(FizzBuzz2.solution2(21));
        }
}
