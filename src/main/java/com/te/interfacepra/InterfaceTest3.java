package com.te.interfacepra;

public interface InterfaceTest3 {
    final int b=6;
    void display();

    public class Test3 implements InterfaceTest3{
        public void display(){
            System.out.println("exhibit");
        }
    }

    public static void main(String[] args){
        Test3 t3=new Test3();
        t3.display();
        System.out.println(b);
    }
}
