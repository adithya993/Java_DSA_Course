package adi.practice.kunalkushwaha.tree.concepts.binarytree;

import java.util.Stack;

public class BinaryTreeDFSUsingStack  {
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
        public void traverseUsingStack(TreeNode root){
            if(root == null){
                return;
            }
            Stack<TreeNode> stack = new Stack<>();
            stack.push(root);

            while(!stack.isEmpty()){
                TreeNode removed = stack.pop();
                System.out.println(removed.val + " ");
                if(removed.right!= null){
                    stack.push(removed.right);
                }
                if(removed.left!= null){
                    stack.push(removed.left);
                }
            }
        }
    }
}
