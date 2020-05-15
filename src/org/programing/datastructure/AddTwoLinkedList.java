package org.programing.datastructure;


class ListNode {
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class AddTwoLinkedList {



	class Solution {

		public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

			ListNode   temp = l1;
			ListNode   temp2 = l2;
			ListNode   head = null;
			ListNode   curr = null;
			int carry = 0;     
			int sum = 0;

			while(temp!=null && temp2!=null){
				sum = temp.val + temp2.val + carry;
				if(sum < 10){
					if(head==null){
						head = new ListNode(sum, null);
						curr = head;
						carry = 0;
					}else{
						curr.next = new ListNode(sum,null);
						curr = curr.next;
					}
				}else{
					int r = sum % 10;
					curr.next = new ListNode(r, null);
					curr = curr.next;
					carry = 1;                   
				}
				temp =  temp.next;
				temp = temp2.next;
			}

			while(temp!=null){
				sum = temp.val + carry;
				if(sum < 10){
					if(head==null){
						head = new ListNode(sum, null);
						curr = head;
						carry = 0;
					}else{
						curr.next = new ListNode(sum,null);
						curr = curr.next;
					}
				}else{
					int r = sum % 10;
					curr.next = new ListNode(r, null);
					curr = curr.next;
					carry = 1;                   
				}

			}

			temp =  temp.next;  
			
			return temp;
		}
	}
}



