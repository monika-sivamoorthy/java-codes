package com.javacodes.programs.commons.TreeDFS;

import java.util.*;

/**
 * Given a binary tree and a number ‘S’, find all paths from root-to-leaf such that the sum of all the node values of each path equals ‘S’.
 */
class AllPathsForSum {

    private static void findPathsHandler(TreeNode node, int sum, List<List<Integer>> allPaths, List<Integer> path){
        if (node == null){
            return;
        }
        List<Integer> currentPath = new ArrayList<>(path);
        currentPath.add(node.val);

        if (node.left == null && node.right == null && sum - node.val == 0){
            allPaths.add(currentPath);
        } else {
            findPathsHandler(node.left, sum-node.val, allPaths, currentPath);
            findPathsHandler(node.right, sum-node.val, allPaths, currentPath);
        }
    }

    public static List<List<Integer>> findPaths(TreeNode root, int sum) {
        List<List<Integer>> allPaths = new ArrayList<>();
        if(root == null){
            return allPaths;
        }
        List<Integer> currentPath = new ArrayList<>();
        findPathsHandler(root, sum, allPaths, currentPath);
        return allPaths;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);
        int sum = 23;
        List<List<Integer>> result = AllPathsForSum.findPaths(root, sum);
        System.out.println("Tree paths with sum " + sum + ": " + result);
    }
}