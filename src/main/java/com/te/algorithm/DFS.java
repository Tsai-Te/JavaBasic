package com.te.algorithm;

import com.te.structure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DFS {
    public List<Integer> treeNode(int n){
        List<Integer> list=new ArrayList<>();
        return list;
    }

    public void traverse(TreeNode treeNode){
        if(treeNode.getLeft()!=null){
            System.out.println("traversing left node: "+treeNode.getLeft().getValue());
            traverse(treeNode.getLeft());
        }
        if(treeNode.getRight()!=null){
            System.out.println("traversing right node: "+treeNode.getRight().getValue());
            traverse(treeNode.getRight());
        }
        System.out.println(treeNode.getValue());
    }


    public static void main(String[] args){
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

        DFS dfs=new DFS();
        dfs.traverse(rootOnLayer1_5);
//        System.out.println(dfs);
    }
}
