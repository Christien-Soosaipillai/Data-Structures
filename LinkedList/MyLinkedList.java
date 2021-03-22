package com.christien.coredatastructures;

class MyLinkedList {

    public Node head;

    /** Initialize your data structure here. */
    public MyLinkedList() {
        this.head = null;
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if(head==null){
            //list is empty
            return -1;
        }
        Node currentNode = head;
        while(currentNode!= null && index > 0){
            currentNode = currentNode.next;
            index--;
        }
        return currentNode!=null ? currentNode.val : -1;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        // System.out.println("Adding at head value " + val);
        if(head == null) {
            head = new Node(val, null);
        } else {
            Node node = new Node(val, head);
            head = node;
        }
        // print();
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        // System.out.println("Adding at tail value " + val);
        if(head == null){
            Node node = new Node(val,null);
            head = node;
            return;
        }
        Node currentNode = head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = new Node(val,null);;
        // print();
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        // System.out.println("Adding at index: " + index + ", val:" + val);
        if(index == 0){
            addAtHead(val);
            return;
        }
        Node currentNode = head;
        while(currentNode != null && index > 1){
            currentNode = currentNode.next;
            index--;
        }
        if(currentNode != null){
            Node insertedNode = new Node(val, currentNode.next);
            currentNode.next = insertedNode;
        }
        // print();

    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        // System.out.println("Deleting at index: " + index);
        if(head != null && index == 0){
            // System.out.println("Only one item");
            head = head.next;
            // print();
            return;
        }
        Node currentNode = head;
        while(currentNode != null && index > 1){
            currentNode = currentNode.next;
            index--;
        }
        if(currentNode != null && currentNode.next!=null){
            currentNode.next = currentNode.next.next;
        }
        // print();

    }

    // public void print(){
    //     Node n = head;
    //     System.out.print("Current LinkedList: ");
    //     while(n != null){
    //         System.out.print("[" + n.val + "]->");
    //         n = n.next;
    //     }
    //     System.out.print("null\n");
    // }

    class Node{
        public int val;
        public Node next;

        public Node(int val, Node node){
            this.val = val;
            this.next = node;
        }

    }
}