package adi.practice.kunalkushwaha.tree.practicequestions.dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _18_L112_PathSumBT {
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
    public class Solution {
        public boolean hasPathSum(TreeNode root, int targetSum) {
        /*if(root == null){
            return false;
        }*/
            if(helperHasPathSum(root, targetSum)){
                return true;
            }
            return false;
        }

        public boolean helperHasPathSum(TreeNode node, int targetSum){
            if(node != null && node.val == targetSum && node.left == null && node.right == null){
                return true;
            }

            if(node != null && helperHasPathSum(node.left, targetSum - node.val)){
                return true;
            }
            if(node != null && helperHasPathSum(node.right, targetSum - node.val)){
                return true;
            }
            return false;
        }
    }
}
