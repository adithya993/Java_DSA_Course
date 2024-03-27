package adi.practice.kunalkushwaha.tree.practicequestions.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _2_BTLevelNextNeighbor {
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
        public TreeNode nextNeighborOfKeyInLevel(TreeNode root, int key) {
            if(root == null){
                return null;
            }
            //List<Double> answer = new ArrayList<>();
            Queue<TreeNode> que = new LinkedList<>();
            que.offer(root);

            while(!que.isEmpty()){
                TreeNode popedNode = que.poll();
                if(popedNode.left!=null){
                    que.add(popedNode.left);
                }
                if(popedNode.right!=null){
                    que.add(popedNode.right);
                }
                if(popedNode.val == key){
                    break;
                }
            }
            return que.peek();
        }
    }
}
