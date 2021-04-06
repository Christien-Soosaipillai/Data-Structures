package LinkedList.SinglyLinked.ListTwoPointerTechnique;

import LinkedList.*;
import java.util.*;

class CycleIntersection{
	public static void main(String[] args){
		MyLinkedList ll = new MyLinkedList();
		ll.addAtHead(1);
		ll.addAtHead(2);
		ll.addAtHead(3);
		ll.addAtHead(4);
		ll.addAtHead(5);
		ll.addAtHead(6);

		MyLinkedList ll2 = new MyLinkedList();
		ll2.addAtHead(3);
		ll2.addAtHead(2);
		ll2.addAtHead(1);

		ll2.head.next.next = ll.head.next.next.next;

		System.out.println("Printing first LinkedList");
		Node a = ll.head;
		while(a != null){
			System.out.print(a.val + "->");
			a = a.next;
		}

		System.out.println("\nPrinting second LinkedList");
		a = ll2.head;
		while(a != null){
			System.out.print(a.val + "->");
			a = a.next;
		}		

		System.out.println("\nDoes LinkedList 1 intersect with LinkedList 2: ");
		Node intersectedNode = masterGetIntersectionNode(ll.head, ll2.head);
		System.out.println(intersectedNode == null ? "No intersection detected" : "Intersection at Node " + intersectedNode.val);


	}


	public static Node getIntersectionNode(Node headA, Node headB) {
        Set<Node> set = new HashSet<>();
        Node a = headA;
        Node b = headB;
        boolean aFirst = true;
        while(a != null && b!= null){
            if(aFirst){
                if(set.contains(a)){
                    return a;
                }else{
                    set.add(a);
                    a = a.next;
                    aFirst = false;
                }
            }else{
                if(set.contains(b)){
                    return b;
                }else{
                    set.add(b);
                    b = b.next;
                    aFirst = true;
                }
            }
        }
        
        while(a != null){
            if(set.contains(a)){
                return a;
            }else{
                set.add(a);
                a = a.next;
            }
        }
        
        while(b != null){
            if(set.contains(b)){
                return b;
            }else{
                set.add(b);
                b = b.next;
            }
        }
        
        return null;
        
    }

	public static Node masterGetIntersectionNode(Node headA, Node headB) {
		
		//find the length of linkedList at headA
		Node a = headA;
		int countA = 0;
		while(a != null){
			countA++;
			a=a.next;
		}

		//find the length of linkedList at headB
		Node b = headB;
		int countB = 0;
		while(b != null){
			countB++;
			b=b.next;
		}


		//if either are 0 then no intersection occurs and can return null;
		if(countA == 0 || countB == 0){
			return null;
		}


		//if countA beginning path is bigger we need to offset it and move it up
		if(countA > countB){
			for(int i = 0; i < (countA-countB); i++){
				headA = headA.next;
			}
		//if countB beginning path is bigger we need to offset it and move it up	
		}else if(countA < countB){
			for(int i = 0; i < (countB-countA); i++){
				headB = headB.next;
			}
		}

		//Finally since both are aligned we can move both node at the same rate till they are equal
		while(headA != null){
			if(headA == headB){
				return headA;
			}else{
				headA=headA.next;
				headB=headB.next;
			}
		}
		//otherwise they are 2 independent paths with no intersection and we return null
		return null;
    }
}