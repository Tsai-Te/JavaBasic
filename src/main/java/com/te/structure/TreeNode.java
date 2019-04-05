package com.te.structure;

public class TreeNode {
    public TreeNode left;
    public TreeNode right;
    public int value;

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public TreeNode(int val){ //constructor
        this.value=val;
    }
}
