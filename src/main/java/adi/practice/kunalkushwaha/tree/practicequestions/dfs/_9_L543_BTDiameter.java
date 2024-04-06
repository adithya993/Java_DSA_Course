package adi.practice.kunalkushwaha.tree.practicequestions.dfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _9_L543_BTDiameter {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
}
    class Solution {
        int maxDiameter = 0;
        public int diameterOfBinaryTree(TreeNode root) {
            height(root);
            return maxDiameter;
        }

        public int height(TreeNode node){
            if(node == null){
                return -1;
            }

            int leftHeight = height(node.left);
            int rightHeight = height(node.right);
            int nodalDiameter = leftHeight + rightHeight + 2;
            maxDiameter = Math.max(maxDiameter, nodalDiameter);
            int nodalHeight = Math.max(leftHeight, rightHeight) + 1;
            return nodalHeight;
        }
    }
}
