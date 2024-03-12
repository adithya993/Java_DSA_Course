package adi.practice.kunalkushwaha.linkedlist.examplecircularlinkedlist;

import adi.practice.kunalkushwaha.linkedlist.examplecustomdoublylinkedlist.CustomDoublyLinkedList;

public class CustomCircularLinkedList {
    private Node head;
    private Node tail;
    private int size;
    public CustomCircularLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void insertAtFirstPosition(int val){
        Node workerNode = new Node(val);
        if(head == null){
            head = workerNode;
            tail = workerNode;
            return;
        }
        tail.next = workerNode;
        workerNode.next = head;
        head = workerNode;
        size++;
    }

    public void insertAtLastPosition(int val){
        Node workerNode = new Node(val);
        if(head == null){
            head = workerNode;
            tail = workerNode;
            return;
        }
        tail.next = workerNode;
        workerNode.next = head;
        tail = workerNode;
        size++;
    }

    public void delete(int val){
        Node workerNode = head;
        if(workerNode == null){
            return;
        }

        if(workerNode.val == val){
            head = head.next;
            tail.next = head;
            return;
        }

        do{
            if(workerNode.next.val == val){
                workerNode.next = workerNode.next.next;
                break;
            }
            workerNode = workerNode.next;
        } while(workerNode != head);


    }

    public void display(){
        Node workernode = head;
        if(head != null){
            System.out.print("START <=>");
            do{
                System.out.print(" "+ workernode.val + " <=>" );
                workernode = workernode.next;
            }while(workernode!=head);
            System.out.println(" START");
        }
    }

    private class Node{
        private int val;
        private Node next;

        public Node(int val){
            this.val = val;
        }

        public Node(int val, Node setNode){
            this.val = val;
            this.next = setNode;
        }
    }
}
