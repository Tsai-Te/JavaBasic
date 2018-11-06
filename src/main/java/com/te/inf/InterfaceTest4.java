package com.te.inf;

public interface InterfaceTest4 {
    final String a="five";
    void print();

    class Test4 implements InterfaceTest4{
        public void print(){
            System.out.println("2+3=?");
        }
    }

    public static void main(String[] args){
        Test4 t4=new Test4();
        t4.print();
        System.out.println(a);
    }
}
