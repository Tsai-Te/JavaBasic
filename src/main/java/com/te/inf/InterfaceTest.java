package com.te.inf;

public interface InterfaceTest {
    final int a=10;
    void display();

    class Test implements InterfaceTest{
        public void display(){
            System.out.println("show");
        }
    }

    public static void main(String[] args){
        Test t=new Test();
        t.display();
        System.out.println(a);
    }
}
