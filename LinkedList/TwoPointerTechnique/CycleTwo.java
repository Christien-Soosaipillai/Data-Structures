package LinkedList.TwoPointerTechnique;

import LinkedList.*; 
import java.util.*;


class CycleTwo{
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
		
		Node list1Node = masterDetectCycle(ll.head);
		System.out.println("Does list1 have a cycle if so which node does it occur at: ");
		System.out.println(list1Node == null ? "No cycle detected" : "Cycle at " + list1Node.val);

		Node list2Node = masterDetectCycle(ll2.head);
		System.out.println("Does list2 have a cycle if so which node does it occur at: ");
		System.out.println(list2Node == null ? "No cycle detected" : "Cycle at " + list2Node.val);
	}

	public static Node detectCycle(Node head) {
        //if Node is null
        if(head == null){
            return null;
        }
        Node a = head;                              
        Set<Node> set = new HashSet<>();

        while(a!=null){   //check 2 nodes ahead for the fast node each time
            if(set.contains(a)){
                return a;
            }else{
                set.add(a);
            }
            a=a.next;                                   //set slow node pace                       
        } 
        return null;                                    //exists meaning end of list so no cycle
    }

    public static Node masterDetectCycle(Node head){
    	if (head == null || head.next == null) {
	        return null;   // no circle
	    }
	    Node slow = head, fast = head;
	    while (fast != null && fast.next != null) {
	        fast = fast.next.next;
	        slow = slow.next;
	        if (fast == slow) {  // circle detected
	            while (head != fast) {
	                fast = fast.next;
	                head = head.next;
	            }
	            return head;
	        }
	    }
	    return null; // no circle
    }
}
