package com.te.algorithm;

import com.te.Bike;

import java.util.*;

public class FizzBuzz {
//    public List<String> solution(int n){
//        List<String> result=new ArrayList();
//        for (int i=1;i<n;i+=2){
//            if ((i%3==0) && (i%5==0)) {
//                result.add("FizzBuzz");
//            }else if(i%3==0){
//                result.add("Fizz");
//            }else if(i%5==0){
//                result.add("Buzz");
//            }else {
//                result.add(String.valueOf(i));
//            }
//        }
//        return result;
//    }

//    public static List<String> solution2 (int n){
//        List<String> result2=new ArrayList();
//        for (int i=1; i<=n;i++) {
//
//            if ((i % 3 == 0) && (i % 5 == 0)) {
//                result2.add("FizzBuzz");
//            } else if (i % 3 == 0) {
//                 result2.add("Fizz");
//            } else if (i % 5 == 0) {
//                 result2.add("Buzz");
//            } else {
//                 result2.add(String.valueOf(i));
//            }
//
//        }
//        return result2;
//    }


    public static void main(String[] args){
        FizzBuzz fb=new FizzBuzz();
//        System.out.println("test result");
//        List<String> result = fb.solution(30);
//        List<String> result2=fb.solution(30);
//        System.out.println(result);
//        System.out.println(result2);
    //public static void main(String[] args){
//        Integer[] input={1,2}
        //solution(16)

        System.out.println(fb.solution4(15));

//  static
//    System.out.println(FizzBuzz.solution2(16));
    //FizzBuzz.main(null);

    }

    public List<String> solution3(int n){
        List<String> list=new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(i%3==0&&i%5==0){
                list.add("FizzBuzz");
            } else if (i%3==0) {
                list.add("Fizz");
            } else if (i%5==0) {
                list.add("Buzz");
            } else {
                list.add(String.valueOf(i));
            }
        }
        return list;
    }

    public List<String> solution4(int n){
        List<String> list=new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(i%3==0&&i%5==0){
                list.add("FizzBuzz");
            } else if (i%3==0) {
                list.add("Fizz");
            } else if (i%5==0) {
                list.add("Buzz");
            } else {
                list.add(String.valueOf(i));
            }
        }
        Collections.reverse(list);
        return list;
    }

}
