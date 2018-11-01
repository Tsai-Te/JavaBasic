package com.te;

public class Bike4 {
    String wheelShape;
    String seatShape;
    int seatNum;
    int wheelNum;

    public Bike4(){}

    public Bike4(String ws, String ss, int sn, int wn){
        this.wheelShape=ws;
        this.wheelNum=wn;
        this.seatNum=sn;
        this.seatShape=ss;
    }

    public void print(){
        System.out.println("ws is:"+wheelShape);
        System.out.println("ss is:"+seatShape);
        System.out.println("sn is:"+seatNum);
        System.out.println("wn is:"+wheelNum);
    }

    public static void main(String[] args){
        Bike4 b4 =new Bike4("round","cicle",1,2);
        b4.print();

    }
}
