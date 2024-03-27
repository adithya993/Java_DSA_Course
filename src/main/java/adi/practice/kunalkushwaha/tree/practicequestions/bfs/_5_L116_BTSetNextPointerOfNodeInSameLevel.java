package adi.practice.kunalkushwaha.tree.practicequestions.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _5_L116_BTSetNextPointerOfNodeInSameLevel {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }
    class Solution {
        public Node connect(Node root) {
            if(root == null){
                return null;
            }

            Node tempStartNode = root;

            while(tempStartNode.left != null){
                Node curLevelNode = tempStartNode;
                while(curLevelNode != null){
                    curLevelNode.left.next = curLevelNode.right;
                    if(curLevelNode.next != null){
                        curLevelNode.right.next = curLevelNode.next.left;
                    }
                    curLevelNode = curLevelNode.next;
                }
                tempStartNode = tempStartNode.left;
            }
            return root;
        }

        //queue approach - O(n) space complexity
        public Node connect1(Node root) {
            Queue<Node> queue = new LinkedList<>();
            queue.offer(root);

            while(!queue.isEmpty()){
                int levelSize = queue.size();
                List<Node> currentLevelNode = new ArrayList<>(levelSize);
                for(int i = 0; i < levelSize; ++i){
                    Node removedNode = queue.poll();
                    if(removedNode!= null){
                        currentLevelNode.add(removedNode);
                        if(removedNode.left != null){
                            queue.add(removedNode.left);
                        }
                        if(removedNode.right != null){
                            queue.add(removedNode.right);
                        }
                    }
                }
                for(int i = 0; i < currentLevelNode.size() - 1; ++i){
                    currentLevelNode.get(i).next = currentLevelNode.get(i+1);
                }
            }
            return root;
        }
    }
}
