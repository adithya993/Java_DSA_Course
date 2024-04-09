package adi.practice.kunalkushwaha.tree.practicequestions.dfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class _22_BTTotalPathSumExistBtwNodes {
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
        public int countPathExist(int sum, TreeNode root) {
            List<Integer> path = new ArrayList<>();
            return helperCountPathExist(root, sum, path);
        }

        public int helperCountPathExist(TreeNode node, int sum, List<Integer> path){
            if(node == null){
                return 0;
            }

            path.add(node.val);

            int count = 0;
            int s = 0;

            ListIterator<Integer> itr = path.listIterator(path.size());
            while (itr.hasPrevious()){
                s += itr.previous();

                if(s == sum){
                    count++;
                }
            }

            count += helperCountPathExist(node.left, sum, path) + helperCountPathExist(node.right, sum, path);

            path.remove(path.size()-1);
            return count;
        }
    }
}
