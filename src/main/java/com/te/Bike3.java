package com.te;

public class Bike3 {
    String wheelShape;
    int wheelNum;
    int seatNum;

    public Bike3() {
    }

    public Bike3(String ws, int wn, int sn) {
        this.wheelShape = ws;
        this.seatNum = wn;
        this.wheelNum = sn;
    }

    public void print() {
        System.out.println("ws is:" + wheelShape);
        System.out.println("wn is:" + wheelNum);
        System.out.println("sn is" + seatNum);
    }

    public static void main(String[] args) {
        Bike3 b3 = new Bike3("circle", 2, 1);
        b3.print();

//        String str1 = new String("1234");
//        String str2 = new String ("1234");
//        if (str1.equals(str2)) System.out.println("string comparsion");
//    }

//    public String getWheelShape(){
//        return wheelShape;
//    }
//
//    public static String getWheelShapeStatic(){
//        return "round";
//    }
//    public static void main(String[] args){
//        Bike3 b3=new Bike3();
//        System.out.println(b3.getWheelShape());
//        System.out.println(Bike3.getWheelShapeStatic());
//    }
    }
}




