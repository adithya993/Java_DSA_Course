package adi.practice.kunalkushwaha.tree.practicequestions.dfs;

public class _15_L236_BTLowestCommonAncestor {
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
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if(root == null){
                return root;
            }

            if(root == p || root == q){
                return root;
            }

            TreeNode left = lowestCommonAncestor(root.left, p, q);
            TreeNode right = lowestCommonAncestor(root.right, p, q);

            if(left != null && right != null){
                return root;
            }
            if(left != null && right == null){
                return left;
            }
            if(left == null && right != null){
                return right;
            }
            return null;
        }
    }
}
