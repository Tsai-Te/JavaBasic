package com.te;

public class Car2 {
    String seatMaterial;
    String paintColor;
    int doorNum;
    int wheelNum;

    public Car2(){};

    public Car2(String sm, String pc, int dn, int wn){
        this.doorNum=dn;
        this.paintColor=pc;
        this.seatMaterial=sm;
        this.wheelNum=wn;
    }

    public void print(){
        System.out.println("Seat Material is:" +seatMaterial);
        System.out.println("Door numbers are:" +doorNum);
        System.out.println("Paint color is:" +paintColor);
        System.out.println("Wheel Numbers are:" +wheelNum);
    }

    public static void main(String[] args){
        Car2 c2=new Car2("leather", "white", 4, 4);
        c2.print();
    }
}
