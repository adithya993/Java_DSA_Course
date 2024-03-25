package adi.practice.kunalkushwaha.linkedlist.practicequestions;

public class InPlaceReversalOfPartOfLinkedList {
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

        public void reverseBetween(int left, int right) {
            if(left == right){
                return;
            }
            Node previous = null;
            Node current = head;
            // move until the start of the sublist to place current node on the start
            for(int i = 0; current!= null && i < left - 1; ++i){
                previous = current;
                current = current.next;
            }

            //store the last regular node before sublist start
            Node lastRegular = previous;

            //store the sublist start node to map it to remaining regular nodes after reversal
            Node startAgainFromHere = current;

            //we now have previous, current, set next to start inplace list reversal
            Node next = current.next;
            for(int i = 0;current != null && i < right - left + 1; ++i){
                current.next = previous;
                previous = current;
                current = next;
                if(next!=null){
                    next = next.next;
                }
            }

            //update the next node pointer of lastRegular node
            if(lastRegular != null){
                lastRegular.next = previous;
            } else {
                head = previous;
            }

            //update the next node pointer for
            startAgainFromHere.next = current;
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
        llist1.insertAtLastPosition(3);
        llist1.insertAtLastPosition(2);
        llist1.insertAtLastPosition(8);
        llist1.insertAtLastPosition(17);
        llist1.insertAtLastPosition(44);
        llist1.displayLinkedList();
        llist1.reverseBetween(2,4);
        llist1.displayLinkedList();
    }
}