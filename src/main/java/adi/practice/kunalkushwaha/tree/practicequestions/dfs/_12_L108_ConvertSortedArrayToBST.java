package adi.practice.kunalkushwaha.tree.practicequestions.dfs;

public class _12_L108_ConvertSortedArrayToBST {
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
        public TreeNode sortedArrayToBST(int[] nums) {
            TreeNode root = new TreeNode(nums[0]);
            for(int i = 1; i < nums.length; i++){
                root = insert(nums[i], root);
            }
            return root;
        }


        // This is Binary Tree approach Start
        public TreeNode insert(int value, TreeNode node){
            if(node == null){
                return new TreeNode(value);
            }
            if(value < node.val){
                node.left = insert(value, node.left);
            }else {
                node.right = insert(value, node.right);
            }

            int leftHeight = height(node.left);
            int rightHeight = height(node.right);
            return rotateCurNode(node, leftHeight, rightHeight);
        }

        public int height(TreeNode node){
            if(node == null){
                return -1;
            }
            int leftHeight = height(node.left);
            int rightHeight = height(node.right);

            return Math.max(leftHeight, rightHeight) + 1;
        }

        public TreeNode rotateCurNode(TreeNode node, int leftHeight, int rightHeight) {
            if(leftHeight - rightHeight > 1){
                //write check condition for left heavy
                //ie Case 1 & Case 2 - LL || LR
                if(height(node.left.left) - height(node.left.right) > 0){
                    //Case1: LL
                    return rightRotate(node);
                }
                if(height(node.left.left) - height(node.left.right) < 0) {
                    //Case2: LR
                    node.left = leftRotate(node.left);
                    return rightRotate(node);
                }
            }
            if(leftHeight - rightHeight < -1){
                //write check condition for right heavy
                //ie Case 3 & Case 4 - RR || RL
                if(height(node.right.left) - height(node.right.right) < 0){
                    //Case3: RR
                    return leftRotate(node);
                }
                if(height(node.right.left) - height(node.right.right) > 0) {
                    //Case4: RL
                    node.right = rightRotate(node.right);
                    return leftRotate(node);
                }
            }
            return node;
        }

        public TreeNode leftRotate(TreeNode c){
            TreeNode p = c.right;
            TreeNode t2 = p.left;
            p.left = c;
            c.right = t2;
            return p;
        }

        public TreeNode rightRotate(TreeNode p){
            TreeNode c = p.left;
            TreeNode t2 = c.right;
            c.right = p;
            p.left = t2;
            return c;
        }
        // This is Binary Tree approach End

        // This is Binary Search approach Start
        // This is Binary Search approach, since it is mentioned Sorted Array
        public TreeNode sortedArrayToBST1(int[] nums) {
            TreeNode root = addElementsIntoTree(nums, 0, nums.length - 1);
            return root;
        }

        public TreeNode addElementsIntoTree(int[] nums, int start, int end){
            if(start > end){
                return null;
            }
            int mid = start + (end - start) / 2;
            TreeNode node = new TreeNode(nums[mid]);
            node.left = addElementsIntoTree(nums, start, mid-1);
            node.right = addElementsIntoTree(nums, mid+1, end);
            return node;
        }
        // This is Binary Search approach End

    }
}
