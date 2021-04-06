package LinkedList.DoublyLinkedList;

public class Node{
	
	public int val;
	public Node prev,next;

	public Node(){}

	public Node(int val, Node next){
		this.val = val;
		this.next = next;
	}

	public Node(int val, Node prev, Node next){
		this.val = val;
		this.prev = prev;
		this.next = next;
	}

}