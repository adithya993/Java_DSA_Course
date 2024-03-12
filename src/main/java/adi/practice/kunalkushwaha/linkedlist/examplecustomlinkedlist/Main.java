package adi.practice.kunalkushwaha.linkedlist.examplecustomlinkedlist;

public class Main {
    public static void main(String[] args) {
        CustomLinkedList llist = new CustomLinkedList();
        llist.insertAtFirstPosition(3);
        llist.insertAtFirstPosition(2);
        llist.insertAtFirstPosition(8);
        llist.insertAtFirstPosition(17);
        llist.insertAtLastPosition(99);
        llist.insertAtMiddlePositions(100,5);
        llist.insertAtMiddlePositions(0,0);
        llist.insertAtMiddlePositions(7,7);
        llist.displayLinkedList();
        llist.deleteAtFirst();
        llist.displayLinkedList();
        llist.deleteAtLastPosition();
        llist.displayLinkedList();
        llist.deleteAtMiddlePosition(4);
        llist.displayLinkedList();
    }
}
