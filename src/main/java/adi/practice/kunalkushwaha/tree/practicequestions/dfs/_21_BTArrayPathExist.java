package adi.practice.kunalkushwaha.tree.practicequestions.dfs;

public class _21_BTArrayPathExist {
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
        public boolean arrPathExist(int[] arr, TreeNode root) {
            if(root == null){
                return arr.length == 0;
            }
            return helperArrPathExist(arr, root, 0);
        }

        public boolean helperArrPathExist(int[] arr, TreeNode node, int index){
            if(node == null){
                return false;
            }
            if(index >= arr.length || node.val != arr[index]){
                return false;
            }

            if(node.left == null && node.right == null && index == arr.length - 1){
                return true;
            }
            return helperArrPathExist(arr, node.left, index+1) || helperArrPathExist(arr, node.right, index+1);
        }
    }
}
