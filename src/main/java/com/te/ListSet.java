package com.te;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListSet {
    public Boolean solution(Integer[] inputs){
        List<Integer> myList=new ArrayList<Integer>();
        Set<Integer> mySet=new HashSet<Integer>();

        for (int i=0;i<inputs.length;i++ ){
            myList.add(inputs[i]);
            mySet.add(inputs[i]);
        }

        if (myList.size()>mySet.size()) {
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }

    public static Boolean staticMethod(Integer[] inputs){
        return Boolean.TRUE;
    }

    public static void main(String[] args){
        Integer[] input1 = {1,1,5,7,9};
        ListSet ls=new ListSet();
        Boolean result=ls.solution(input1);
        Integer[] input2={1,2,3,4,5,6};
        Boolean result2=ls.solution(input2);
        System.out.println("There is duplication:");
        System.out.println(result);
        System.out.println(result2);

        ListSet.staticMethod(input1);
    }
}
