package adi.practice.kunalkushwaha.tree.practicequestions.dfs;

public class _13_L114_FlattenBTToLinkedList {
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
        public void flatten(TreeNode root) {
            if(root == null){
                return;
            }

            TreeNode workerNode = root;
            while(workerNode != null){
                if(workerNode.left != null){
                    TreeNode findingRightMostNode = workerNode.left;
                    while(findingRightMostNode.right != null){
                        findingRightMostNode = findingRightMostNode.right;
                    }
                    if(workerNode.right != null){
                        findingRightMostNode.right = workerNode.right;
                    }
                    workerNode.right = workerNode.left;
                    workerNode.left = null;
                }
                workerNode = workerNode.right;
            }
        }
    }
}
