package LinkedList.TwoPointerTechnique;

import LinkedList.*;
import java.util.*;

class RemoveFromEnd{
	public static void main(String[] args){
		MyLinkedList ll = new MyLinkedList();
		ll.addAtHead(2);
		ll.addAtHead(3);
		ll.addAtHead(4);
		ll.addAtHead(5);
		ll.addAtHead(6);
		ll.addAtHead(7);
		ll.print();	
		// removeNthFromEnd(ll.head, 1);
		ll.head = masterRemoveNthFromEnd(ll.head,2);

		ll.print();
	}

	public static Node removeNthFromEnd(Node head, int n) {
		Node a = head;
		int count = 0;
		
		while(a!=null){
			count++;
			a=a.next;
		}
		
		//Get Iterations amount to travel to exact position to be deleted
		a=head;
		int iterations = count - n;
		
		//if we are deleting from beginning of the list
		if(head != null && iterations == 0){
			head = head.next;
			return head;
		}
		
		for(int i = 0; i < iterations-1; i++){
			a=a.next;  
		}
		
		a.next = a.next.next;
		return head;
	}

	public static Node masterRemoveNthFromEnd(Node head, int n) {
		Node start = head;
		Node iter = head;

		if(head.next == null && n == 1){
			head = null;
			return head;
		}


		while(iter!=null && n > 0){
			iter = iter.next;
			n--;
		}



		while(iter!=null && iter.next!=null){
			start=start.next;
			iter=iter.next;
		}
		start.next = start.next.next;
		return head;
	}
}

