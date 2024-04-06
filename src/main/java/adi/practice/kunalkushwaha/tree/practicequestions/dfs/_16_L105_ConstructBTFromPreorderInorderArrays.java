package adi.practice.kunalkushwaha.tree.practicequestions.dfs;

import java.util.Arrays;

public class _16_L105_ConstructBTFromPreorderInorderArrays {
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
        public TreeNode buildTree(int[] preorder, int[] inorder) {
            if(preorder.length == 0){
                return null;
            }
            int rootValue = preorder[0];
            int index = 0;
            for(int  i = 0; i < inorder.length; ++i){
                if(inorder[i] == rootValue){
                    index = i;
                }
            }

            TreeNode root = new TreeNode(rootValue);
            root.left = buildTree(Arrays.copyOfRange(preorder, 1, index + 1), Arrays.copyOfRange(inorder, 0, index));
            root.right = buildTree(Arrays.copyOfRange(preorder, index + 1, preorder.length), Arrays.copyOfRange(inorder, index + 1, inorder.length));
            return root;
        }
    }
}
