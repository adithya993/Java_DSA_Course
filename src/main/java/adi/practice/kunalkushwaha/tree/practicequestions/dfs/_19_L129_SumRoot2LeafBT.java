package adi.practice.kunalkushwaha.tree.practicequestions.dfs;

public class _19_L129_SumRoot2LeafBT {
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
        public int sumNumbers(TreeNode root) {
            return helperSumNumbers(root,0);
        }

        public int helperSumNumbers(TreeNode node, int targetSum){
            if(node == null){
                return 0;
            }

            targetSum += node.val;
            if(node.left == null && node.right == null){
                return targetSum;
            }

            int left = helperSumNumbers(node.left, targetSum*10);

            int right = helperSumNumbers(node.right, targetSum*10);
            return left+right;
        }
    }
}
