package com.te;

import java.util.Arrays;

public class Car2 {
//    String seatMaterial;
//    String paintColor;
//    int doorNum;
//    int wheelNum;
//
//    public Car2(){};
//
//    public Car2(String sm, String pc, int dn, int wn){
//        this.doorNum=dn;
//        this.paintColor=pc;
//        this.seatMaterial=sm;
//        this.wheelNum=wn;
//    }
//
//    public void print(){
//        System.out.println("Seat Material is:" +seatMaterial);
//        System.out.println("Door numbers are:" +doorNum);
//        System.out.println("Paint color is:" +paintColor);
//        System.out.println("Wheel Numbers are:" +wheelNum);
//    }
//
//    public static void main(String[] args){
//        Car2 c2=new Car2("leather", "white", 4, 4);
//        c2.print();
//    }
//abstract class Person{
//    abstract void abstractSayHi();
//    void sayHi(){
//        System.out.println("Hi");
//    }
//    static void staticSayHi(){
//        System.out.println("Hi I am static");
//    }
////}
//public static void main(String[] args) {
//    Car2.staticSayHi();
////    String str="Py";
////    int stringLength=3;
////    String lastThreeChar=str.substring(str.length()-3);
////    if(str.length()<stringLength){
////        stringLength=str.length(); //?
////    }
////    System.out.println(lastThreeChar+str+lastThreeChar);
////}
//
//    int intVal1 = Integer.parseInt("1001", 8);  //base 8
//    System.out.println(intVal1);
//    }
//public class ContainsTenAndTwenty {
//    public static void main(String[] args) {
//        int[] nums = {20, 10, 70, 80, 50, 13, 50};
//        boolean test = false;
//        int result = 0;
//        int x = 10;
//        int y = 20;
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == x)
//                test = true;
//
//            if (test && nums[i] == y)
//                System.out.printf(String.valueOf(true));
//            // System.out.println();
//            result = 1;
//        }
//        if (result == 0)
//            System.out.printf(String.valueOf(false));

//        int[] array_nums = {10, 70, 80, 50, 13, 50};
//             	boolean testd = false;
//          	int result=0;
//          	int x = 10;
//          	int y = 20;
//
//           for(int i = 0; i < array_nums.length; i++) {
//               if(array_nums[i] == x)
//                   testd = true;
//
//               if(testd && array_nums[i] == y)
//         {
//                System.out.printf( String.valueOf(true));
//                result = 1		 ;
//         }
//           }
//            if (result==0)
//           {
//                System.out.printf( String.valueOf(false));
//         }
//    }

//    public static void main(String[] args)
//    {
//        int[] array_nums = {12,10,1, 7, 8, 5, 7, 13, 0, 2, 4, 9};
////        int[] array_nums = {12,10};
//
//        int i = 0;
//        System.out.println("Original Array: "+ Arrays.toString(array_nums));
//        while(i < array_nums.length && array_nums[i] % 2 != 0)
//            i++;
//
//        for(int j = i + 1; j < array_nums.length; j++) {
//            if(array_nums[j] % 2 != 0) {
//                int temp = array_nums[i];
//                array_nums[i] = array_nums[j];
//                array_nums[j] = temp;
//                i++;
//            }
//        }
//
//        System.out.println("New Array: "+Arrays.toString(array_nums));
//    }

//    public static void main(String[] args) {
//        int[] array_nums = {11, 10, 13, 10, 45, 20, 33, 53};
//        int result = 0;
//        System.out.println("Original Array: " + Arrays.toString(array_nums));
//
//        int l = array_nums.length - 1;
//        int[] new_array;
//        while (array_nums[l] != 10)
//            l--;
//        new_array = new int[array_nums.length - 1 - l];
//        for (int i = l + 1; i < array_nums.length; i++)
//            new_array[i - l - 1] = array_nums[i];
//        System.out.println("New Array: " + Arrays.toString(new_array));
//    }

    public static void main(String[] args) {
        // int[] nums={1,2,3};
        // boolean result=(nums[0]==nums[nums.length-1])?true:false;
        // System.out.println(String.valueOf(result));

        int[] array_nums = {11, 15, 13, 10, 45, 20, 11, 15};
        // System.out.println("Original Array: "+Arrays.toString(array_nums));

        int result = 0;
        int l = 2;
        int start = 0;
        int end = array_nums.length-l;
        for(l = 2; l > 0; l--)
        {
            if(array_nums[start] != array_nums[end])
                result = 1;
            else
            {
                start++;
                end++;
            }
        }

        if (result==1)
        {
            System.out.printf(String.valueOf(false));
        }
        else
        {
            System.out.printf(String.valueOf(true));
        }
        System.out.printf("\n");
    }
}
