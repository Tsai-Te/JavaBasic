package com.te.algorithm.dfs.practice;

public class Dfs {
    public void traverse(TreeNode tn){
       if(tn!=null){
           System.out.println(tn.value);
       } else return;

       if(tn.left!=null){
           traverse(tn.left);{
               if(tn.right!=null){
                   traverse(tn.right);{
                       traverse(tn.right);
                   }
               }
           }
       }
    }

    public static void main(String[] args) {
        Dfs dfs=new Dfs();
        TreeNode root=new TreeNode(1);
        TreeNode layer2_left=new TreeNode(3);
        TreeNode layer2_right=new TreeNode(5);
        root.left=layer2_left;
        root.right=layer2_right;
        TreeNode layer3_left_left=new TreeNode(2);
        TreeNode layer3_left_right=new TreeNode(4);
        layer2_left.left=layer3_left_left;
        layer2_left.right=layer3_left_right;
        TreeNode layer3_right_right=new TreeNode(6);
        layer2_right.right=layer3_right_right;
        dfs.traverse(root);
    }
}
