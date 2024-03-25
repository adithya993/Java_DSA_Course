package adi.practice.kunalkushwaha.tree.concepts.segmenttree;

public class SegmentTree {
    private static class Node{
        int data;
        int startInterval;
        int endInterval;
        Node left;
        Node right;

        public Node(int startInterval, int endInterval){
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }
    Node root;
    public SegmentTree(int[] arr){
        //create a tree for the input
        root = constructTree(arr, 0, arr.length - 1);
    }

    private Node constructTree(int[] arr, int start, int end){
        if(start == end){
            Node newNode = new Node(start, end);
            newNode.data = arr[start];
            return newNode;
        }
        Node newNode = new Node(start, end);
        int mid = (start + end) / 2;
        Node left = constructTree(arr, start, mid);
        Node right = constructTree(arr, mid+1, end);
        newNode.data = left.data + right.data;
        newNode.left = left;
        newNode.right = right;
        return newNode;
    }

    public void display(){
        display(root);
    }

    private void display(Node node){
        String str = "";

        if(node.left != null){
            str = str + "Interval = [" + node.left.startInterval + "-" + node.left.endInterval + "] and data: " + node.left.data + " => ";
        } else {
            str = str + "No left child";
        }

        str = str + "Interval = [" + node.startInterval + "-" + node.endInterval + "] and data: " + node.data + " <= ";

        if(node.right != null){
            str = str + "Interval = [" + node.right.startInterval + "-" + node.right.endInterval + "] and data: "+ node.right.data;
        } else {
            str = str + "No right child";
        }

        System.out.println(str);

        if(node.left!=null){
            display(node.left);
        }
        if(node.right!=null){
            display(node.right);
        }
    }

    public int query(int queryStartIndex, int queryEndIndex){
        return query(root, queryStartIndex, queryEndIndex);
    }

    private int query(Node node, int queryStartIndex,int queryEndIndex){
        //case 1: node interval is inside query interval
        if((node.startInterval >= queryStartIndex) && (node.endInterval <= queryEndIndex)){
            return node.data;
        } else if((node.startInterval > queryEndIndex) || (node.endInterval <  queryStartIndex)){
            return 0;
        } else {
            return query(node.left, queryStartIndex, queryEndIndex) + query(node.right, queryStartIndex, queryEndIndex);
        }

    }

    public void update(int index, int value){
        root.data = update(root, index, value);
    }
    private int update(Node node, int index, int value){
        if(index >= node.startInterval && index <= node.endInterval){
            if(index == node.startInterval && index == node.endInterval){
                node.data = value;
            } else {
                node.data = update(node.left, index, value) + update(node.right, index, value);
            }
            return node.data;
        }
        return node.data;
    }

    public static void main(String[] args) {
        int[] arr = {3,8,6,7,-2,-8,4,9};
        SegmentTree tree = new SegmentTree(arr);
        tree.display();
        System.out.println(tree.query(1,6));
        tree.update(2,10);
        tree.display();
    }
}
