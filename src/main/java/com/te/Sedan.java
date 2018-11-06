package com.te;

import com.te.inf.Vehicle;

public class Sedan implements Vehicle {
    int gear;
    int speed;

    @Override
    public void changeGear(int newGear) {
        gear=newGear;
    }

    @Override
    public void changeSpeed(int increment) {
        speed=speed+increment;
    }

    @Override
    public void applyBrakes(int decrement) {
        speed=speed-decrement;
    }

    public void print(){
        System.out.println("When gear is:" +gear);
        System.out.println("Speed is:"+speed);
        //System.out.println("gear:"+gear+"speed:"+speed);
    }
}

class SedanTest{
    public static void main(String[] args){
        Sedan sedan=new Sedan();
        sedan.changeGear(3);
        sedan.changeSpeed(50);
        sedan.changeGear(5);
        System.out.println("Sedan current status:");
        sedan.print();
    }
}
