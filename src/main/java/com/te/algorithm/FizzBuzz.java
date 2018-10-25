package com.te.algorithm;

import com.te.Bike;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {


    public List<String> solution(int n){
        List<String> result=new ArrayList();
//        Bike b = new Bike();
        for (int i=1;i<n;i+=2){
            if ((i%3==0) && (i%5==0)) {
                result.add("FizzBuzz");
            } else if(i%3==0){
                result.add("Fizz");
            }else if(i%5==0){
                result.add("Buzz");
            }else {
                result.add(String.valueOf(i));
            }

//            return result;
        }
        return result;
    }

    public static void main(String[] args){
        FizzBuzz fb=new FizzBuzz();
        System.out.println("test result");
        List<String> result = fb.solution(16);
        List<String> result2=fb.solution(28);
        System.out.println(result);
        System.out.println(result2);
    //public static void main(String[] args){
//        Integer[] input={1,2}
        //solution(16)
    }
}
