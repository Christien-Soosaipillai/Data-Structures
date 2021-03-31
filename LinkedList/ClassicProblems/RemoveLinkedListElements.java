package LinkedList.ClassicProblems;

import LinkedList.*;

class RemoveLinkedListElements{
	public static void main(String[] args){
		MyLinkedList ll = new MyLinkedList();
		ll.addAtHead(6);
		ll.addAtHead(6);
		ll.addAtHead(5);
		ll.addAtHead(7);
		ll.addAtHead(6);
		ll.addAtHead(2);
		ll.addAtHead(6);
		System.out.println("Before value removal");
		ll.print();
		ll.head = removeElements(ll.head,6);
		System.out.println("After value removal");
		ll.print();
	}


	public static Node removeElements(Node head, int val){

		System.out.println("Removing the value " + val + " from List");

		if(head == null){										//safety check for empty list being passed
			return head;
		}

		Node current = head;
		Node previous = null;

		while(current != null && current.next!=null){			//check current Node and next Node
			if(current.val == val){								
				if(previous == null){							//checks for first Node and onward being all val
					head = head.next;							//erases the first n nodes that have val
				}else{										
					previous.next = current.next;				//otherwise normal skip 
				}
			}else{
				previous = current;								//we can assign previous only to nodes not equal to val
			}
			current = current.next;
		}
		if(current.val == val){									//One more check like in while loop
			if(previous == null){
				head = head.next;
			}else{
				previous.next = current.next;
			}
		}
		return head;

	} 
}