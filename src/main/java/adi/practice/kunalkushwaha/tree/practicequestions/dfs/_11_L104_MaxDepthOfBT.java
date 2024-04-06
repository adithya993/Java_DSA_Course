package adi.practice.kunalkushwaha.tree.practicequestions.dfs;

public class _11_L104_MaxDepthOfBT {
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
        public int maxDepth1(TreeNode root) {
            // in this approach depth is directly calculated
            if(root == null){
                return 0;
            }

            int leftDepth = maxDepth1(root.left);
            int rightDepth = maxDepth1(root.right);

            int rootdepth = Math.max(leftDepth, rightDepth) + 1;
            return rootdepth;
        }

        int rootdepth = 0;
        public int maxDepth(TreeNode root) {
            // in this approach depth is calculated from height
            // ie depth = height + 1
            if(root == null){
                return 0;
            }
            rootdepth = height(root) + 1;
            return rootdepth;
        }

        public int height(TreeNode node){
            if(node == null){
                return -1;
            }

            int leftHeight = height(node.left);
            int rightHeight = height(node.right);

            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
}
