package com.te.javaBasic;

import java.util.ArrayList;
import java.util.List;

public class InClass {
    public static void main(String[] args){
        int threeCounts=0;
        int[] fourCounts={1,2,3,4,5,6};
        int sum=0;
        for (int i=0; i<=1000; i++){
            if (i%7==2){
                threeCounts++;
            }
        }
        for (int items : fourCounts){
            sum=sum+items;
        }
//        ArrayList a = new ArrayList();
//        a.add();
        System.out.println(threeCounts);
        System.out.println(sum);
    }
}
