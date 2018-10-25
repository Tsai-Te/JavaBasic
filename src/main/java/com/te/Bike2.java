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

//    public static void main (String[] args){
//        Bike2 b2 = new Bike2("circle", 2, "triangle");
//        b2.print();
//    }

    public String getWheelShape(){
        return wheelShape;
    }

    public int getWheelNum(){
        return wheelNum;
    }

    public static String getWheelShapeStatic(){
        return "rectangle";
    }
    public static void main(String[] args){
        Bike2 b2=new Bike2();
        System.out.println(b2.getWheelShape());
        System.out.println(Bike2.getWheelShapeStatic());
    }

    public static Integer getWheelNumStatic(){
        return 3;
    }
    public static void main(int[] args){
        Bike2 b2=new Bike2();
        System.out.println(b2.getWheelNum());
        System.out.println(Bike2.getWheelNumStatic());
    }

}
