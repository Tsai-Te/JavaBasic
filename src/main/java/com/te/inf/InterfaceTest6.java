package com.te.inf;

public interface InterfaceTest6 {
    final int a=1;
    final String b="two";
    final double c=3.0;
    void display();

    class Test6 implements InterfaceTest6{
        public void display(){
            System.out.println("show");
        }
    }

    public static void main(String[] args){
        Test6 t6=new Test6();
        t6.display();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
