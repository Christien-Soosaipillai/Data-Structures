import java.util.*;

class LinkedListBasic{
    public static void main(String[] args){
        MyLinkedList ll = new MyLinkedList();
        // ll.addAtHead(7);
        // ll.addAtHead(2);
        // ll.addAtHead(1);
        // ll.addAtIndex(3,0);
        // ll.deleteAtIndex(2);
        // ll.addAtHead(6);
        // ll.addAtTail(4);
        // System.out.println("Value at index 1 is: " + ll.get(4) + "\n");
        // ll.addAtHead(4);
        // ll.addAtIndex(5,0);
        // ll.addAtHead(6);
        // System.out.println("Value at index 1 is: " + ll.get(1) + "\n");

        ll.addAtHead(0);
        ll.addAtIndex(1,4);
        System.out.println("Value at index 1 is: " + ll.get(1) + "\n");
        ll.deleteAtIndex(0);
        System.out.println("Value at index 1 is: " + ll.get(0) + "\n");
    }
}