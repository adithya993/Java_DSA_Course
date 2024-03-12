package adi.practice.kunalkushwaha.linkedlist.examplecircularlinkedlist;

import adi.practice.kunalkushwaha.linkedlist.examplecustomdoublylinkedlist.CustomDoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        CustomCircularLinkedList llist = new CustomCircularLinkedList();
        llist.insertAtFirstPosition(3);
        llist.insertAtFirstPosition(2);
        llist.insertAtFirstPosition(8);
        llist.insertAtFirstPosition(17);
        llist.display();
        llist.insertAtLastPosition(99);
        llist.display();
        llist.insertAtLastPosition(123);
        llist.display();
        llist.delete(2);
        llist.display();
        llist.delete(17);
        llist.display();
        llist.delete(123);
        llist.display();
        llist.delete(3);
        llist.display();
        llist.delete(3);
        llist.display();
        /*llist.insertAtMiddlePositions(100,3);
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
        llist.displayDoublyLinkedListInReverse();*/
    }
}
