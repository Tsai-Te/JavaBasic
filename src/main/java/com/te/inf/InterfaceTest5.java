package com.te.inf;

public interface InterfaceTest5 {
    final double e=3.19;
    final String e2="hello";
    void display();

    class Test5 implements InterfaceTest5{
        public void display(){
            System.out.println("exhibit both");
            //System.out.println("show");
        }
    }

    public static void main(String[] args){
        Test5 t5=new Test5();
        t5.display();
        System.out.println(e);
        System.out.println(e2);
    }
}
