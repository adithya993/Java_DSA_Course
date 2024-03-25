package adi.practice.kunalkushwaha.linkedlist.practicequestions;

public class _2A_L21_sortLinkedListUsingMergeSort {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    class Solution {
        public ListNode sortList(ListNode head) {
            // this is merge sort approach
            if(head == null || head.next == null){
                return head;
            }

            ListNode middle = getMiddle(head);

            ListNode leftList = sortList(head);
            ListNode rightList = sortList(middle);
            return merge2LinkedList(leftList, rightList);
        }

        public ListNode merge2LinkedList(ListNode list1, ListNode list2){
            ListNode temp = new ListNode();
            ListNode tail = temp;

            while(list1 != null && list2 != null){
                if(list1.val < list2.val){
                    tail.next = list1;
                    list1 = list1.next;
                    tail = tail.next;
                } else {
                    tail.next = list2;
                    list2 = list2.next;
                    tail = tail.next;
                }
            }
            tail.next = list1!=null?list1:list2;
            return temp.next;
        }

        public ListNode getMiddle(ListNode startingNode){
            ListNode previous = null;
            ListNode slow = startingNode;
            ListNode fast = startingNode;
            while(fast!=null && fast.next!=null){
                previous = slow;
                slow = slow.next;
                fast = fast.next.next;
            }
            previous.next = null;
            return slow;
        }
    }
}
