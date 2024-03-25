package adi.practice.kunalkushwaha.tree.concepts.binarytree;

import java.util.Scanner;

public class BinaryTreePreOrder {
    private Node root;
    public BinaryTreePreOrder(){

    }

    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    //insert elements
    public void bulkInitBinaryTreePreOrder(int[] nums){
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

    public void populate(Scanner scanner){
        System.out.println("Enter the root node value: ");
        int value = scanner.nextInt();
        this.root = new Node(value);
        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node){
        System.out.println("Do you want to enter left of '" + node.value + "'? ");
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value of the left of '" + node.value + "': ");
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }

        System.out.println("Do you want to enter right of '" + node.value + "'? ");
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value of the right of '" + node.value + "': ");
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }

    public void display(){
        display(root,"");
    }



    private void display(Node node, String indent){
        if(node == null){
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
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
            System.out.println("|------- >" + node.value);
        } else {
            System.out.println(node.value);
        }

        prettyDisplay(node.left, level + 1);
    }

    public void preOrder(){
        System.out.println("Pre-Order:");
        preOrder(root);
    }

    private void preOrder(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
    private static class Node{
        private int value;
        private Node left;
        private Node right;

        private int height;

        public Node(int value){
            this.value = value;
        }
    }
    public static class Main{
        public static void main(String[] args) {
            BinaryTreePreOrder tree = new BinaryTreePreOrder();
            tree.bulkInitBinaryTreePreOrder(new int[] {5, 2, 7, 1, 4, 6, 9, 8, 3, 10});
            tree.prettyDisplay();
            tree.preOrder();
        }
    }
}
