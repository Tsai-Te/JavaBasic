package com.te.interfacepra;

public interface Bike5 {
    final int a=2;
    void display();

    class Bike6 implements Bike5{
        public void display(){
            System.out.println("Bike6 wheel numbers are");
        }
    }

    public static void main(String[] args){
        Bike6 b6=new Bike6();
        b6.display();
        System.out.println(a);
    }

}
