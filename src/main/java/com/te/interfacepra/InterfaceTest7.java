package com.te.interfacepra;

public interface InterfaceTest7 {
    final double a=1.1;
    void print();

    class Test7 implements InterfaceTest7{
        public void print(){
            System.out.println("the number is");
        }
    }

    public static void main(String[] args){
        Test7 t7=new Test7();
        t7.print();
        System.out.println(a);
    }
}
