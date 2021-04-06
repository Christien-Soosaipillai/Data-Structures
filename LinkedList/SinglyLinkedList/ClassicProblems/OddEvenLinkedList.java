package LinkedList.SinglyLinkedList.ClassicProblems;

import LinkedList.*;

class OddEvenLinkedList{
	public static void main(String[] args){
		MyLinkedList ll = new MyLinkedList();
		ll.addAtHead(8);
		ll.addAtHead(7);
		ll.addAtHead(6);
		ll.addAtHead(5);
		ll.addAtHead(4);
		ll.addAtHead(3);
		ll.addAtHead(2);
		ll.addAtHead(1);
		System.out.println("Before odd even re-arrange: ");
		ll.print();
		ll.head = oddEvenRearrange(ll.head);
		System.out.println("After odd even re-arrange: ");
		ll.print();

		MyLinkedList ll2 = new MyLinkedList();
		ll2.addAtHead(7);
		ll2.addAtHead(4);
		ll2.addAtHead(6);
		ll2.addAtHead(5);
		ll2.addAtHead(3);
		ll2.addAtHead(1);
		ll2.addAtHead(2);
		System.out.println("Before odd even re-arrange: ");
		ll2.print();
		ll2.head = oddEvenRearrange(ll2.head);
		System.out.println("After odd even re-arrange: ");
		ll2.print();
	}

	public static Node oddEvenRearrange(Node head){

		//safety case for empty list
		if(head == null){
			return head;
		}

		Node odd = head;
		Node even = head.next;
		Node evenStart = head.next;

		while(even!=null && even.next!=null){
			odd.next = even.next;
			odd = odd.next;
			even.next = odd.next;
			even = even.next;
		}
		odd.next = evenStart;
		return head;
	}
}