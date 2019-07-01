package com.te.javaBasic.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSums {
    //    public int[] solution(int[] nums, int target) {
////         int [] res= new int[2];
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[j] == target - nums[i]) {
//                    return new int[]{i, j};
//                }
//            }
//        }
//        throw new IllegalArgumentException("no");
//////        System.out.println(res );
////
////        System.out.println(Arrays.toString(res));
////        return res;
//    }
//    public static void main(String args[]){
//        TwoSums twoSums=new TwoSums();
//        int[] ints={2,7,11,15};
//        int target=9;
////        System.out.println(twoSums.solution(ints,target));
////        twoSums.solution(ints, target);
////        System.out.println(Arrays.toString(ints));
//        System.out.println(Arrays.toString(twoSums.solution(ints,target)));
//    }

    public int[] solution2(int[] nums, int target) {
        Map<Integer, Integer> map= new HashMap<>();
        for (int i=0; i<nums.length; i++){
            map.put(nums[i], i);
        }
        for (int j=0; j<nums.length; j++){
            int complement=target-nums[j]; //why target - index ???
            if(map.containsKey(complement)&&map.get(complement) != j){
                return new int[]{j, map.get(complement)};
            }
        }
        throw new IllegalArgumentException("no");
    }

    public static void main(String args[]){
        TwoSums twoSums=new TwoSums();
        int[] ints={2,7,11,15};
        int target=9;
        System.out.println(Arrays.toString(twoSums.solution2(ints,target)));
    }
}
