package com.te.javaBasic.Homework;

import java.util.Arrays;

public class PlusOne {
//    Boolean a ="hello" == "hello";
//    public int[] solution (int[] nums){
//        int addOn=1;
//        for (int i=nums.length-1; i>-1; i--){
//            int value = nums[i] + addOn;
//            addOn=value/10;
//            value=value%10;
//            nums[i] = value;
//        }
//        if(addOn!=1)
//
//            return nums;
//
//        int res [] = new int [nums.length+1];
//        res[0]=addOn;
//        for(int i=1;i<res.length;i++)
//        {
//            res[i]=nums[i-1];
//        }
//
//        return res;
//    }

//    public int[] solution2(int[] digits) {
//        //Increment each digit appropriately.
//        for (int i = digits.length-1; i > -1; i--) {
//            if (digits[i] == 9)
//                digits[i] = 0;
//            else {
//                digits[i] = digits[i]+1;
//                break;
//            }
//        }
//
//        //If the first digit is not a zero,
//        //then no need to append a 1 at the start
//        //Ex. 123 becomes 124
//        if (digits[0] != 0) {
//            return digits;
//        }
//
//        //This number requires an extra digit because
//        //it contains only 9's
//        //Ex. 999 becomes 1000
//        int[] newDigits = new int[digits.length+1];
//        newDigits[0] = 1;
//        for (int i = 1; i < newDigits.length; i++) {
//            newDigits[i] = digits[i-1];
//        }
//        return newDigits;
//    }

//    public int[] solution2 (int[] nums){
//        for (int i = nums.length-1; i>-1; i--){
//            if (nums[i] == 9) nums[i] = 0;
//            else{
//                nums[i] += 1;
//                break;
//            }
//        }
//        if (nums[0] != 0) {
//            return nums;
//        }
//        int[] newNums = new int[nums.length+1];
//        newNums[0] = 1;
//        for (int i=0; i<newNums.length; i++){
//            newNums[i]=nums[i-1];
//        }
//        return newNums;
//    }

//    public int[] solution3 (int[] nums) {
//        for (int i=nums.length-1; i>-1; i--){
//            if (nums[i] != 9){
//                nums[i]++;
//                return nums;
//            } else {
//                nums[i] = 0;
//            }
//        }
//        int[] newNums = new int[nums.length+1];
//        newNums[0] = 1;
//        return newNums;
//    }
//
//
//    public static void main(String[] args){
//        PlusOne plusOne=new PlusOne();
//        int[] nums = {9,9,9,9};
////        System.out.println(Arrays.toString(plusOne.solution(nums)));
////        System.out.println(Arrays.toString(plusOne.solution2(nums)));
//        System.out.println(Arrays.toString(plusOne.solution3(nums)));
//    }

//    public static void main(String[] args){
//        int[] a={9,9,9,9};
//        PlusOne p=new PlusOne();
//        System.out.println(Arrays.toString(p.plusOne(a)));
//    }
//
//
//    public int[] plusOne(int[] nums){
//        for(int i=nums.length-1; i>=0; i--){
//            if(nums[i]!=9){
//                nums[i]++;
//                return nums;
//            } else {
//                nums[i] = 0;
//            }
//        }
//        int[] newNums=new int[nums.length+1];
//        newNums[0]=1;
//        return newNums;
//    }

//    public static void main(String[] args) {
//        int[] arr={9,9,9,9};
//        PlusOne p=new PlusOne();
//        System.out.println(Arrays.toString(p.solution(arr)));
//    }
//
//    public int[] solution(int[] nums){
//        for(int i=nums.length-1; i>=0; i--){
//            if(nums[i]!=9){
//                nums[i]++;
//                return nums;
//            } else {
//                nums[i]=0;
//            }
//        }
//        int[] newNums=new int[nums.length+1];
//        newNums[0]=1;
//        return newNums;
//    }

//    public static void main(String[] args) {
//        int[] a={9,9,9};
//        PlusOne p=new PlusOne();
//        System.out.println(Arrays.toString(p.solution2(a)));
//    }
//
//    public int[] solution2(int[] nums){
//        for(int i=nums.length-1; i>-1; i--){
//            if(nums[i]==9){
//                nums[i]=0;
//            } else {
//                nums[i]++;
//                return nums;
//            }
//        }
//        int[] newNums=new int[nums.length+1];
//        newNums[0]=1;
//        return newNums;
//    }


}

//int arrayConvertToInteger (int[] nums){
//
//}
//int[] integerConvertToArray (int i) {
//
//}

//if
