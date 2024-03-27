package adi.practice.kunalkushwaha.tree.practicequestions.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _0_L102_BTLevelOrderTraversal {
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
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> answer = new ArrayList<>();
            if(root == null){
                return answer;
            }

            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);

            while(!queue.isEmpty()){
                int levelSize = queue.size();
                List<Integer> currentLevelNode = new ArrayList<>(levelSize);
                for(int i = 0; i < levelSize; ++i){
                    TreeNode removedNode = queue.poll();
                    currentLevelNode.add(removedNode.val);
                    if(removedNode.left != null){
                        queue.add(removedNode.left);
                    }
                    if(removedNode.right != null){
                        queue.add(removedNode.right);
                    }
                }
                answer.add(currentLevelNode);
            }
            return answer;
        }
    }
}
