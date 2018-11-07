package com.te;

import com.te.inf.Vehicle;

public class Truck implements Vehicle {
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

    public void display(){
        System.out.println("Gear:" +gear + "Speed:" +speed);
    }

    public static void main(String[] args) {
        Truck truck = new Truck();
        truck.changeGear(2);
        truck.changeSpeed(20);
        truck.applyBrakes(10);
        System.out.println("Truck current state is:");
        truck.display();
    }
}


