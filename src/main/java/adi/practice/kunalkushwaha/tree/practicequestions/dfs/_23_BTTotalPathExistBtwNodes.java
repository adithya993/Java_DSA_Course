package adi.practice.kunalkushwaha.tree.practicequestions.dfs;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class _23_BTTotalPathExistBtwNodes {
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
        public List<List<Integer>> countPathExist(int sum, TreeNode root) {
            List<List<Integer>> paths = new ArrayList<>();
            List<Integer> path = new ArrayList<>();
            helperPathsExist(root, sum, path, paths);
            return paths;
        }

        public void helperPathsExist(TreeNode node, int sum, List<Integer> path, List<List<Integer>> paths){
            if(node == null){
                return;
            }

            path.add(node.val);

            if(node.val == sum && node.left == null && node.right == null){
                paths.add(new ArrayList<>(path));
            } else {
                helperPathsExist(node.left, sum-node.val, path, paths);
                helperPathsExist(node.right, sum-node.val, path, paths);
            }

            path.remove(path.size()-1);
        }
    }
}
