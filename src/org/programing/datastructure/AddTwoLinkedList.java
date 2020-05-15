package org.programing.datastructure;


class ListNode {
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class AddTwoLinkedList {

	//Solution 1:
	
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
					}else{
						curr.next = new ListNode(sum,null);
						curr = curr.next;
					}
					carry=0;
				}else{
					int r = sum % 10;
					if(head==null){
						head = new ListNode(r, null);
						curr = head;
					}else{			
					curr.next = new ListNode(r, null);
					carry = 1;                   
				 }
				}
				curr = curr.next;
				temp =  temp.next;
				temp2 = temp2.next;
			}
			
			if(temp==null&&temp2==null){
				if(carry==1)
					curr.next = new ListNode(1,null);
			}
   
			while(temp!=null){
				sum = temp.val + carry; 
				if(sum < 10){
					curr.next = new ListNode(sum,null);
					curr  = curr.next;
					carry = 0;
					}else{
					int r = sum % 10;
					curr.next = new ListNode(r, null);
					curr = curr.next;
					carry = 1;                   
				}

			temp =  temp.next;  
			if(temp==null)
				if(carry==1)
					curr.next = new ListNode(1,null);
			}
			
			while(temp2!=null){
				sum = temp2.val + carry; 
				if(sum < 10){
					curr.next = new ListNode(sum,null);
					curr  = curr.next;
					carry = 0;
					}else{
					int r = sum % 10;
					curr.next = new ListNode(r, null);
					curr = curr.next;
					carry = 1;                   
				}

			temp2 =  temp2.next; 
			if(temp2==null)
				if(carry==1)
					curr.next = new ListNode(1,null);
			}
					
			return head;
		}
	//Solution 2:
		
		public ListNode addTwoNumbers_2(ListNode l1, ListNode l2) {

			ListNode   temp = l1;
			ListNode   temp2 = l2;
			ListNode   head = null;
			ListNode   curr = null;
			int carry = 0;     
			int sum = 0;

			while(temp!=null && temp2!=null){
				sum = temp.val + temp2.val + carry;
				if(sum < 10){
					temp.val = sum;
					temp2.val = sum;
					if(head==null){					
						head = l1;					
						carry = 0;
					}
				}else{
					int r = sum % 10;
					temp.val  = r;
					temp2.val = r;
					carry = 1;                   
				}
				
				if(temp.next==null)
					curr = temp;
				
				if(temp2.next==null)
					curr =temp2;
				
				temp =  temp.next;
				temp2 = temp2.next;
			}
			
			if(temp==null&&temp2==null){
				if(carry==1)
					curr.next = new ListNode(1,null);
			}
   
			while(temp!=null){
				sum = temp.val + carry; 
				if(sum < 10){
					curr.next = new ListNode(sum,null);
					curr  = curr.next;
					carry = 0;
					}else{
					int r = sum % 10;
					curr.next = new ListNode(r, null);
					curr = curr.next;
					carry = 1;                   
				}

			temp =  temp.next;  
			if(temp==null)
				if(carry==1)
					curr.next = new ListNode(1,null);
			}
			
			while(temp2!=null){
				sum = temp2.val + carry; 
				if(sum < 10){
					curr.next = new ListNode(sum,null);
					curr  = curr.next;
					carry = 0;
					}else{
					int r = sum % 10;
					curr.next = new ListNode(r, null);
					curr = curr.next;
					carry = 1;                   
				}

			temp2 =  temp2.next; 
			if(temp2==null)
				if(carry==1)
					curr.next = new ListNode(1,null);
			}
					
			return head;
		}
		
		
		
		
}



