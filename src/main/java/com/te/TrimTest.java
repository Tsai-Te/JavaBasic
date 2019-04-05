package com.te;

public class TrimTest {
    private String trimTest;

    public TrimTest(String tt){
        this.trimTest=tt;
    }

    public void print(){
        System.out.println("print:"+trimTest.trim());
    }

    public static void main(String[] args){
        TrimTest trimTest=new TrimTest("   w o r k   ");
        trimTest.print();

        String s = "  this is a cup   ";
       System.out.println(s.trim());

    }
}
