package com.te.algorithm.bfs;

public class TreeNode {
    public int value;
    public TreeNode right;
    public TreeNode left;

//    public TreeNode(){}

    public TreeNode(int value){
        this.value=value;
    }

    public int getValue(){return value;}
    public void setValue(int value){this.value=value;}

    public TreeNode getLeft(){return left;}
    public void setLeft(TreeNode left){this.left=left;}

    public TreeNode getRight(){return right;}
    public void setRight(TreeNode right){this.right=right;}

}
