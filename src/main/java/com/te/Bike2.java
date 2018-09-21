package com.te;

public class Bike2 {
    String wheelShape;
    int wheelNum;
    String seatShape;

    public Bike2 (){};

    public Bike2 (String ws, int wn, String ss){
        this.wheelShape=ws;
        this.wheelNum=wn;
        this.seatShape=ss;
    }

    public void print(){
        System.out.println ("ws is:" + wheelShape);
        System.out.println ("wn is:" + wheelNum);
        System.out.println ("ss is:" + seatShape);
    }

    public static void main (String[] args){
        Bike2 b2 = new Bike2("circle", 2, "triangle");
        b2.print();
    }

}
