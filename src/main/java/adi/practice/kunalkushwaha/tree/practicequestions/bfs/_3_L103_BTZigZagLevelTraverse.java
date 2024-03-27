package adi.practice.kunalkushwaha.tree.practicequestions.bfs;

import java.util.*;

public class _3_L103_BTZigZagLevelTraverse {
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
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            List<List<Integer>> answer = new ArrayList<>();
            if(root == null){
                return answer;
            }

            Deque<TreeNode> que = new LinkedList<>();
            que.offer(root);
            boolean reverse = false;
            while(!que.isEmpty()){
                int queSize = que.size();
                List<Integer> curLevel = new ArrayList<>(queSize);
                for(int i = 0; i < queSize; ++i){
                    if(!reverse){
                        TreeNode popedNode = que.pollFirst();
                        if(popedNode.left!=null){
                            que.addLast(popedNode.left);
                        }
                        if(popedNode.right!=null){
                            que.addLast(popedNode.right);
                        }
                        curLevel.add(popedNode.val);
                    } else {
                        TreeNode popedNode = que.pollLast();

                        if(popedNode.right!=null){
                            que.addFirst(popedNode.right);
                        }
                        if(popedNode.left!=null){
                            que.addFirst(popedNode.left);
                        }
                        curLevel.add(popedNode.val);
                    }
                }
                reverse = !reverse;
                answer.add(curLevel);
            }
            return answer;
        }
    }
}
