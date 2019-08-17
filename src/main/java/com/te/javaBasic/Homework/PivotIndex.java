package com.te.javaBasic.Homework;

import java.util.Arrays;

public class PivotIndex {
//    public int[] solution (int[] nums){
////        for (int i=0; i<nums.length; i++){
////            if(nums.length==0){
////                return new int[-1];
////            }
////        }
////        return null;
//
//        int sum=0;
//        int leftSum=0;
//        for (int x: nums){
//            sum += x;
//        }
//        for (int i=0; i<nums.length;i++){
//            if(leftSum==sum-leftSum-nums[i]){
//                return new int[]{i};
//            }else{leftSum+=nums[i];
//            }
//        }
//        return new int[-1];
//    }
//
//    public static void main(String[] args){
//        PivotIndex pivotIndex=new PivotIndex();
//        int[] nums = {1, 7, 3, 6, 5, 6};
//        int[] nums2 = {1,2,3};
//        System.out.println(Arrays.toString(pivotIndex.solution(nums)));
////        System.out.println(Arrays.toString(pivotIndex.solution(nums2)));
//////    int index=0;
////        for(int i=0; i<nums.length; i++){
////            for (int j=i+1; i<nums.length;j++){
////                if(nums[i]+nums[j]==nums[i]+nums[j]){
////                }
////            }
////        }
////        System.out.println({i,j});
//
//    }

//    public int[] solution (int[] nums){
//        int sum=0;
//        int leftSum=0;
//        for (int x : nums){
//            sum += x;
//        }
//        for (int i=0; i<nums.length; i++){
//            if (leftSum == sum-leftSum-nums[i]){
//                return new int[] {i};
//            } else {
//                leftSum+=nums[i];
//            }
//        }
//        return new int[] {-1};
//    }
//
//    public static void main (String[] args){
//        PivotIndex pivotIndex = new PivotIndex();
//        int[] nums = {1, 7, 3, 6, 5, 6};
//        int[] nums2 = {1,2,3};
//        System.out.println(Arrays.toString(pivotIndex.solution(nums)));
//        System.out.println(Arrays.toString(pivotIndex.solution(nums2)));
//    }

//    public int[] solution (int[] nums){
//        int sum=0;
//        int leftSum=0;
//        for (int x :nums){
//            sum += x;
//        }
//        for (int i=0; i<nums.length; i++){
//            if(leftSum == sum - leftSum - nums[i]){
//                return new int[] {i};
//            } else {
//                leftSum += nums[i];
//            }
//        }
//        return new int[] {-1};
//    }

//    public int[] solution3 (int[] nums){
//        int sum=0;
//        int leftSum=0;
//        for (int value : nums){
//            sum += value;
//        }
//        for (int i=0; i<nums.length; i++){
//            if (leftSum == sum - leftSum - nums[i]){
//                return new int[] {i};
//            } else {
//                sum += nums[i];
//            }
//        }
//        return new int[] {-1};
//    }

    public static void main (String[] args){
//        PivotIndex pivotIndex = new PivotIndex();
//        int[] nums = {1, 7, 3, 6, 5, 6};
//        int[] nums2 = {1,2,3};
//        System.out.println(Arrays.toString(p.solution(nums)));
//        System.out.println(Arrays.toString(pivotIndex.solution(nums2)));

        int[] nums = {1, 7, 3, 6, 5, 6};
        int[] nums2 = {0,5,-5};
        int[] nums3={};
        PivotIndex p=new PivotIndex();
        System.out.println(p.findPivotNumber(nums3));
//        System.out.println(Arrays.toString(p.solution3(nums)));

    }

//    public int solution2(int[] nums){
//       int sum=0, leftSum=0;
//       for(int value:nums){
//           sum+=value;
//       }
//       for(int i=0; i<nums.length; i++){
////           if(i==0||i==nums.length-1){
////               return -1;
////           }
//           if(leftSum==sum-leftSum-nums[i]){
//               return i;
//           } if(i==nums.length-1){
//               return -1;
//           } else {
//               leftSum+=nums[i];
//           }
//       }
//       return -1;
//    }

//    public int[] solution3 (int[] nums){
//        int sum=0;
//        int leftSum=0;
//        for (int value : nums){
//            sum += value;
//        }
//        for (int i=0; i<nums.length; i++){
//            if (leftSum == sum - leftSum - nums[i]){
//                return new int[] {i};
//            } else {
//                leftSum += nums[i];
//            }
//        }
//        return new int[] {-1};
//    }

//    public int solution3(int[] nums){
//        int sum=0, leftSum=0;
//        for(int value:nums){
//            sum+=value;
//        }
//        for(int i=0; i<nums.length; i++){
//            if(leftSum==sum-leftSum-nums[i]){
//                if(i==0||i==nums.length-1){
//                    return -1;
//                }
//                return i;
//            } else {
//                leftSum+=nums[i];
//            }
//        }
//        return -1;
//    }


    public int findPivotNumber(int[] nums){
        if(nums==null){
            return -1;
        }
        int sum=0, leftSum=0;

        for(int value:nums){
            sum+=value;
        }

        for(int i=0; i<nums.length; i++){
            if(leftSum==sum-leftSum-nums[i]){
                if(i==0||i==nums.length-1){
                    return -1;
                }
                return i;
            } else {
                leftSum+=nums[i];
            }
        }
        return -1;
    }
}
