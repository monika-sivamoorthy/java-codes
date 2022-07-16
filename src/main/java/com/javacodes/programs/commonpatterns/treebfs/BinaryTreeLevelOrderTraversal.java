package com.javacodes.programs.commonpatterns.treebfs;

import java.util.*;



class BinaryTreeLevelOrderTraversal {
    public static List<List<Integer>> traverse(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();


        Queue<TreeNode> fifo = new LinkedList<>();

        fifo.add(root);
        while(!fifo.isEmpty()){
            int levelSize = fifo.size();
            List<Integer> levelValues = new ArrayList<>();
            for(int i = 0; i < levelSize; i++ ){
                TreeNode node = fifo.poll();
                levelValues.add(node.val);
                if(node.left!= null){
                    fifo.add(node.left);
                }
                if(node.right != null){
                    fifo.add(node.right);
                }
            }
            result.add(levelValues);
//             append the current level at the beginning for reverse level order traversal
//            result.add(0, levelValues);
        }


        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(9);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);
        List<List<Integer>> result = BinaryTreeLevelOrderTraversal.traverse(root);
        System.out.println("Level order traversal: " + result);
    }
}
