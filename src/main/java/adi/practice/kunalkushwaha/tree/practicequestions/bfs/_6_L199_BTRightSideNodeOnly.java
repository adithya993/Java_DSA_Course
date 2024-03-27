package adi.practice.kunalkushwaha.tree.practicequestions.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _6_L199_BTRightSideNodeOnly {
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
        public List<Integer> rightSideView(TreeNode root) {
            List<Integer> answer = new ArrayList<>();
            if(root == null){
                return answer;
            }

            Queue<TreeNode> que = new LinkedList<>();
            que.offer(root);

            while(!que.isEmpty()){
                int levelSize = que.size();
                for(int i = 0; i < levelSize; ++i){
                    TreeNode popedNode = que.poll();
                    if(i == levelSize - 1){
                        answer.add(popedNode.val);
                    }
                    if(popedNode.left != null){
                        que.offer(popedNode.left);
                    }
                    if(popedNode.right != null){
                        que.offer(popedNode.right);
                    }
                }
            }
            return answer;
        }
    }
}
