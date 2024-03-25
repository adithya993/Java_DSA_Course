package adi.practice.kunalkushwaha.tree.concepts.selfbalancingtree;

public class AVLTree {
    private Node root;
    public AVLTree(){}

    public void insert(int value){
        root = insert(value, root);
    }

    private Node insert(int value, Node node){
        if(node == null){
            return new Node(value);
        }

        if (value < node.value){
            node.left = insert(value, node.left);
        }

        if (value > node.value){
            node.right = insert(value, node.right);
        }

        node.height = Math.max(height(node.left),height(node.right))+1;

        return rotate(node);
    }

    private Node rotate(Node node){
        if(height(node.left) - height(node.right) > 1){
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
        if(height(node.left) - height(node.right) < -1){
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

    public Node leftRotate(Node c){
        Node p = c.right;
        Node t2 = p.left;
        p.left = c;
        c.right = t2;


        p.height = Math.max(height(p.left),height(p.right)) + 1;
        c.height = Math.max(height(c.left),height(c.right)) + 1;
        return p;
    }

    public Node rightRotate(Node p){
        Node c = p.left;
        Node t2 = c.right;
        c.right = p;
        p.left = t2;

        p.height = Math.max(height(p.left),height(p.right)) + 1;
        c.height = Math.max(height(c.left),height(c.right)) + 1;
        return c;
    }

    public int height(){
        return height(root);
    }
    private int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }


    public class Node{
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value){
            this.value = value;
        }

        public int getValue(){
            return value;
        }
    }

    public static class Main{
        public static void main(String[] args) {
            AVLTree obj = new AVLTree();
            for(int i = 0; i < 1000; ++i){
                obj.insert(i);
            }
            System.out.println(obj.height());
        }
    }
}
