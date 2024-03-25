package adi.practice.kunalkushwaha.linkedlist.practicequestions;

public class _2B_L21_sortLinkedListUsingBubbleSort {
    public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
    class Solution {
        // this is bubblesort approach
        public ListNode sortList(ListNode head) {
            ListNode headNode = head;
            ListNode tailNode = getTailNode(head);
            int size = getSize(head);
            return bubbleSort(headNode, tailNode, size-1, 0);
        }

        public ListNode bubbleSort(ListNode headNode, ListNode tailNode, int row, int column){
            if(row < 0){
                return headNode;
            }
            //ListNode curListStart = headNode;
            if(column<row){
                ListNode first = getNode(headNode, column);
                ListNode second = getNode(headNode, column+1);
                if(first.val>second.val){
                    //case 1
                    if(first == headNode){
                        headNode = second;
                        first.next = second.next;
                        second.next = first;
                    }
                    //case2
                    else if(second == tailNode){
                        ListNode prev = getNode(headNode, column-1);
                        tailNode = first;
                        first.next = null;
                        second.next = first;
                        prev.next = second;
                    } else {
                        ListNode prev = getNode(headNode, column-1);
                        prev.next = second;
                        first.next = second.next;
                        second.next = first;
                    }
                }
                return bubbleSort(headNode, tailNode, row, column+1);
            } else {
                return bubbleSort(headNode, tailNode, row-1, 0);
            }
        }

        public ListNode getNode(ListNode headNode, int index){
            while(headNode!=null && index>0){
                headNode = headNode.next;
                index--;
            }
            return headNode;
        }

        public int getSize(ListNode headNode){
            int ctr = 0;
            while(headNode!=null){
                headNode = headNode.next;
                ctr++;
            }
            return ctr;
        }

        public ListNode getTailNode(ListNode headNode){
            while(headNode!=null && headNode.next!=null){
                headNode = headNode.next;
            }
            return headNode;
        }
    }
}
