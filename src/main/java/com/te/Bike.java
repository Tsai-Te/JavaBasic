package com.te;

public class Bike {
    String wheelShape;
    int wheelNum;
    String seatShape;
    Integer handleNum;

    public Bike(){}

    public Bike(String ws, int wn, String sh, Integer hn) {
        this.wheelShape = ws;
        this.wheelNum = wn;
        this.seatShape = sh;
        this.handleNum = hn;
    }

    public void print() {
        System.out.println("ws chosen is:" + wheelShape);
        System.out.println("sh chosen is:" + seatShape);
        System.out.println("wn chosen is:" + wheelNum);
        System.out.println("hn chosen is:" + handleNum);
    }

//    public static void main (String []args){
//        Bike b= new Bike("square",2,"triangle",6);
//        b.print();
//        Bike b2 = new Bike();
//        b2.print();

//    }


    public int getWheelNum() {
        return wheelNum;
    }

    public String getWheelShape() {
        return wheelShape;
    }

    public String getSeatShape(){
        return seatShape;
    }


    //static
    public static String getWheelShapeStatic() {
        return "round";
    }
    public static void main(String[] args) {
        Bike b = new Bike();
        System.out.println("print bike instance b attribute");
        b.getWheelShape();
        System.out.println(b.getWheelNum());
//        System.out.println(Bike.getWheelShapeStatic());

        Bike c= new Bike("square",2,"triangle",6);
        System.out.println("print bike instance c attribute");
        System.out.println(c.getWheelShape());
        System.out.println(c.getWheelNum());
//        System.out.println(Bike.getWheelShapeStatic());
    }

    public static Integer getWheelNumStatic(){
        return 2;
    }

//    public static void main(int[] args){
//        Bike b=new Bike();
//        System.out.println(b.getWheelNum());
//        System.out.println(Bike.getWheelShapeStatic());
//    }

//    public static String getSeatShapeStatic(){
//        return "triangle";
//    }
//    public static void main(String[] args){
//        Bike b=new Bike();
//        System.out.println(b.getSeatShape());
//        System.out.println(Bike.getSeatShapeStatic());
//    }

}





