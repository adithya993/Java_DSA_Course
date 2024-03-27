package adi.practice.kunalkushwaha.tree.practicequestions.bfs;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _7_L993_BTRightSideNodeOnly {
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
        public boolean isCousins(TreeNode root, int x, int y) {
            TreeNode xNode = findNode(root, x);
            TreeNode yNode = findNode(root, y);

            return (
                    (level(root, xNode, 0) == level(root, yNode, 0)) && (!isSibling(root, xNode, yNode))
                    );
        }

        public TreeNode findNode(TreeNode nodeStart, int finderValue){
            if(nodeStart == null){
                return null;
            }
            if(nodeStart.val == finderValue){
                return nodeStart;
            }

            TreeNode searchLeft = findNode(nodeStart.left, finderValue);
            if(searchLeft != null){
                return searchLeft;
            }
            return findNode(nodeStart.right, finderValue);
        }

        public boolean isSibling(TreeNode startNode, TreeNode xNode, TreeNode yNode){
            if(startNode == null){
                return false;
            }
            return (
                    (startNode.left == xNode && startNode.right == yNode) ||
                    (startNode.left == yNode && startNode.right == xNode) ||
                    isSibling(startNode.left, xNode, yNode) ||
                    isSibling(startNode.right, xNode, yNode)
            );
        }

        public int level(TreeNode startNode, TreeNode finderNode, int level){
            if(startNode == null){
                return 0;
            }
            if(finderNode == startNode){
                return level;
            }
            int leftLevel = level(startNode.left, finderNode, level+1);
            return leftLevel!=0?leftLevel:level(startNode.right, finderNode, level+1);

        }
    }
}
