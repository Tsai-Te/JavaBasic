package com.te.abstra;

import com.te.inf.Vehicle;

public class BicycleShare extends AbstractTest implements Vehicle {
    int gear;
    int speed;

    @Override
    public String abstractTest() {
        return "cool";
    }

    public void print(){
        //System.out.println("not cool");
        System.out.println("Gear is:"+gear+"\n"+"Speed is:"+speed);
    }

    public static void main(String[] args) {
        BicycleShare bs=new BicycleShare();
        //bs.print();

        /* Y = f(x)
         * Y=result (String type)
         */
        String result = bs.regularTest();
        System.out.println(result);
        // Z(Y) = Z(f(x))
        System.out.println(bs.abstractTest());

        bs.changeGear(3);
        bs.changeSpeed(30);
        bs.applyBrakes(10);
        System.out.println("Bicycle current state:");
        bs.print();
    }

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

}
