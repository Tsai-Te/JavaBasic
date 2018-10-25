package com.te;

public class vehicle {
    String vehicleType;
    String vehicleBrand;
    String vehicleColor;
    int doorNum;

    public vehicle(){};

    public vehicle (String vt, String vb, String vc, int dn){
        this.vehicleBrand=vb;
        this.vehicleColor=vc;
        this.doorNum=dn;
        this.vehicleType=vt;
    }

    public void print(){
        System.out.println("Vehicle type is:"+vehicleType);
        System.out.println("Vehicle color is:"+vehicleColor);
        System.out.println("Door number is:"+doorNum);
        System.out.println("Vehicle brand:"+vehicleBrand);
    }

    public static void main(String[] args){
        vehicle v=new vehicle("sedan", "BMW", "navy", 3);
        v.print();
    }
}
