package LinkedList.SinglyLinkedList.ClassicProblems;

import LinkedList.*;
import java.util.*;

class PalindromeList{
	public static void main(String[] args){
		MyLinkedList ll = new MyLinkedList();
		ll.addAtHead(1);
		ll.addAtHead(2);
		ll.addAtHead(3);
		ll.addAtHead(4);
		ll.addAtHead(5);
		ll.addAtHead(4);
		ll.addAtHead(3);
		ll.addAtHead(2);
		ll.addAtHead(1);

		// ll.addAtHead(1);


		ll.print();
		System.out.println("Is LinkedList a Palindrome: " + isPalindromeUsingStack(ll.head));

	}

	//Two pass method
	public static boolean isPalindromeUsingStack(Node head){

		if(head == null){
			return false;
		}

		Node current = head;
		Stack<Node> stack = new Stack<>();

		while(current!= null){
			stack.push(current);
			current = current.next;
		}
		current = head;
		while(current!= null){
			if(current.val != stack.pop().val){
				return false;
			}
			current = current.next;
		}

		return true;

	}

	//One pass method
	public static boolean isPalindrome(Node head){

		Node fast = head;
		Node slow = head;

		while(fast!=null && fast.next!= null){
			fast = fast.next.next;
			slow = slow.next;
		}

		Node previous = null;
		Node current = slow;
		Node next = null;

		while(current!= null){
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}

		slow = head;
		while(previous!=null){
			if(previous.val != slow.val){
				return false;
			}
			previous = previous.next;
			slow = slow.next;
		}
		return true;
	}

}