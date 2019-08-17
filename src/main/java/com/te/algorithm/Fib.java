package com.te.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Fib {

//    public int f(int n) {
//        if (n<0){
//            return 0;
//        }
//        if (n == 1 || n == 0) {
//            return 1;
//        }
//        int sum = f(n - 1) + f(n - 2);
//        return sum;
//    }//time complexity
//
//
//    public int fi2(int n,HashMap<Integer,Integer> hp) { //n:index
//        if (n == 1 || n == 0) {
//            return 1;
//        }
//        if (hp.get(n) != null) {
//            return hp.get(n);
//        } else {
//            int result = f(n - 1) + f(n - 2);
//            hp.put(n, result);
//            return result;
//        }
//    }
//
//    public int fi3(int n){  //bottom, up
//        int[] resultArray=new int[n+2];
//        int result=0;
//        for(int i=0;i<=n;i++){
//            if(i==0||i==1){
//                resultArray[i]=1;
//                result=resultArray[i];
//            }
//            else{
//                resultArray[i]=resultArray[i-1]+resultArray[i-2];
//                result=resultArray[i];
//            }
//        }
//        return result;
//    }
//
//
//    public static void main(String[] args){
//        Fib fib =new Fib();
//        //int sum = fib.f(5);
//        //System.out.println(sum);
//        System.out.println(fib.f(9));
//        HashMap<Integer,Integer> hp=new HashMap<>();
//        System.out.println(fib.fi2(9,hp)); //---wait to be solved
//        System.out.println(fib.fi3(9));
//    }
    public static void main(String[] args) {
        Fib fib=new Fib();
        System.out.println(fib.f2(9));
//        System.out.println(fib.f(9));
    }

//    public int fib(int n){
//        if(n<0){
//            return -1;
//        }
//        if(n==0||n==1){
//            return 1;
//        }
//        int sum=fib(n-2)+fib(n-1);
//        return sum;
//    }
//
//    public int fib2(int n){
//        int[] arr=new int[n+2];
//        int result=0;
//        if(n<0){
//            return -1;
//        }
//        for(int i=0; i<=n; i++){
//            if(i==0||i==1){
//                arr[i]=1;
//                result=arr[i];
//            } else {
//                arr[i]=arr[i-2]+arr[i-1];
//                result=arr[i];
//            }
//        }
//        return result;
//    }

//    public int fib(int n){
//        if(n<0){
//            return -1;
//        }
//        if(n==0||n==1){
//            return 1;
//        }
//        int sum=fib(n-2)+fib(n-1);
//        return sum;
//    }

//    public int fib2(int n){
//        int[] arr=new int[n+2];
//        int result=0;
//        if(n<0){
//            return -1;
//        }
//        for(int i=0; i<=n; i++){
//            if(i==0||i==1){
//                arr[i]=1;
//                result=arr[i];
//            } else {
//                arr[i]=arr[i-2]+arr[i-1];
//                result=arr[i];
//            }
//        }
//        return result;
//    }

//

    public int f(int n){
        if(n<0){
            return -1;
        }

        if(n==0||n==1){
            return 1;
        }

        int sum=f(n-2)+f(n-1);
        return sum;
    }

    public int f2(int n){
        int[] array=new int[n+2];
        int result=0;

        if(n<0){
            return -1;
        }

        for(int i=0; i<=n; i++){
            if(i==0||i==1){
                array[i]=1;
                result=array[i];
            } else {
                array[i]=array[i-2]+array[i-1];
                result=array[i];
            }

        }
        return result;


    }


}


//exit if(n=0) return 0;
//      if(n=1) return 1;
//      sum= finb(n-1)+fin(n-2)
//      return =sum;