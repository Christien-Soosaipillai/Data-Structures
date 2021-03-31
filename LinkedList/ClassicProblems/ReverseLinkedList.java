package LinkedList.ClassicProblems;

import LinkedList.*;

class ReverseLinkedList{
	public static void main(String[] args){
		MyLinkedList ll = new MyLinkedList();
		ll.addAtHead(1);
		ll.addAtHead(2);
		ll.addAtHead(3);
		ll.addAtHead(4);
		ll.print();
		ll.head = reverseList(ll.head);
		ll.print();
		
		MyLinkedList ll2 = new MyLinkedList();
		ll2.addAtHead(2);
		ll2.addAtHead(1);
		ll2.print();
		ll2.head = reverseList(ll2.head);
		ll2.print();
	}

	public static Node reverseList(Node head){

		Node previous = null;
		Node current = head;
		Node next = null;

		while(current!=null){
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;

	}
}