package adi.practice.kunalkushwaha.tree.practicequestions.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _1_L637_BTLevelAverage {
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
        public List<Double> averageOfLevels(TreeNode root) {
            if(root == null){
                return null;
            }
            List<Double> answer = new ArrayList<>();
            Queue<TreeNode> que = new LinkedList<>();
            que.offer(root);

            while(!que.isEmpty()){
                int queSize = que.size();
                Double curLevelAverage = 0.0;
                for(int i = 0; i < queSize; ++i){
                    TreeNode popedNode = que.poll();
                    curLevelAverage += popedNode.val;
                    if(popedNode.left!=null){
                        que.add(popedNode.left);
                    }
                    if(popedNode.right!=null){
                        que.add(popedNode.right);
                    }
                }
                answer.add(curLevelAverage/queSize);
            }
            return answer;
        }
    }
}
