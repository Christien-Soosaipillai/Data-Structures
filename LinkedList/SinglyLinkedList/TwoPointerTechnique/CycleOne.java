package LinkedList.TwoPointerTechnique;

import LinkedList.*; 

class CycleOne{
	public static void main(String[] args){

        MyLinkedList ll = new MyLinkedList();
		ll.addAtHead(2);
		ll.addAtHead(3);
		ll.addAtHead(4);
		ll.addAtHead(5);
		ll.addAtHead(6);
		ll.addAtHead(7);

		ll.head.next.next.next.next.next = ll.head.next.next;
		
		MyLinkedList ll2 = new MyLinkedList();
		ll2.addAtHead(1);
		ll2.addAtHead(2);
		ll2.addAtHead(3);

		System.out.println("Does the first LinkedList have a cycle: " + hasCycle(ll.head));
		System.out.println("Does the second LinkedList have a cycle: " + hasCycle(ll2.head));
	}

	public static boolean hasCycle(Node head) {
        //if empty
        if(head == null ){
            return false;
        }
        Node a = head;  //slow
        Node b = head;  //fast
        while(b.next != null && b.next.next != null){   //check 2 nodes ahead for the fast node each time
            a=a.next;           //set slow node pace
            b=b.next.next;      //set fast node pace
            if(a==b){           //if values are equal then we have a cycle
                return true;
            }
        } 
        return false;           //exists meaning end of list so no cycle
    }


}