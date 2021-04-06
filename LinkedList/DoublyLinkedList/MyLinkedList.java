package LinkedList.DoublyLinkedList;

public class MyLinkedList{
	
	public Node head;

	public MyLinkedList(){
		this.head = null;
	}

	public void addAtHead(int val){
		if(head == null){
			head = new Node(val,null,null);
		}else{
			Node node = new Node(val,null,null);
			node.next = head;
			head = node;	
		}
        
	}

	public void addAtTail(int val){
        
        if(head == null){
            head = new Node(val,null,null);
        }
        
		Node current = head;
		while(current.next!=null){
			current = current.next;
		}
		Node node = new Node(val, null, null);
		current.next = node;
		node.prev = current;
        
	}

	public void addAtIndex(int index, int val){
		int originalIndex = index;
		if(index == 0){
			addAtHead(val);
            return;
		}

		Node current = head;
		while(current != null && index > 1){
			current = current.next;
			index--;
		}
		if(index > 1){
			System.out.println("Failed to add new Node " + val + " at index " + originalIndex);
		}else if(current!=null){
			Node nextListNode = current.next;
			Node node = new Node(val,current,nextListNode);
            current.next = node;
            if(nextListNode!=null){
                nextListNode.prev = node;
            }
		}
        
	}

	public int get(int index){
		int originalIndex = index;
		Node current = head;

		while(current!=null && index>0){
			current = current.next;
			index--;
		}
		if(index == 0 && current!=null){
			System.out.println("Value at index " + originalIndex + " is " + current.val);
            return current.val;
		}else{
			System.out.println("Failed to get Node value at index " + originalIndex);
            return -1;
		}
	}

	public void deleteAtIndex(int index){

		if(head == null){
			return;
		}

		if(index == 0){
			head = head.next;
			if(head!=null){
				head.prev = null;
			}
            return;
		}

		Node current = head;
		while(current!=null && index > 1){
			current=current.next;
			index--;
		}

		if(current.next!=null && index == 1){
			current.next = current.next.next;
			Node after = current.next;
			if(after!=null){
				after.prev = current;
			}
		}

	}

	public void print(){
		Node current = head;
		while(current!=null){
			System.out.print(current.val+ "->");
			current = current.next;   
		}
		System.out.print("null\n");
	}

}
