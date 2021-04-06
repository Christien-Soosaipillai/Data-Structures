package LinkedList.DoublyLinkedList.Conclusion;

import LinkedList.DoublyLinkedList.*;

class FlattenMultiLevelLinkedList{

	/*
	 1---2---3---4---5---6--NULL
         |
         7---8---9---10--NULL
             |
             11--12--NULL
	*/

	public static void main(String[] args){
		ParentNode n12 = new ParentNode(12,null,null,null);
		ParentNode n11 = new ParentNode(11,null,n12,null);
		ParentNode n10 = new ParentNode(10,null,null,null);
		ParentNode n9 = new ParentNode(9,null,n10,null);
		ParentNode n8 = new ParentNode(8,null,n9,null);
		ParentNode n7 = new ParentNode(7,null,n8,null);
		ParentNode n6 = new ParentNode(6,null,null,null);
		ParentNode n5 = new ParentNode(5,null,n6,null);
		ParentNode n4 = new ParentNode(4,null,n5,null);
		ParentNode n3 = new ParentNode(3,null,n4,null);
		ParentNode n2 = new ParentNode(2,null,n3,null);
		ParentNode n1 = new ParentNode(1,null,n2,null);
		n3.child = n7;
		n8.child = n11;

		System.out.println("List before flattening: ");
		System.out.println("1---2---3---4---5---6--NULL");
		System.out.println("	|");
		System.out.println("	7---8---9---10--NULL");
		System.out.println("	    |");
		System.out.println("	    11---12--NULL");

		System.out.println("List after flattening: ");
		ParentNode node = flatten(n1);
		print(node);


	}

	public static ParentNode flatten(ParentNode head) {
        
        if(head == null){                               //edge case in case list is null
            return head;
        }
        
        ParentNode current = head;
        ParentNode previous = null;                           //track previous node to setup doubly linked list
        ParentNode after = null;                              //keep track of node after parent
        
        while(current!= null){
            if(previous!=null){                         //setting prev for each node
                current.prev = previous;
            }
            if(current.child != null){                  
                if(current.next!=null){                 //keep track of parents next node
                    after = current.next;
                }
                current.next = flatten(current.child);  //recursion to go to child nodes
                current.child = null;                   //Since we read over previous nodes erase childs to avoid infinite loop 
            }
            if(current.next == null && after!=null){
                current.next=after;                     //link parents next after last child
                after = null;                           //reset after in case we come across new child
            }
            previous = current;                         
            current = current.next;    
            
        }
        return head;
        
    }

    public static void print(ParentNode head){
		ParentNode current = head;
		while(current!=null){
			System.out.print(current.val+ "->");
			current = current.next;   
		}
		System.out.print("null\n");
	}


}