package LinkedList.DoublyLinkedList.Conclusion;

import LinkedList.DoublyLinkedList.*;

class MergeLinkedLists{
	public static void main(String[] args){
		MyLinkedList ll = new MyLinkedList();
		MyLinkedList ll2 = new MyLinkedList();

		ll.addAtHead(4);
		ll.addAtHead(2);
		ll.addAtHead(1);

		ll2.addAtHead(5);
		ll2.addAtHead(3);
		ll2.addAtHead(0);
		System.out.println("Lists before ordered merge: ");
		System.out.print("List 1: " );
		ll.print();
		System.out.print("List 2: " );
		ll2.print();
		Node merged = mergeLists(ll.head,ll2.head);
		System.out.print("Ordered Merged List : ");
		while(merged!=null){
			System.out.print(merged.val+ "->");
			merged= merged.next;
		} 
		System.out.print("null\n");
	}

	public static Node mergeLists(Node l1, Node l2){

		if(l1 == null && l2 == null){
			return null;
		}
		if(l1 == null && l2 != null){
			return l2;
		}
		if(l1 != null && l2 == null){
			return l1;
		}

		Node current = null;
		Node merged = null;
		if(l1.val<=l2.val){
			current = l1;
			l1 = l1.next;
		}else{
			current=l2;
			l2=l2.next;
		}
		merged = current;

		while(l1 != null && l2 != null){
			if(l1.val<=l2.val){
				current.next = l1;
				current = current.next;
				l1 = l1.next;
			}else{
				current.next=l2;
				current = current.next;
				l2 = l2.next;
			}	
		}

		while(l1!=null){
			current.next = l1;
			current = current.next;
			l1 = l1.next;
		}
		while(l2!=null){
			current.next=l2;
			current = current.next;
			l2 = l2.next;
		}
		return merged;
	}

}