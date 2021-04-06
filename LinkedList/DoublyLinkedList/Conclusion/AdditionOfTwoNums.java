package LinkedList.DoublyLinkedList.Conclusion;

import LinkedList.DoublyLinkedList.*;

class AdditionOfTwoNums{
	public static void main(String[] args){

		MyLinkedList ll = new MyLinkedList();
		MyLinkedList ll2 = new MyLinkedList();

		ll.addAtHead(9);
		ll.addAtHead(9);
		ll.addAtHead(9);
		ll.addAtHead(9);

		ll2.addAtHead(9);
		ll2.addAtHead(9);
		ll2.addAtHead(9);

		System.out.println("Lists before addition: ");
		System.out.print("List 1: " );
		ll.print();
		System.out.print("List 2: " );
		ll2.print();

		Node merged = addTwoLists(ll.head,ll2.head);

		ll.head = merged;
		System.out.println("Final sum as singular linked list: ");
		ll.print();

	}

	public static Node addTwoLists(Node l1, Node l2){

		if(l1 == null && l2 == null){
			return null;
		}
		if(l1 == null && l2 != null){
			return l2;
		}
		if(l1 != null && l2 == null){
			return l1;
		}
        
        Node current = l1;
        Node total = current;
        int carry = 0;
        
        
        while(l1 != null || l2 != null){
            int l1val = l1 != null ? l1.val : 0;
            int l2val = l2 != null ? l2.val : 0;
            current.val = l1val+l2val+carry;
            if(current.val >= 10){
                carry = current.val/10;
                current.val = current.val%10;
            }else{
                carry = 0;
            }   
            
            l1 = l1 !=null ? l1.next : null;
            l2 = l2 !=null ? l2.next : null;
            if(l1 != null || l2 != null){
                current.next = new Node();
                current = current.next;                
            }
        }
        
        if(carry > 0){
            current.next = new Node(carry, null);
        }
        
        return total;

	}

}