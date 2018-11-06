package com.te.inf;

public interface InterfaceTest2 {
    final int c=3;
    void print();

    public class Test2 implements InterfaceTest2{
        public void print(){
            System.out.println("show this:");
        }
    }

    public static void main(String[] args){
        Test2 t2=new Test2();
        t2.print();
        System.out.println(c);
    }
}
