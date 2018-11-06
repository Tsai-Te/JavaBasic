package com.te.inf;

public interface Vehicle {
    void changeGear(int a);
    void changeSpeed(int a);
    void applyBrakes(int a);
}

//class Truck implements Vehicle{
//    int gear;
//    int speed;
//
//    @Override
//    public void changeGear(int newGear){
//        gear=newGear;
//    }
//
//    @Override
//    public void changeSpeed(int speedUp){
//        speed=speed+speedUp;
//    }
//
//    @Override
//    public void applyBrakes(int brake){
//        speed=speed-brake;
//    }
//
//    public void display(){
//        System.out.println("gear:" + gear+"speed:" + speed);
//    }
//}
//
//
//class TruckTest{
//    public static void main(String[] args){
//        Truck truck=new Truck();
//        truck.changeGear(2);
//        truck.changeSpeed(40);
//        truck.applyBrakes(10);
//        System.out.println("Truck's current state:");
//        truck.display();
//    }
//}
