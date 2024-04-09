package adi.practice.kunalkushwaha.tree.practicequestions.dfs;

public class _20_L124_BTMaxPathSum {
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
        int globalMax = Integer.MIN_VALUE;
        public int maxPathSum(TreeNode root) {
            int rootSum = helperMaxPathSum(root);
            return Math.max(globalMax, rootSum);
        }

        public int helperMaxPathSum(TreeNode node){
            if(node == null){
                return 0;
            }
            int leftSum = Math.max(helperMaxPathSum(node.left),0);
            int rightSum = Math.max(helperMaxPathSum(node.right),0);
            int curNodeSum = node.val + leftSum + rightSum;
            globalMax = Math.max(globalMax, curNodeSum);
            return node.val + Math.max(leftSum, rightSum);
        }
    }
}
