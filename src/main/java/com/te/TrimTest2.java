package com.te;

public class TrimTest2 {
    private String test="   what    ";

    public TrimTest2(){}

    public TrimTest2(String tt){
        this.test=tt;
    }

    public void print(){
        System.out.println(test.trim());
    }

    public static void main(String[] arg){
        TrimTest2 trimTest2=new TrimTest2();
        trimTest2.print();
    }
}
