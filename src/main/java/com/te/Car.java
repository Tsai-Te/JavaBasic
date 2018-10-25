package com.te;

public class Car {
    String seatMaterial;
    int doorNum;
    String color;

    public Car(){};

    public Car(String sm, int dn, String cr){
        this.seatMaterial=sm;
        this.doorNum=dn;
        this.color=cr;
    }

    public void print(){
        System.out.println("sm is:"+seatMaterial);
        System.out.println("dn is:"+doorNum);
        System.out.println("cr is:"+color);
    }

    public static void main(String[] args){
        Car c=new Car("leather", 4, "blue");
        c.print();
    }

}

