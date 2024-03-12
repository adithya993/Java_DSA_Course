package adi.practice.kunalkushwaha.linkedlist.examplecustomdoublylinkedlist;

import adi.practice.kunalkushwaha.linkedlist.examplecustomlinkedlist.CustomLinkedList;

public class Main {
    public static void main(String[] args) {
        CustomDoublyLinkedList llist = new CustomDoublyLinkedList();
        llist.insertAtFirstPosition(3);
        llist.insertAtFirstPosition(2);
        llist.insertAtFirstPosition(8);
        llist.insertAtFirstPosition(17);
        llist.insertAtLastPosition(99);
        llist.insertAtMiddlePositions(100,3);
        llist.insertAtMiddlePositions(0,0);
        llist.insertAtMiddlePositions(7,7);
        llist.displayDoublyLinkedList();
        llist.displayDoublyLinkedListInReverse();
        llist.deleteAtFirst();
        llist.displayDoublyLinkedList();
        llist.displayDoublyLinkedListInReverse();
        llist.deleteAtLastPosition();
        llist.displayDoublyLinkedList();
        llist.displayDoublyLinkedListInReverse();
        llist.deleteAtMiddlePosition(4);
        llist.displayDoublyLinkedList();
        llist.displayDoublyLinkedListInReverse();
    }
}
