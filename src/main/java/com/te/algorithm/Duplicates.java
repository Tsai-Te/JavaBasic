package com.te.algorithm;

import java.util.ArrayList;
import java.util.List;

public class Duplicates {
//    public List<Integer> findDuplicates(int[] inputNums) {
//        List<Integer> myList = new ArrayList<Integer>();
//        for (int i = 0; i < inputNums.length; i++) {
//
//        }
//    }
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i])-1;
            if (nums[index] < 0)
                res.add(Math.abs(index+1));
            nums[index] = -nums[index];
        }
        return res;
    }

    public static void main(String[] args){
        Duplicates find = new Duplicates();
        int[] nu ={4,3,2,7,8,2,3,1};
        System.out.println(find.findDuplicates(nu));
    }
}
