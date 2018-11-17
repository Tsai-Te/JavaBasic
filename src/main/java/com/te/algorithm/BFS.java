package com.te.algorithm;

import com.te.structure.TreeNode;

import java.util.*;

public class BFS {

//    public List<Integer> treeNode(int n) {
//        Queue<BFS> queue = new LinkedList<>();
//        List<Integer> result = new ArrayList<>();
//        queue.offer();
//    }


    public static void main(int[] args){
        TreeNode rootOnLayer1_5=new TreeNode(5);
        TreeNode rootOnLayer2_3=new TreeNode(3);
        TreeNode rootOnLayer2_7=new TreeNode(7);
        rootOnLayer1_5.setLeft(rootOnLayer2_3);
        rootOnLayer1_5.setRight(rootOnLayer2_7);
        TreeNode rootOnLayer3_5=new TreeNode(5);
        TreeNode rootOnLayer3_1=new TreeNode(1);
        TreeNode rootOnLayer3_9=new TreeNode(9);
        rootOnLayer2_3.setLeft(rootOnLayer3_5);
        rootOnLayer2_3.setRight(rootOnLayer3_1);
        rootOnLayer2_7.setRight(rootOnLayer3_9);
        TreeNode rootOnLayer4_6=new TreeNode(6);
        rootOnLayer3_9.setLeft(rootOnLayer4_6);
    }


}









