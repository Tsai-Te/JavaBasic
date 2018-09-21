package com.te;

import com.google.common.base.Strings;

public class Bicycle extends Bike {
        int pedalNum;
        public Bicycle (){}
        public Bicycle(int pn){
            this.pedalNum = pn;
        }
        public void print(){
            super.print();
            System.out.println("pn chosen is:" + pedalNum);
        }

        public static void main (String args[]){
            Bicycle bi = new Bicycle(2);
            bi.print();
            String instanceStr = bi.toString();
            System.out.println(instanceStr);

            String st="repeat10";
            System.out.println(Strings.repeat(st,12));
        }
        int getPedalNum(){
            return pedalNum;
        }

        public String toString(){
            return "wheelShape:" + getWheelShape()+", wheelNum:" + getWheelNum()+", pedalNum:" + getPedalNum();
        }


}
