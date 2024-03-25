package adi.practice.kunalkushwaha.linkedlist.practicequestions;

public class _0_InsertToLinkedListByRecursion {
    public static class CustomLinkedList {
        private Node head;
        private Node tail;

        private int size;

        public CustomLinkedList(){
            this.size = 0;
        }

        public void insertAtFirstPosition(int val){
            Node newNode = new Node(val, head);
            this.head = newNode;

            if(tail == null) {
                tail = head;
            }

            size += 1;
        }

        public void insertAtMiddlePositions(int val, int index){
            if(index == 0){
                insertAtFirstPosition(val);
            } else if(index == size){
                insertAtLastPosition(val);
            } else if(index>0 && index<size){
                Node newNode = new Node(val);
                int i = 0;
                Node traverseNode = head;
                while(traverseNode.next != null && i < index){
                    if(i+1==index){
                        newNode.next = traverseNode.next;
                        traverseNode.next = newNode;
                    } else {
                        traverseNode = traverseNode.next;
                    }
                    i++;

                }

                size += 1;
            } else {
                System.out.println("Out of bound");
            }
        }

        public void insertAtLastPosition(int val) {
            if(tail == null){
                insertAtFirstPosition(val);
            } else {
                Node newNode = new Node(val);
                tail.next = newNode;
                tail = newNode;
                size += 1;
            }
        }

        //insert using recursion
        public void insertUsingRecursion(int val, int index){
            head = insertUsingRecursion(val, index, head);
        }
        private Node insertUsingRecursion(int val, int counter, Node node){
            if(counter == 0){
                Node workerNode = new Node(val, node);
                size++;
                return workerNode;
            }
            node.next = insertUsingRecursion(val,counter-1,node.next);
            return node;
        }

        public void deleteAtFirst(){
            int val = head.value;
            head = head.next;
            if(head == null){
                tail = null;
            }
            size--;
            System.out.println("Deleted node:"+val);
        }

        public void deleteAtMiddlePosition(int position){
            if(position == 0){
                deleteAtFirst();
            } else if(position == size){
                deleteAtLastPosition();
            } else if(position > 0 && position < size){
                Node workerNode = getNode(position - 1);
                int val = workerNode.next.value;
                workerNode.next = workerNode.next.next;
                size--;
                System.out.println("Deleted node:"+val);
            } else {
                System.out.println("Out of bound");
            }
        }

        public void deleteAtLastPosition(){
            if(size <= 1){
                deleteAtFirst();
            } else {
                Node workerNode = getNode(size-1);
                workerNode.next = null;
                System.out.println("Deleted node:"+tail.value);
                tail = workerNode;
                size--;
            }
        }

        public Node getNode(int elementPosition){
            Node travNod = head;
            for(int i = 1; i < elementPosition;++i){
                travNod = travNod.next;
            }
            return travNod;
        }

        public void displayLinkedList(){
            Node temp = head;
            while(temp != null){
                System.out.print(" "+ temp.value + " ->" );
                temp = temp.next;
            }
            System.out.println(" END");
        }


        private class Node {
            private int value;
            private Node next;

            public Node(int val){
                this.value = val;
            }

            public Node(int val, Node nextNod){
                this.value = val;
                this.next = nextNod;
            }
        }
    }

    public static void main(String[] args) {
        CustomLinkedList llist1 = new CustomLinkedList();
        llist1.insertAtFirstPosition(3);
        llist1.insertAtFirstPosition(2);
        llist1.insertAtFirstPosition(8);
        llist1.insertAtFirstPosition(17);
        llist1.insertUsingRecursion(88,2);
        llist1.displayLinkedList();
    }
}
