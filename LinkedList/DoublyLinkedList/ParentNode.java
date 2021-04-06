package LinkedList.DoublyLinkedList;

public class ParentNode{
	
	public ParentNode prev,next,child;
	public int val;

	public ParentNode(){}

	public ParentNode(int val){
		this.val = val;
	}

	public ParentNode(int val, ParentNode prev, ParentNode next, ParentNode child){
		this.val = val;
		this.prev = prev;
		this.next = next;
		this.child = child;
	}

}