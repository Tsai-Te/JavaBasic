package com.te.algorithm.dfs;

public class DFS {
   public void traverse(TreeNode tn){
       if (tn != null){
           System.out.println(tn.value);
       }else return;
       if (tn.left != null){
           traverse(tn.left);{
               if (tn.right != null){
                   traverse(tn.right);
               }
           }
       }
   }

   public static void main (String[] args){
       TreeNode root=new TreeNode(1);
       TreeNode layer2_left_node=new TreeNode(2);
       TreeNode layer2_right_node=new TreeNode(3);

       root.setLeft(layer2_left_node);
       root.setRight(layer2_right_node);

//       root.left=layer2_left_node;
//       root.right=layer2_right_node;

       DFS dfs=new DFS();
       dfs.traverse(root);

//       testing
//       DFS dfs=new DFS();
       dfs.traverse(null);
   }

}
