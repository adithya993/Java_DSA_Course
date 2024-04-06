package adi.practice.kunalkushwaha.tree.practicequestions.dfs;

public class _14_L98_ValidateBT {
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
        public boolean isValidBST(TreeNode root) {
            return isValidBSTHelper(root, null, null);
        }

        public boolean isValidBSTHelper(TreeNode node, Integer low, Integer high){
            if(node == null){
                return true;
            }

            if(low != null && node.val <= low){
                return false;
            }

            if(high != null && node.val >= high){
                return false;
            }

            boolean left = isValidBSTHelper(node.left, low, node.val);

            boolean right = isValidBSTHelper(node.right, node.val, high);

            return left && right;
        }
    }
}
