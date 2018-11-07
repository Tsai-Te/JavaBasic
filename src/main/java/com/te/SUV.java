package com.te;

import com.te.inf.Vehicle;

public class SUV implements Vehicle {
    int speed;
    int gear;

    @Override
    public void changeGear(int newGear) {
        gear=newGear;
    }

    @Override
    public void changeSpeed(int speedUp) {
        speed=speed+speedUp;
    }

    @Override
    public void applyBrakes(int speedDown) {
        speed=speed-speedDown;
    }

    public void exhibit(){
        System.out.println("Gear is:" +gear);
        System.out.println("Speed is:" +speed);
    }

    public static void main(String[] args){
        SUV suv=new SUV();
        suv.changeGear(4);
        suv.changeSpeed(40);
        suv.applyBrakes(20);
        suv.exhibit();
    }
}


