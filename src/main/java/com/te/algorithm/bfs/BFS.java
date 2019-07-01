package com.te.algorithm.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
    public void solution(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
//        List<TreeNode> result=new ArrayList<>();
        q.offer(root);
        while (!q.isEmpty()) {
//            int temp=0; //??? what is temp
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode n = q.poll();
                System.out.println(n.value);
//                if (n.value>=n){ //???
////                    n=n.value;
//                }
////                if (n.left != null){
                if (!(n.left == null)) {
                    q.offer(n.left);
                }
//                if (n.right != null){
                if (!(n.right == null)) {
                    q.offer(n.right);
                }
            }
        }
    }

    public void traverse(TreeNode root){
        Queue q=new LinkedList();
        q.offer(root);
        while (!q.isEmpty()){

        }
    }

    public static void main(String[] arg){
        BFS bfs=new BFS();
        TreeNode root=new TreeNode(1);
        TreeNode left=new TreeNode(3);
        TreeNode right=new TreeNode(4);
        root.setLeft(left);
        root.setRight(right);
        TreeNode leftLeft=new TreeNode(6);
        TreeNode leftRight=new TreeNode(7);
        left.setLeft(leftLeft);
        left.setRight(leftRight);
        TreeNode rightRight=new TreeNode(8);
        right.setRight(rightRight);
        bfs.solution(root);
    }
}

//            result.add(n);

//        System.out.println();
//        return result;




