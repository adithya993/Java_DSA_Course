package adi.practice.kunalkushwaha.tree.concepts.binarytree;

public class BinarySearchTree {
    private Node root;
    public BinarySearchTree(){}

    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void display(){
        display(root, "Root Node: ");
    }

    private void display(Node node, String details){
        if(node == null){
            return;
        }

        System.out.println(details + node.getValue());

        display(node.left, "Left child of " + node.getValue() + ": ");
        display(node.right, "Right child of " + node.getValue() + ": ");
    }

    public void prettyDisplay(){
        prettyDisplay(root,0);
    }



    private void prettyDisplay(Node node, int level){
        if(node == null){
            return;
        }

        prettyDisplay(node.right, level + 1);

        if(level != 0){
            for(int i = 0; i < level - 1; ++i){
                System.out.print("|\t\t");
            }
            System.out.println("|------->" + node.value);
        } else {
            System.out.println(node.value);
        }

        prettyDisplay(node.left, level + 1);
    }

    public void bulkInitBinarySearchTreeFromSortedArray(int[] nums){
        bulkInitBinarySearchTreeFromSortedArray(nums, 0, nums.length);
    }

    private void bulkInitBinarySearchTreeFromSortedArray(int[] nums, int start, int end){
        if(start>=end){
            return;
        }
        int mid = start + (end-start)/2;
        this.insert(nums[mid]);
        bulkInitBinarySearchTreeFromSortedArray(nums, start, mid);
        bulkInitBinarySearchTreeFromSortedArray(nums, mid + 1, end);
    }

    public void bulkInitBinarySearchTree(int[] nums){
        for (int value: nums) {
            this.insert(value);
        }
    }

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

        return node;
    }

    public boolean balanced(){
        return balanced(root);
    }

    private boolean balanced(Node node){
        if(node == null){
            return true;
        }
        return Math.abs(height(node.left)-height(node.right))<=1 && balanced(node.left) && balanced(node.right);
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
            BinarySearchTree obj = new BinarySearchTree();
            obj.bulkInitBinarySearchTree(new int[] {5, 2, 7, 1, 4, 6, 9, 8, 3, 10});
            obj.display();
            obj.prettyDisplay();

            BinarySearchTree obj1 = new BinarySearchTree();
            obj1.bulkInitBinarySearchTreeFromSortedArray(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
            obj1.display();
            obj1.prettyDisplay();
        }
    }
}
