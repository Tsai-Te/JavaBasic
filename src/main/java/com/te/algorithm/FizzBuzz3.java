package com.te.algorithm;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz3 {
    public List<String> solution(int n) {
        List<String> result = new ArrayList();
        for (int i=1;i<=n;i++){
            if ((i%3==0)&&(i%5==0)&&(i%7==0)){
                result.add("FizzBuzzTozz");
            }else if((i%3==0)&&(i%5==0)){
            result.add("FizzBuzz");
            }else if((i%3==0)&&(i%7==0)){
            result.add("FizzTozz");
            }else if((i%5==0)&&(i%7==0)) {
                result.add("BuzzTozz");
            }else if(i%3==0){
                result.add("Fizz");
            }else if(i%5==0){
                result.add("Buzz");
            }else if (i%7==0){
                result.add("Tozz");
            }else{
                result.add(String.valueOf(i));
            }
        }
        return result;
    }

    public static void main(String[] args){
        FizzBuzz3 fb3=new FizzBuzz3();
        List<String> result=fb3.solution(35);
        System.out.println(result);
    }

}
